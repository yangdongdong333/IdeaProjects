package com.ydd.spring5.test;

import com.ydd.spring5.aopAnnotation.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/13 9:03
 * @Description:
 */
public class testAop
{
    @Test
    public void testAdd()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //增强User类的，所以得到的bean需要时User
        User user = context.getBean("user", User.class);
        user.add();

    }

}
