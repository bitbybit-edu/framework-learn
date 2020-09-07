package com.bitbybit.framework.learn.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author liulin
 */
@ComponentScan("com.bitbybit.framework.learn.event")
public class EventOrderMainClass {
    public static class Event {
        String name;

        public Event(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    @Component
    static class Listener {
        @EventListener
        @Order(2)
        public void listen(EventOrderMainClass.Event event) {
            System.out.println("接收到事件:" + event);
            System.out.println("处理事件");
        }

        @EventListener
        @Order(1)
        public void listen2(EventOrderMainClass.Event event) {
            System.out.println("接收到事件2:" + event);
            System.out.println("处理事件2");
        }
    }

}
