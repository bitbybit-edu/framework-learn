package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.aop.AopConfig;
import com.bitbybit.framework.learn.aop.FunctionCode;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BbbAspectTest {

    @Test
    void bbbAspectTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        FunctionCode bean = applicationContext.getBean(FunctionCode.class);
        bean.sayHello();
    }
}
