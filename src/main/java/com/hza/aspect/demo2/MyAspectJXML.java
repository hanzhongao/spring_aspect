package com.hza.aspect.demo2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Create by hza
 * 2019-09-07 15:02
 */
public class MyAspectJXML {
    // 前置通知
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知============================" + joinPoint);
    }

    // 后置通知
    public void afterReturning(Object obj) {
        System.out.println("后置通知============================" + obj);
    }

    // 环绕通知
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知======================");
        Object obj  = joinPoint.proceed() ;
        System.out.println("环绕后通知======================");
        return obj ;
    }

    // 异常抛出通知
    public void afterThrowing(Throwable throwable) {
        System.out.println("异常抛出通知=====================" + throwable);
    }

    // 最终通知
    public void after() {
        System.out.println("最终通知=====================" );
    }

}
