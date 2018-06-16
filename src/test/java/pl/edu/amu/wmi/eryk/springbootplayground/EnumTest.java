package pl.edu.amu.wmi.eryk.springbootplayground;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.amu.wmi.eryk.springbootplayground.base.Base;
import pl.edu.amu.wmi.eryk.springbootplayground.base.BaseService;
import pl.edu.amu.wmi.eryk.springbootplayground.enumtest.BaseName;

import javax.persistence.EntityManager;

/**
 * Stworzone przez Eryk Mariankowski dnia 15.06.18.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {CommonTestConfig.class, BaseService.class})
@TestPropertySource({"/application-dev.properties"})
@AutoConfigurationPackage
@Transactional
public class EnumTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    public void shouldRevealEnumEquationProcess() {
        Base base1 = (Base) entityManager.unwrap(Session.class).createCriteria(Base.class).add(Restrictions.eq("nazwa", BaseName.FLOTA1)).uniqueResult();
        Base base2 = (Base) entityManager.unwrap(Session.class).createCriteria(Base.class).add(Restrictions.eq("nazwa", "FLOTA")).uniqueResult();
        Assert.assertNotNull(base1);
        Assert.assertEquals(base1, base2);
    }

}
