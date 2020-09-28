package com.bitbybit.framework.learn.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 切面
 *
 * @author liulin
 */
@Component
@Aspect
public class BbbAspect {

    /**
     * 定义切点
     */
    @Pointcut("execution(public * *(..))")
    private void executionPointcut() {
    }

    /**
     * 定义切点
     */
    @Pointcut("@annotation(com.bitbybit.framework.learn.aop.BbbAnnotation)")
    private void annotationPointcut() {
    }

    /**
     * 表示同时匹配满足两者
     */
    @Pointcut("executionPointcut() && annotationPointcut()")
    private void annotationPointcutAnd() {
    }

    /**
     * 满足其中之一即可
     */
    @Pointcut("executionPointcut() || annotationPointcut()")
    private void annotationPointcutOr() {
    }

    /**
     * 不匹配即可
     */
    @Pointcut("!executionPointcut()")
    private void annotationPointcutNot() {
    }

    /*-----------------------切点定义完成---------------------------------------------*/

    /**
     * 前置通知，在目标方法前调用
     */
    @Before("executionPointcut()")
    public void executionBefore() {
        System.out.println("execution aspect Before invoke!");
    }

    /**
     * 后置通知，在目标方法返回后调用
     */
    @AfterReturning("executionPointcut()")
    public void executionAfterReturning() {
        System.out.println("execution aspect AfterReturning invoke!");
    }

    /**
     * 最终通知，正常的执行时机在AfterReturning之前
     */
    @After("executionPointcut()")
    public void executionAfter() {
        System.out.println("execution aspect After invoke!");
    }

    /**
     * 异常通知，发生异常时调用
     */
    @AfterThrowing("executionPointcut()")
    public void executionAfterThrowing() {
        System.out.println("execution aspect AfterThrowing invoke!");
    }

    /**
     * 环绕通知，方法调用前后都能进行处理
     * @param pjp
     * @throws Throwable
     */
    @Around("executionPointcut()")
    public void executionAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("execution aspect Around(before) invoke!");
        Object[] args = pjp.getArgs();
        System.out.println(pjp.proceed());
        System.out.println("execution aspect Around(after) invoke!");
    }
}
