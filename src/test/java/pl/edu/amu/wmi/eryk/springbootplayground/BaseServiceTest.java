package pl.edu.amu.wmi.eryk.springbootplayground;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Stworzone przez Eryk Mariankowski dnia 13.06.18.
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {CommonTestConfig.class, BaseService.class})
@TestPropertySource({"/application-dev.properties"})
@AutoConfigurationPackage
public class BaseServiceTest {

    @Autowired
    BaseService baseService;

    @Test
    public void getBase() {
        Base base = baseService.getBase().get(0);
        Assert.assertNotNull(base.nazwa);
    }

    @Test
    public void getBaseExt() {
        BaseExt base = baseService.getBaseExt().get(0);
        Assert.assertNotNull(base.wektor);
    }

}