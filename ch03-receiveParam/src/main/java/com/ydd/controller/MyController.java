package com.ydd.controller;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/7 8:56
 * @Description:
 */

import com.ydd.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @requestMapping的value值的公共部分叫做模块名称
 */
@Controller(value = "myController") //value指定名字
public class MyController
{
//指定post请求方式

    /**
     * 逐个接收请求参数：
     * 要求：处理器方法的形参名和请求中的参数名必须一致
     * 同名的请求参数赋值给同名的形参
     * 框架接收请求的参数
     * 1，使用request对象接收请求参数
     * String name=request.getParameter("name");
     * String age=request.getParameter("age");
     * 2.springmvc框架通过DispatcherServlet调用MyController的doSome（）方法
     * 调用方法的时候，按照名称对应，把参数付给形参
     * 框架会提供类型转换的功能，能把string转换成int，long，float，double等类型
     * 状态码400是指客户端错误，表示提交请求参数的过程中发生了问题
     * @return
     */
    @RequestMapping(value = "/receiveproperty.do") //value值必须唯一
    public ModelAndView doOther(String name,int age)
    {

        ModelAndView mv=new ModelAndView();

        mv.addObject("myName","name = "+name);
        mv.addObject("myAge","age = "+age);
        mv.setViewName("show"); //使用逻辑名称

        return mv;
    }

    /**
     * 当请求中的参数名和处理器方法的形参名不一样
     * @RequestParam:解决请求中参数名形参名不一样的问题
     * 属性：value：请求中的参数名
     *       required 是一个boolean值，默认是true。true表示请求中必须包含此参数
     * 位置 在处理器方法的形参定义的前面
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/receiveParam.do") //value值必须唯一
    public ModelAndView receiveParam(
            @RequestParam(value = "rname",required = false) String name,
             @RequestParam(value = "rage",required = false) Integer age
                                    )
    {
        System.out.println("receiceParam--->name = "+name+"   age = "+age);
        ModelAndView mv=new ModelAndView();

        mv.addObject("myName","name = "+name);
        mv.addObject("myAge","age = "+age);
        mv.setViewName("show"); //使用逻辑名称

        return mv;
    }

    /**
     * 处理器方法型参数java对象，这个对象的属性名和请求中参数名一样的
     * 框架会创建形参的java对象，给属性赋值。请求中的参数是name，框架回调用setName
     * @return
     */
    @RequestMapping(value = "/receiveobject.do") //value值必须唯一
    public ModelAndView receiveParam(Student myStudent)
    {
        System.out.println("receiceParam--->name = "+myStudent.getName()+"   age = "+myStudent.getAge());
        ModelAndView mv=new ModelAndView();

        mv.addObject("myName","name = "+myStudent.getName());
        mv.addObject("myAge","age = "+myStudent.getAge());
        mv.addObject("mystudent",myStudent);
        mv.setViewName("show"); //使用逻辑名称

        return mv;
    }


}
