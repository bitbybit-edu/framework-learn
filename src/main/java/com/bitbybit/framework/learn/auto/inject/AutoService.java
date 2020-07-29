package com.bitbybit.framework.learn.auto.inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liulin
 */
public class AutoService {
    private static final Logger logger = LoggerFactory.getLogger(AutoService.class);

    DMZService dmzService;

    public void setDmzService(DMZService dmzService) {
        logger.info("注入了dmzService = {}", dmzService);
        this.dmzService = dmzService;
    }

    public void dmzServiceSay() {
        dmzService.say();
    }
}
