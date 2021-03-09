package com.ydd.webfluxdemo1.entity;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/21 18:28
 * @Description:
 */
//实体类
public class User
{
    private String name;
    private String gender;
    private Integer age;

    public User(String name, String gender, Integer age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }
}
