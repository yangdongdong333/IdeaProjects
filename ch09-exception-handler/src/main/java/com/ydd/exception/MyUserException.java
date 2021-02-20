package com.ydd.exception;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/17 10:35
 * @Description:
 */
//当用户的姓名有异常，抛出姓名异常
public class MyUserException extends Exception
{
    public MyUserException()
    {
        super();
    }

    public MyUserException(String message)
    {
        super(message);
    }
}
