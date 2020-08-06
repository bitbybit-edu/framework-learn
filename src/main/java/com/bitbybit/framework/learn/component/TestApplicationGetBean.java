package com.bitbybit.framework.learn.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TestApplicationGetBean {

    @Autowired
    ApplicationContext applicationContext;

    public void testApplicationContext() {
        System.out.println(applicationContext);
    }

}
