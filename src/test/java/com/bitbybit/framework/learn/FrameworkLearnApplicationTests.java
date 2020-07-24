package com.bitbybit.framework.learn;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
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
        TestComponent bean = applicationContext.getBean(TestComponent.class);
        Object testComponent = applicationContext.getBean("testComponent");
        TestComponent testComponent1 = applicationContext.getBean("testComponent", TestComponent.class);
        logger.info("{} {} {}", bean, testComponent, testComponent1);
    }
}
