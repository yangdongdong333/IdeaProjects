package com.ydd.spring5;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/12 15:00
 * @Description:
 */
public class UserDaoImpl implements UserDao
{

    @Override
    public int add(int a, int b)
    {
        System.out.println("add方法开始执行了");
        return a+b;

    }

    @Override
    public String update(String id)
    {
        System.out.println("update方法开始执行了");
        return id;
    }
}
