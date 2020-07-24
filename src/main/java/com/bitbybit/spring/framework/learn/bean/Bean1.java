package com.bitbybit.spring.framework.learn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {

    private static final Logger logger = LoggerFactory.getLogger(Bean1.class);

    private Bean2 bean2;

    private Bean3 bean3;

    public Bean1() {

    }
    @Autowired
    public void setBean2(Bean2 bean2) {
        this.bean2 = bean2;
    }

    public void say() {
        logger.info("Bean1 say hello");
    }

    public void bean1VarBean2say() {
        bean2.say();
    }



}
