package com.bitbybit.spring.framework.learn;

import com.bitbybit.spring.framework.learn.bean.Bean1;
import com.bitbybit.spring.framework.learn.bean.Bean2;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {

    @Test
    public void constructorInjectionTest() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.registerBean("bean1", Bean1.class, Bean1::new);
        ac.registerBean("bean2", Bean2.class, Bean2::new);
        ac.refresh();
        Bean1 bean1 = ac.getBean(Bean1.class);
        bean1.say();
        bean1.bean1VarBean2say();
    }
}
