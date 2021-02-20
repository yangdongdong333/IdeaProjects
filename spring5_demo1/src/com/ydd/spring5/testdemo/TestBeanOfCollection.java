package com.ydd.spring5.testdemo;

import com.ydd.spring5.collectiontype.Book;
import com.ydd.spring5.factoryBean.MyBean;
import com.ydd.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/8 22:39
 * @Description:
 */
public class TestBeanOfCollection
{

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
        ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");

        //2，获取配置创建的对象
        Book stu=context.getBean("stu", Book.class);
        System.out.println(stu.to());
    }
    @Test
    public void testFacoryBean()
    {
        //1,加载spring配置文件
        ApplicationContext context=new ClassPathXmlApplicationContext("FactoryBean.xml");

        //2，获取配置创建的对象
        Book myBean=context.getBean("myBean", Book.class);
        System.out.println(myBean);
    }

}
