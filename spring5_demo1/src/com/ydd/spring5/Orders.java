package com.ydd.spring5;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/9 21:12
 * @Description:
 */
public class Orders
{
    private String oname;
    private String address;

    public Orders(String oname, String address)
    {
        this.oname = oname;
        this.address = address;
    }
    public void orders ()
    {
        System.out.println("oname="+oname+"::"+address);
    }
}
