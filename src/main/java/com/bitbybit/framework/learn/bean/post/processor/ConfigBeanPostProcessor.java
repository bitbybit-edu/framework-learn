package com.bitbybit.framework.learn.bean.post.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liulin
 */
@Configuration
@ComponentScan("com.bitbybit.framework.learn.bean.post.processor")
public class ConfigBeanPostProcessor {

    @Autowired
    IndexService indexService;
}
