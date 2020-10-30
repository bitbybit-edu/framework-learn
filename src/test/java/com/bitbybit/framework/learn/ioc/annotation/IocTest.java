package com.bitbybit.framework.learn.ioc.annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {

    @Test
    public void iocAnnotationTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Service getService = applicationContext.getBean("getService", Service.class);
        getService.sayHello();
        Service bean = applicationContext.getBean(Service.class);
        bean.sayHello();
    }
}
