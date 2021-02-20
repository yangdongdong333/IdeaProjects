package com.ydd.spring5.entity;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/14 8:37
 * @Description:
 */

public class Book
{
    private String userId;
    private String userName;
    private String ustatus;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUstatus()
    {
        return ustatus;
    }

    public void setUstatus(String ustatus)
    {
        this.ustatus = ustatus;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", ustatus='" + ustatus + '\'' +
                '}';
    }
}
