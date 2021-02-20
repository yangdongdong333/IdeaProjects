package com.ydd.spring5.aopAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/13 10:03
 * @Description:
 */
@Component
@Aspect
@Order(1)  //数值越小，优先级越高，从0开始
public class PersonProxy
{
    @Before(value = "execution(* com.ydd.spring5.aopAnnotation.User.add(..))")
    public void before()
    {
        System.out.println("person before.....");
    }
}
