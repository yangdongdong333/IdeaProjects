package com.ydd.spring5.aopAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/13 8:38
 * @Description:
 */
//增强的类
@Component
@Aspect //标示生成代理对象
@Order(3)
public class UserProxy
{
    //相同切入点的抽取
    @Pointcut(value = "execution(* com.ydd.spring5.aopAnnotation.User.add(..))")
    public void pointCut(){

    }

    //spring5.3.1顺序是@Around前@Before@Around后@AfterReturning@After@Around后
    //前置通知
    @Before(value = "pointCut()")
    public void before()
    {
        System.out.println("before.....");
    }
//在方法执行成功后执行
    @AfterReturning(value = "pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning....");

    }
    //最终（后置）通知，在方法执行之后（不管方法执行成功还是失败)
    @After(value = "pointCut()")
    public void after(){
        System.out.println("after....");

    }
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing(){
        System.out.println("AfterThrowing....");

    }
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("环绕之前....");
        //被增强的方法需要执行
        System.out.println("qian");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后....");

    }
}
