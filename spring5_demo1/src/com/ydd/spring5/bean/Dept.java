package com.ydd.spring5.bean;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/10 9:06
 * @Description:部门类
 */
public class Dept
{
    private String dname;

    public void setDname(String dname)
    {
        this.dname = dname;
    }

    @Override
    public String toString()
    {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
