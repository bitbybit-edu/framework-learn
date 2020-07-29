package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.auto.inject.AutoService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoInjectTest {
    private static final Logger logger = LoggerFactory.getLogger(XmlBeanTest.class);

    @Test
    void autoInjectTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("auto.xml");
        AutoService autoService = applicationContext.getBean("autoService", AutoService.class);
        autoService.dmzServiceSay();
    }


}
