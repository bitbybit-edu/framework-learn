package com.bitbybit.framework.learn.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@ComponentScan("com.bitbybit.framework.learn.event")
public class Main02 {

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

    public static class Event2 {
        String name;

        public Event2(String name) {
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
        public void listen(Event event) {
            System.out.println("接收到事件:" + event);
            System.out.println("处理事件");
        }
    }

    @Component
    static class Listener2 {
        @EventListener
        public void listen(Event2 event) {
            System.out.println("接收到事件:" + event);
            System.out.println("处理事件");
        }
    }
}
