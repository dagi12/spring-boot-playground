package pl.edu.amu.wmi.eryk.springbootplayground.tf;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Stworzone przez Eryk Mariankowski dnia 04.02.19.
 */
@Service
public class CarRentalStatusService {

    private final EntityManager entityManager;

    public CarRentalStatusService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Number getStatus() {
        Query query = entityManager.createNativeQuery("SELECT * FROM zam_f_rental_status2(:dupa)");
        query.setParameter("dupa", "null");
        return (Number) query.getSingleResult();
    }

}
