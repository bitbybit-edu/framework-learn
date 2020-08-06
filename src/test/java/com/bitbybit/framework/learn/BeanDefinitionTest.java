package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.bean.definition.ChildBean;
import com.bitbybit.framework.learn.bean.definition.ParentBean;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefinitionTest {

    private static final Logger logger = LoggerFactory.getLogger(BeanDefinitionTest.class);

    @Test
    void beanDefinitionTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanDefinition.xml");
//        ParentBean parent = applicationContext.getBean("parent", ParentBean.class);
        ChildBean child = applicationContext.getBean("child", ChildBean.class);

//        logger.info("parent = {}", parent);
        logger.info("child = {}", child);
        logger.info("child.name = {}", child.getName());
    }
}
