package com.bitbybit.framework.learn.ioc.xml.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Spring官网阅读（一）容器及实例化
 * https://blog.csdn.net/qq_41907991/article/details/103589868
 * @author liulin
 */
public class XmlBean {
    private static final Logger logger = LoggerFactory.getLogger(XmlBean.class);

    public void say() {
        logger.info("xmlBean say hello");
    }
}
