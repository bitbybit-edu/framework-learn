package com.bitbybit.spring.framework.learn.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Bean3 {
    private static final Logger logger = LoggerFactory.getLogger(Bean3.class);

    public void say() {
        logger.info("Bean3 say hello");
    }
}
