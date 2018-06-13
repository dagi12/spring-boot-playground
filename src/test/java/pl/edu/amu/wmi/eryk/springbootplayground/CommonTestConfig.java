package pl.edu.amu.wmi.eryk.springbootplayground;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.context.annotation.Configuration;

/**
 * Stworzone przez Eryk Mariankowski dnia 07.05.18.
 */
@Configuration
@EntityScan({"pl.edu.amu.wmi.eryk"})
@AutoConfigureDataJpa
public class CommonTestConfig {

}
