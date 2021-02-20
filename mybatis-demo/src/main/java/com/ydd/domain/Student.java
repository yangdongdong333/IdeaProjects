package com.ydd.domain;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/20 8:26
 * @Description:
 */
//推荐和表名一样，这样容易记忆。
public class Student
{
    //定义属性，属性名和列名一样。

    private Integer id;
    private String name;
    private String email;
    private Integer age;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
