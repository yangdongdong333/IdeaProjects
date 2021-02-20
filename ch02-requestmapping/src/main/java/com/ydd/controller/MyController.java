package com.ydd.controller;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/7 8:56
 * @Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @requestMapping的value值的公共部分叫做模块名称
 */
@Controller(value = "myController") //value指定名字
@RequestMapping(value = "/test")

public class MyController
{
   @RequestMapping(value = "/some.do",method = RequestMethod.GET) //value值必须唯一
    public ModelAndView doSome()
    {
/**
 * 属性method表示请求的方式。它的值是RequestMethod的枚举值
 * 如果是get请求，则为RequestMthod.GET
 * 如果是post请求，则为RequestMthod.POST
 */
        ModelAndView mv=new ModelAndView();

        mv.addObject("msg","欢迎使用springmvc");
        mv.addObject("fun","执行了doSome方法");

mv.setViewName("show"); //使用逻辑名称

        return mv;
    }
//指定post请求方式
    @RequestMapping(value = "/other.do",method = RequestMethod.POST) //value值必须唯一
    public ModelAndView doOther()
    {

        ModelAndView mv=new ModelAndView();

        mv.addObject("msg","欢迎使用springmvc");
        mv.addObject("fun","执行了doOther方法");
        mv.setViewName("other"); //使用逻辑名称

        return mv;
    }

    //不指定请求方式
    @RequestMapping(value = "/first.do") //value值必须唯一
    public ModelAndView doFirst(HttpServletRequest request,
                                HttpServletResponse response,
                                HttpSession session)
    {

        ModelAndView mv=new ModelAndView();

        mv.addObject("msg","欢迎使用springmvc,name="+request.getParameter("name"));
        mv.addObject("fun","执行了doOther方法");
        mv.setViewName("other"); //使用逻辑名称

        return mv;
    }
}
