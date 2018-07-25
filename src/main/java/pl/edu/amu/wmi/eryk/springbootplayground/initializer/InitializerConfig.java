package pl.edu.amu.wmi.eryk.springbootplayground.initializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Stworzone przez Eryk Mariankowski dnia 13.06.18.
 */
@Configuration
public class InitializerConfig implements InitializingBean {


    private final Holder holder;

    private static final Logger LOGGER = LoggerFactory.getLogger(InitializerConfig.class);

    @Autowired
    public InitializerConfig(Holder holder) {
        this.holder = holder;
    }

    // 2
    @Override
    public void afterPropertiesSet() {
        LOGGER.info(String.valueOf(holder != null));
        LOGGER.info("afterPropertiesSet");
    }

    // 1
    @PostConstruct
    public void init() {
        LOGGER.info(String.valueOf(holder != null));
        LOGGER.info("PostConstruct");
    }

}
