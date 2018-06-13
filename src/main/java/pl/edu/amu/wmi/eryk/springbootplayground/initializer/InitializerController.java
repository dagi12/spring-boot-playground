package pl.edu.amu.wmi.eryk.springbootplayground.initializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Stworzone przez Eryk Mariankowski dnia 13.06.18.
 */
@RestController
public class InitializerController implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(InitializerController.class);

    // 4
    @Override
    public void afterPropertiesSet() {
        LOGGER.info("afterPropertiesSet");
    }

    // 3
    @PostConstruct
    public void init() {
        LOGGER.info("PostConstruct");
    }

}
