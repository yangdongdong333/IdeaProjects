package com.ydd.exception;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/17 11:21
 * @Description:
 */
//当用户姓名有异常，抛出NameException
public class NameException extends MyUserException
{
    public NameException()
    {
        super();
    }

    public NameException(String message)
    {
        super(message);
    }
}
