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
    @RequestMapping(value = "/returnString-view.do") //value值必须唯一
    public String doOther(HttpServletRequest request, String name, int age)
    {
        System.out.println("name = " + name + " age = " + age);
        //可以自己手工添加数据到request作用域
        request.setAttribute("myname", name);
        request.setAttribute("myage", age);
//show：逻辑视图名称，项目中配置了视图解析器
        //框架对视图执行forward转发操作
        return "show";
    }

    //处理器方法返回String,表示完整视图路径，此时不能配置视图解析器
    @RequestMapping(value = "/returnString-view2.do") //value值必须唯一
    public String doReturnView2(HttpServletRequest request, String name, int age)
    {
        System.out.println("doReturnView2-----> name = " + name + " age = " + age);
        //可以自己手工添加数据到request作用域
        request.setAttribute("myname", name);
        request.setAttribute("myage", age);
//show：完整视图路径，项目中不能配置视图解析器
        //框架对视图执行forward转发操作
        return "/WEB-INF/view/show.jsp";
    }

    //处理器方法返回void，响应ajax请求
    @RequestMapping(value = "/returnVoid-ajax.do") //value值必须唯一
    public void doReturnVoidAjax(HttpServletResponse response, String name, int age) throws IOException
    {
        System.out.println("doReturnVoidAjax-----> name = " + name + " age = " + age);
        //处理ajax，使用json做数据的格式
        //service调用完成了，使用Student表示处理结果
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        //把结果对象转为json格式的数据
        if (student != null)
        {
            ObjectMapper om = new ObjectMapper();
            String json = om.writeValueAsString(student);
            System.out.println("student转换成json---》" + json);
            //输出数据，响应ajax的请求
            response.setContentType("application/json;charset=utf-8");
            PrintWriter pw = response.getWriter();
            pw.println(json);
            pw.flush();
            pw.close();

        }
    }

    /**
     * 处理器方法返回一个Student，通过框架转为json，响应ajax请求
     *
     * @ResponseBody :作用：把处理器方法返回对象转为json后，通过HttpServletResponse输出给浏览器。
     * 位置：在方法定义上面，和其他注解没有顺序关系。
     * 返回对象时框架的处理流程：
     * 1、框架会把返回Student类型，调用框架中的ArrayList<HttpMessageConverter>中的每个类的canWrite方法来检查哪个HttpMessageConverter接口的实现类能处理Student类型的数据。
     * 2、框架会调用实现类的write()方法，MappingJackson2HttpMessageConverter的write()方法把李四同学的student对象转换为对象，调用jackson中的objectMapper转换为json
     * 3、框架会调用@ResponseBody把2的结果数据输出到浏览器，ajax请求处理完成
     */
    @RequestMapping(value = "/returnStudentJson.do") //value值必须唯一
    @ResponseBody
    public Student doStudentJsonObject(HttpServletResponse response, String name, int age)
    {
//调用serive，获取请求结果数据，Student对象表示结果数据
        Student student = new Student();
        student.setAge(22);
        student.setName("李四");
        return student;//会被框架转为json
    }

    @RequestMapping(value = "/doStudentJsonObjectArray.do") //value值必须唯一
    @ResponseBody
    public List<Student> doStudentJsonObjectArray(HttpServletResponse response, String name, int age)
    {
        List<Student> list = new ArrayList<>();
//调用serive，获取请求结果数据，Student对象表示结果数据
        Student student = new Student();
        student.setAge(22);
        student.setName("李四");
        list.add(student);

        Student student1 = new Student();
        student.setAge(23);
        student.setName("李五");
        list.add(student);
        return list;//会被框架转为json
    }


    /**
     * 处理器方法返回的时String，表示的是数据而不是视图
     * 区分返回值String是数据还是视图，看有没有@ResponseBody注解
     * 有：返回的是数据
     * 反之就是视图
     * 默认使用ISO8859-1字符集，导致中文乱码
     * 解决方法：给RequestMapping中增加一个属性，produces，使用这个属性指定新的contentType
     */
    @RequestMapping(value = "/returnStringData.do",produces = "text/plain;charset=utf=8")
    @ResponseBody
    public String doStringData(String name, Integer age)
    {
        return "hello springmvc 返回对象，表示数据";
    }


}
