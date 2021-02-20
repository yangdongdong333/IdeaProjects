package com.ydd.spring5.testdemo;

import com.ydd.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/8 22:39
 * @Description:
 */
public class TestAnnotation
{
//纯注解开发
    @Test
    public void testService()
    {
        //1,加载spring配置文件
        ApplicationContext context=new AnnotationConfigApplicationContext("SpringConfig.class");

        //2，获取配置创建的对象
        UserService userService=context.getBean("userService", UserService.class);

        System.out.println(userService);
        userService.add();
    }

}
