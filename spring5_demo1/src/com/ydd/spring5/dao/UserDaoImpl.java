package com.ydd.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/9 22:20
 * @Description:
 */

@Repository(value = "userDaoImpl-1")
public class UserDaoImpl implements UserDao
{


    public void update()
    {
        System.out.println("dao update");
    }
}
