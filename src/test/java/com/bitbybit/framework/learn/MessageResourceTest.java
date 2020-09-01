package com.bitbybit.framework.learn;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;

public class MessageResourceTest {
    private static final Logger logger = LoggerFactory.getLogger(MessageResourceTest.class);

    @Test
    void messageResourceTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("messageResource.xml");
        String message = applicationContext.getMessage("message", null, "Default", null);
        String message1 = applicationContext.getMessage("argument.required", new Object[]{"userDao"}, "Required", null);
        logger.info("message = {}", message);
        logger.info("message1 = {}", message1);
    }

    @Test
    void messageResourceI18nTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("messageResource.xml");
        String message = applicationContext.getMessage("argument.required", new Object[]{"userDao"}, "参数", Locale.CHINA);
        logger.info("message = {}", message);
    }
}
