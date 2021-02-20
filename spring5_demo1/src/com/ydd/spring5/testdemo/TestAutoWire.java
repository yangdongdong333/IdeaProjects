package com.ydd.spring5.testdemo;


import com.ydd.spring5.Book;
import com.ydd.spring5.Orders;
import com.ydd.spring5.User;
import com.ydd.spring5.autowire.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/8 22:39
 * @Description:
 */
public class TestAutoWire
{

    @Test
    public void testOrders()
    {
        //1,加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("beanOfAutoWire.xml");

        //2，获取配置创建的对象
        Emp emp=context.getBean("emp", Emp.class);

        System.out.println(emp);
        emp.test();
    }

}
