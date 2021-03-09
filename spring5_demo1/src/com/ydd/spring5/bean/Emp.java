package com.ydd.spring5.bean;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/10 9:06
 * @Description:
 */
public class Emp
{
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;

    public void setEname(String ename)
    {
        this.ename = ename;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    public void add()
    {
        System.out.println(ename+"--"+gender+"--"+dept);
    }
}
