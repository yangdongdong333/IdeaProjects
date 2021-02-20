package com.ydd.exception;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/17 11:22
 * @Description:
 */
//当年龄有问题时，抛出的异常
public class AgeException extends MyUserException
{
    public AgeException()
    {
        super();
    }

    public AgeException(String message)
    {
        super(message);
    }
}
