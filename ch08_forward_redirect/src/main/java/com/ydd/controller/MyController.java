package com.ydd.controller;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/7 8:56
 * @Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "myController") //value指定名字

public class MyController
{
    /**
     * 处理器方法返回ModelAndView，实现转发forward
     * 语法：setViewName("forward:视图文件完整路径)
     * forward:特点：不能和视图解析器一起使用，就当项目中没有视图解析器
     *
     * @return
     */
    @RequestMapping(value = "/doForward.do") //value值必须唯一
    public ModelAndView doForward()
    {

       ModelAndView mv=new ModelAndView();
       mv.addObject("msg","欢迎使用springmvc做开发");
       mv.addObject("fun","执行的是doForward方法");
       //显示转发
       //mv.setViewName("forward:/WEB-INF/view/show.jsp");
       mv.setViewName("forward:/hello.jsp"); //使用webapp目录下的绝对路径
        return mv;
    }

    /**
     * 处理器方法返回ModelAndView，实现重定向redirect
     * 语法：setViewName(redirect:"视图完整路径")
     * 特点：不能和视图解析器一起使用，就当项目中没有视图解析器
     * 框架对重定向的操作：
     * 1、框架会把Model中的简单类型的数据，转为String使用，作为redirect1.jsp的get请求参数使用。
     * 目的时在doRedirect.do和hello.jsp两次请求之间传递数据
     * 2、在目标redirect.jsp页面可以使用参数集合对象${param}获取请求参数值${param.myname}
     */
    @RequestMapping(value = "/doRedirect.do") //value值必须唯一
    public ModelAndView doWithRedirect(String name,Integer age)
    {

        ModelAndView mv=new ModelAndView();
        //数据放入到request作用域
        mv.addObject("myname",name);
        mv.addObject("myage",age);
        //重定向
        //mv.setViewName("forward:/WEB-INF/view/show.jsp");
        mv.setViewName("redirect:/redirect1.jsp"); //使用webapp目录下的绝对路径
        //http://localhost:8080/ch08_forward_redirect/redirect1.jsp?myname=%E6%9D%8E%E5%9B%9B&myage=23
        return mv;
    }



}
