package com.ydd.controller;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/7 8:56
 * @Description:
 */

import com.ydd.exception.AgeException;
import com.ydd.exception.MyUserException;
import com.ydd.exception.NameException;
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
    @RequestMapping(value = "/some.do") //value值必须唯一
    public ModelAndView doForward(String name,Integer age) throws MyUserException
    //如果方法中存在异常，需要用暴露到方法的声明上
    {

       ModelAndView mv=new ModelAndView();
       //根据请求参数的值抛出异常
        if (!name.equals("zs")){
            throw new NameException("姓名不正确！");
        }
        if (age==null|| age>80){
            throw new AgeException("年龄比较大");
        }
       mv.addObject("myname",name);
       mv.addObject("myage",age);
       mv.setViewName("show");
        return mv;
    }




}
