package com.bitbybit.spring.framework.learn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Bean2 {
    private static final Logger logger = LoggerFactory.getLogger(Bean2.class);

    public void say() {
        logger.info("Bean2 say hello");
    }
}
