package pl.edu.amu.wmi.eryk.springbootplayground.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Stworzone przez Eryk Mariankowski dnia 13.06.18.
 */
@Service
@Transactional
public class BaseService {

    private final EntityManager entityManager;

    @Autowired
    public BaseService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Base> getBase() {
        return all(Base.class);
    }

    public List<BaseExt> getBaseExt() {
        return all(BaseExt.class);
    }

    private <T> CriteriaQuery<T> commonQuery(Class<T> tClass) {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = builder.createQuery(tClass);
        Root<T> variableRoot = query.from(tClass);
        return query.select(variableRoot);
    }

    private  <T> List<T> all(Class<T> tClass) {
        return entityManager
                .createQuery(commonQuery(tClass))
                .getResultList();
    }

}
