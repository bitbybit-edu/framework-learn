package com.bitbybit.framework.learn.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面
 *
 * @author liulin
 */
@Component
@Aspect
public class BbbAnnotationAspect {

    /**
     * 定义切点
     */
    @Pointcut("execution(public * *(..))")
    private void executionPointcut() {}

    /**
     * 定义切点
     */
    @Pointcut("@annotation(com.bitbybit.framework.learn.aop.BbbAnnotationAspect)")
    private void annotationPointcut() {}

    // 表示同时匹配满足两者
    @Pointcut("executionPointcut() && annotationPointcut()")
    private void annotationPointcutAnd() {}

    // 满足其中之一即可
    @Pointcut("executionPointcut() || annotationPointcut()")
    private void annotationPointcutOr() {}

    // 不匹配即可
    @Pointcut("!executionPointcut()")
    private void annotationPointcutNot() {}
}
