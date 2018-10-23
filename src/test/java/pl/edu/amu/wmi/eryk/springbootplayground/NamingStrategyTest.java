package pl.edu.amu.wmi.eryk.springbootplayground;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import pl.edu.amu.wmi.eryk.springbootplayground.strategy.Model;

import javax.persistence.EntityManager;

import static org.junit.Assert.assertFalse;
import static org.springframework.util.ObjectUtils.isEmpty;

/**
 * Stworzone przez Eryk Mariankowski dnia 23.10.18.
 */
@RunWith(SpringRunner.class)
@TestPropertySource(value = {"/application-dev.properties"})
@EntityScan(value = {"pl.edu.amu.wmi.eryk.springbootplayground.strategy"})
@AutoConfigureDataJpa
@AutoConfigurationPackage
public class NamingStrategyTest {

    @Autowired
    EntityManager entityManager;

    @Test
    public void shouldTestNamingStrategies() {
        Model asd = entityManager.find(Model.class, 1);
        assertFalse(isEmpty(asd.getWydPlanUKl()));
    }

}
