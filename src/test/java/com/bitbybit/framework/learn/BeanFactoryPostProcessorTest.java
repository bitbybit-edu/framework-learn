package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.bean.factory.post.processor.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactoryPostProcessorTest {

    private static final Logger logger = LoggerFactory.getLogger(BeanFactoryPostProcessorTest.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanFactoryPostProcessor.xml");
        DataSource dataSource = applicationContext.getBean("dataSource", DataSource.class);
        logger.info("dataSource = {}", dataSource);
    }
}
