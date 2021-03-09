package com.ydd.controller;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/7 8:56
 * @Description:
 */

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ydd.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@Controller(value = "myController") //value指定名字

public class MyController
{
    /**
     * 处理器方法返回String，表是逻辑视图名称，需要配置视图解析器
     *
     * @param name
     * @param age
     * @return
     */
    @RequestMapping(value = "/some.do") //value值必须唯一
    public ModelAndView dosome(String name, int age)
    {
        System.out.println("name = " + name + " age = " + age);
       ModelAndView mv=new ModelAndView();
       mv.addObject("myname",name);
       mv.addObject("myage",age);
       mv.setViewName("show");
        return mv;
    }




}
