package com.ydd.spring5.testdemo;

import com.ydd.spring5.Book;
import com.ydd.spring5.Orders;
import com.ydd.spring5.User;
import com.ydd.spring5.bean.Emp;
import com.ydd.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/8 22:39
 * @Description:
 */
public class TestBean
{
    public static void main(String[] args)
    {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
    }
    @Test
    public void testBean1()
    {
        //1,加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");

        //2，获取配置创建的对象
        UserService userService=context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void testBean2()
    {
        //1,加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");

        //2，获取配置创建的对象
        Emp emp=context.getBean("emp", Emp.class);
        emp.add();
    }

}
