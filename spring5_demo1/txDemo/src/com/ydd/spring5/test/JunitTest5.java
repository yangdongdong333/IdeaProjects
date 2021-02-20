package com.ydd.spring5.test;

import com.ydd.spring5.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.concurrent.Flow;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/19 9:19
 * @Description: 整合junit4的单元测试框架
 */
//@ExtendWith(SpringExtension.class) //注解引用
//@ContextConfiguration("classpath:bean1.xml")
@SpringJUnitConfig(locations = "classpath:bean1.xml")  //复合注解，相当于上面两行
public class JunitTest5
{
    @Autowired
    private UserService userService;

    @Test
    public void test1()
    {
        userService.accountMoney();
    }


}
