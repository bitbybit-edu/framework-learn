package com.bitbybit.framework.learn;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class EventTest {

    private static final Logger logger = LoggerFactory.getLogger(EventTest.class);

    @Test
    void eventTest() {
// 创建一个事件发布器（事件源），为了方便，我这里直接通过传入EventListener.class来将监听器注册到容器中
        ApplicationEventPublisher ac = new AnnotationConfigApplicationContext(EventListener.class);
        // 发布一个事件
        ac.publishEvent(new MyEvent("hello event"));
        // 程序会打印如下：
        // 接收到事件：hello event
        // 处理事件....
    }

    static class MyEvent extends ApplicationEvent {
        public MyEvent(Object source) {
            super(source);
        }
    }

    @Component
    static class EventListener implements ApplicationListener<MyEvent> {
        @Override
        public void onApplicationEvent(MyEvent event) {
            System.out.println("接收到事件：" + event.getSource());
            System.out.println("处理事件....");
        }
    }
}
