package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.ioc.xml.bean.XmlBean;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XmlBeanTest {

    private static final Logger logger = LoggerFactory.getLogger(XmlBeanTest.class);

    @Test
    void xmlBeanTest() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("services.xml");
        XmlBean xmlBean = applicationContext.getBean("xmlBean", XmlBean.class);
        xmlBean.say();
    }

}
