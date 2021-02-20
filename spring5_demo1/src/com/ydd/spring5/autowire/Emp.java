package com.ydd.spring5.autowire;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/10 21:38
 * @Description:
 */
public class Emp
{
    private Dept dept;

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    @Override
    public String toString()
    {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test()
    {
        System.out.println(dept);
    }
}
