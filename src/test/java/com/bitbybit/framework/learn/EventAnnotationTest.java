package com.bitbybit.framework.learn;

import com.bitbybit.framework.learn.event.Main02;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventAnnotationTest {

    @Test
    void eventAnnotationTest() {
        ApplicationEventPublisher publisher = new AnnotationConfigApplicationContext(Main02.class);
        publisher.publishEvent(new Main02.Event("注解事件"));
        publisher.publishEvent(new Main02.Event2("注解事件2"));
        // 程序打印：
        // 接收到事件:注解事件
        // 处理事件
    }


}
