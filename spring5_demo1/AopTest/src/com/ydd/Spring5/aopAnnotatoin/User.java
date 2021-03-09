package com.ydd.Spring5.aopAnnotatoin;

import org.springframework.stereotype.Component;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/30 18:41
 * @Description:
 */
//被增强类
@Component(value = "user")
public class User
{
    public void add(){

        System.out.println("add........");
        int i=1/0;
    }
}
