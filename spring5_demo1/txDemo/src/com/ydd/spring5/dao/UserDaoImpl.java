package com.ydd.spring5.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/15 9:22
 * @Description:
 */

@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney()
    {
        String sql="update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql,100,"lucy");

    }

    @Override
    public void reduceMoney()
    {
        String sql="update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }
}
