package com.ydd.spring5.testdemo;


import com.ydd.spring5.Book;
import com.ydd.spring5.Orders;
import com.ydd.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Calendar;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/8 22:39
 * @Description:
 */
public class TestSpring5
{
    public static void main(String[] args)
    {
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
    }
    @Test
    public void testAdd()
    {
        //1,加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        //2，获取配置创建的对象
        User user=context.getBean("user",User.class);


        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook1()
    {
        //1,加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        //2，获取配置创建的对象
        Book book=context.getBean("book",Book.class);

        System.out.println(book);
        book.testDemo();
    }
    @Test
    public void testOrders()
    {
        //1,加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");

        //2，获取配置创建的对象
        Orders orders=context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.orders();
    }

}
