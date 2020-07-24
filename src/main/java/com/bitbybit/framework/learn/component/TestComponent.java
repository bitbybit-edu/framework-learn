package com.bitbybit.framework.learn.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class TestComponent {

    @Autowired
    ApplicationContext applicationContext;

    public void testApplicationContext() {
        System.out.println(applicationContext);
    }

}
