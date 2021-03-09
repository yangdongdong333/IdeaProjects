package com.ydd.spring5.bean;

import org.springframework.core.annotation.Order;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/10 20:09
 * @Description:
 */
public class Orders
{
    private String oname;

    public Orders(){
        System.out.println("第一步：执行无参数构造创建bean实例");
    }
    public void setOname(String oname)
    {
        this.oname = oname;
        System.out.println("第二部：调用set方法设置值");
    }

    //创建执行的初始化方法
    public void initMethod()
    {
        System.out.println("第三步：执行初始化方法");
    }
    //创建销毁方法
    public void destroyMethod()
    {
        System.out.println("第五步：执行销毁的方法");
    }
}
