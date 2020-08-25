package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.bean.post.processor.ConfigBeanPostProcessor;
import com.bitbybit.framework.learn.config.Config;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostProcessorTest {

    private static final Logger logger = LoggerFactory.getLogger(BeanPostProcessorTest.class);

    @Test
    void beaPostProcessorTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigBeanPostProcessor.class);


    }
}
