package com.ydd.controller;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/7 8:56
 * @Description:
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Controller：创建处理器对象，对象放在springmvc容器中 位置：在类的上面
 * 和spring中讲的@Service，@Component
 * 能处理请求的都是控制器（处理器）：MyController能处理请求，
 * 叫做后端控制器（back controller）
 */
@Controller(value = "myController") //value指定名字
public class MyController
{
    //处理用户提交的请求，springmvc中使用方法来处理
//    方法是自定义的，可以有多种放回置，多种参数，方法名称自定义
//    准备使用dosome方法处理some.do请求。

    /**
     * value是一个String，表示请求的uri地址
     * value的值必须是唯一的，不能重复。在使用时推荐以“/”开头
     * 位置：1 在方法的上面，常用的
     * 2 在类的上面
     * 说明：使用RequestMapping修饰的方法叫做处理器方法或者控制器方法。
     * 使用@RequestMapping修饰的方法可以处理请求的，类似servlet中的doGet，doPost
     * 返回值：ModelAndView表示本次请求的处理结果
     * Model：数据，请求处理完成后，要显示给用户的数据
     * view：视图，比如jsp等等
     */

    @RequestMapping(value = {"/some.do","/first.do"}) //value值必须唯一
    public ModelAndView doSome()
    {
//处理some.do请求了，就相当于service调用处理完成了
        ModelAndView mv=new ModelAndView();
        //添加数据，框架在请求的最后，把数据放入request作用域
        mv.addObject("msg","欢迎使用springmvc");
        mv.addObject("fun","执行了doSome方法");
        //指定视图，指定视图的完整路径
        //框架对视图执行的forward操作，request.getRequestDispatcher("/show.jsp).forward(...)
//配置了视图解析器后，可以使用逻辑名称（文件名），指定视图
//框架会使用视图解析器的前缀+逻辑名称+后缀 组成
//        mv.setViewName("/WEB-INF/view/show.jsp");
//WEB-INF/view + show + .jsp
mv.setViewName("show"); //使用逻辑名称
        //返回mv
        return mv;
    }
}
