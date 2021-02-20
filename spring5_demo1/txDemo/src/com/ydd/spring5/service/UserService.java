package com.ydd.spring5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydd.spring5.dao.UserDao;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/15 9:22
 * @Description:
 */
@Service
@Transactional( propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ,readOnly = false, timeout = 5)
public class UserService
{
    //注入Dao
    @Autowired
    private UserDao userDao;

    public void accountMoney()
    {
        //编程式事务
//        try
//        {
//            //第一步  开启事务操作
//
//            //第二部 进行业务上的操作
//            //lucy少一百
//            userDao.reduceMoney();
//            //mary多一百
//            userDao.addMoney();
//            //第三步 没有发生异常 提交事务
//        } catch (Exception e)
//        {
//            //第四步 出现了异常  进行事务的回滚
//        }

        //声明式事务
           //lucy少一百
            userDao.reduceMoney();
            //模拟异常
        int i=1/0;
            //mary多一百
            userDao.addMoney();

    }
}
