package com.bitbybit.framework.learn.auto.inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulin
 */
public class DMZService {
    private static final Logger logger = LoggerFactory.getLogger(DMZService.class);
    public void say() {
        logger.info("DMZSerivice say");
    }
}
