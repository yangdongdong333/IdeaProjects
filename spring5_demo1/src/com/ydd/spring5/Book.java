package com.ydd.spring5;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/9 15:34
 * @Description:演示使用set方法进行注入属性
 */
public class Book
{
    private String bname;
    private String bauthor;
    private String address;

    public void setBname(String bname)
    {
        this.bname = bname;
    }

    public void setBauthor(String bauthor)
    {
        this.bauthor = bauthor;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void testDemo()
    {
        System.out.println(bname+"::"+bauthor+"::"+address);
    }
}
