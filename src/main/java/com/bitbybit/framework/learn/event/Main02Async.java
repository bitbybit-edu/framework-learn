package com.bitbybit.framework.learn.event;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

//@EnableAsync
@Configuration
@ComponentScan("com.bitbybit.framework.learn.event")
public class Main02Async {
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
        @Async
        @EventListener
        public void listen(Main02Async.Event event) {
            try {
                Thread.sleep(10 * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("接收到事件:" + event);
            System.out.println("处理事件");
        }
    }

    @Component
    static class Listener2 {

        @Async
        @EventListener
        public void listen(Main02Async.Event2 event) {
            try {
                Thread.sleep(10 * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("接收到事件:" + event);
            System.out.println("处理事件");
        }
    }
}
