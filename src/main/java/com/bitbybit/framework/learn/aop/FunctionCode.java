package com.bitbybit.framework.learn.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author liulin
 */
@Component
public class FunctionCode {

    private static final Logger logger = LoggerFactory.getLogger(FunctionCode.class);

    public void sayHello() {
        logger.info("function code say hello");
    }
}
