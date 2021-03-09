package com.ydd.Spring5.aopAnnotatoin;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/30 18:42
 * @Description:
 */
//增强的类
@Component  //生成此类的对象
@Aspect  //生成代理对象
public class UserProxy
{
    @Pointcut(value = "execution(* com.ydd.Spring5.aopAnnotatoin.User.add(..)  ")

    //前置通知
    //before注解表示作为前置通知
    @Before(value = "execution(* com.ydd.Spring5.aopAnnotatoin.User.add(..))")
    public void before(){
        System.out.println("before......");
    }

    @After(value = "execution(* com.ydd.Spring5.aopAnnotatoin.User.add(..))")
    public void after(){
        System.out.println("after.......");
    }

    @AfterReturning(value = "execution(* com.ydd.Spring5.aopAnnotatoin.User.add(..))")
    public void afterReturning(){
        System.out.println("AfterReturning.......");

    }

    @AfterThrowing(value = "execution(* com.ydd.Spring5.aopAnnotatoin.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing.......");
    }

    @Around(value = "execution(* com.ydd.Spring5.aopAnnotatoin.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("环绕之前.......");
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后.......");
    }
}
