package com.ydd.vo;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/10 21:01
 * @Description:保存请求参数值的一个普通类
 */
public class Student
{
    //属性名和请求中的参数名要一样
    private  String name;
    private  Integer age;

    public Student()
    {
        System.out.println("******无参数的构造方法********");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
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
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
