package com.bitbybit.framework.learn.ioc.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author liulin
 */
@Configuration
@ComponentScan("com.bitbybit.framework.learn.ioc.annotation")
public class Config {

    @Bean
    public Service getService() {
        return new Service();
    }
}
