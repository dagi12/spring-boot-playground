package pl.edu.amu.wmi.eryk.springbootplayground.tf;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Stworzone przez Eryk Mariankowski dnia 04.02.19.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableJpaRepositories(value = {"pl.softra.common", "pl.softra.partner"})
@TestPropertySource(value = {"/application-dev.properties"})
@EntityScan(value = {"pl.edu.amu.wmi.eryk"})
@AutoConfigureDataJpa
@AutoConfigurationPackage
@Transactional
public class CarRentalStatusServiceTest {

    @Autowired
    CarRentalStatusService carRentalStatusService;

    @Test
    public void shouldGetStatus() {
        Number list = carRentalStatusService.getStatus();
        Assert.assertFalse(list == null);
    }

}