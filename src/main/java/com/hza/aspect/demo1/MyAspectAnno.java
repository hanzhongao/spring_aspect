package com.hza.aspect.demo1;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 切面类
 */
@Aspect
public class MyAspectAnno {

    @Before(value = "myPointcutSave()")
    public void before(JoinPoint joinPoint) {
        System.out.println("前置通知=============================" + joinPoint);
    }

    @AfterReturning(value = "myPointcutDelete()",returning = "result")
    public void afterReturning(Object result) {
        System.out.println("后置通知=============================" + result);
    }

    @Around(value = "myPointcutUpdate()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知===========================");
        Object obj = joinPoint.proceed() ; // 执行目标方法
        System.out.println("环绕后通知===========================");
        return obj ;
    }

    @AfterThrowing(value = "myPointcutFindOne()", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("异常抛出通知=======================" + e);
    }

    @After(value = "myPointcutFindAll()")
    public void after() {
        System.out.println("最终通知=======================");
    }

    @Pointcut(value = "execution(* com.hza.aspect.demo1.ProductDao.save(..))")
    public void myPointcutSave() {}

    @Pointcut(value = "execution(* com.hza.aspect.demo1.ProductDao.update(..))")
    public void myPointcutUpdate() {}

    @Pointcut(value = "execution(* com.hza.aspect.demo1.ProductDao.delete(..))")
    public void myPointcutDelete() {}

    @Pointcut(value = "execution(* com.hza.aspect.demo1.ProductDao.findOne(..))")
    public void myPointcutFindOne() {}

    @Pointcut(value = "execution(* com.hza.aspect.demo1.ProductDao.findAll(..))")
    public void myPointcutFindAll() {}
}













