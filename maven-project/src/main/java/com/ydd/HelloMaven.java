package com.ydd;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/1/7 9:22
 * @Description:
 */
public class HelloMaven{
    public int add (int a ,int b){
        return a+b;
    }

    public static void main(String[] args) {
        HelloMaven helloMaven=new HelloMaven();
        int res= helloMaven.add(10,20);
        System.out.println("10+20="+res);

        List<String> list=new ArrayList<>();
        System.out.println(list.size());
        String a="";
        System.out.println(a.length());
        System.out.println(a==null);

    }
}
