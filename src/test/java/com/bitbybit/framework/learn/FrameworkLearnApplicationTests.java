package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.component.TestApplicationGetBean;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class FrameworkLearnApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(FrameworkLearnApplicationTests.class);

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void contextLoads() {
    }

    @Test
    void applicationContextTest() {
        try {
            TestApplicationGetBean bean = applicationContext.getBean(TestApplicationGetBean.class);
            logger.info("getBean(TestApplicationGetBean.class) = {}", bean);
        } catch (Exception e) {
            logger.error("getBean(TestApplicationGetBean.class) fail", e);
        }

        try {
            TestApplicationGetBean bean = applicationContext.getBean("testApplicationGetBean", TestApplicationGetBean.class);
            logger.info("getBean(\"testApplicationGetBean\", TestApplicationGetBean.class) = {}", bean);
        } catch (Exception e) {
            logger.error("getBean(\"testApplicationGetBean\", TestApplicationGetBean.class) fail", e);
        }

        try {
            Object bean = applicationContext.getBean("testApplicationGetBean");
            logger.info("getBean(\"testApplicationGetBean\") = {}", bean);
        } catch (Exception e) {
            logger.error("getBean(\"testApplicationGetBean\") fail", e);
        }

        try {
            Object bean = applicationContext.getBean("testApplicationGetBeanC");
            logger.info("getBean(\"testApplicationGetBeanC\") = {}", bean);
        } catch (Exception e) {
            logger.error("getBean(\"testApplicationGetBeanC\") fail", e);
        }

    }
}
