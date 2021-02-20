package com.ydd.spring5.testdemo;

import com.ydd.spring5.bean.Orders;
import com.ydd.spring5.collectiontype.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/10 20:16
 * @Description:
 */
public class TestBeanCycle
{
    @Test
    public void testFacoryBean()
    {
        //1,加载spring配置文件
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("BeanCycle.xml");

        //2，获取配置创建的对象
        Orders orders=context.getBean("orders", Orders.class);
        System.out.println("Orders : "+Orders.class);
        System.out.println("第四步 获取创建的bean实例对象");
        System.out.println(orders);
        //手动让bean实例销毁
        context.close();

    }
}
