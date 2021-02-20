package com.ydd.Spring5.test;

import com.ydd.Spring5.aopAnnotatoin.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/31 17:16
 * @Description:
 */
public class TestAop
{
    @Test
    public void testAopAnnotation(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
