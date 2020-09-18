package com.bitbybit.framework.learn.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author liulin
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.bitbybit.framework.learn.aop")
public class AopConfig {
}

