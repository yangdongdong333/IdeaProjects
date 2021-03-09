package com.ydd.spring5.test;

import com.ydd.spring5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/19 9:19
 * @Description: 整合junit4的单元测试框架
 */
@RunWith(SpringJUnit4ClassRunner.class) //指定junit的版本
@ContextConfiguration("classpath:bean1.xml")  //加载配置文件
public class JunitTest4
{
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.accountMoney();
    }
}
