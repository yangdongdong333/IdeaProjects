package com.ydd.handler;

import com.ydd.exception.AgeException;
import com.ydd.exception.NameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/17 11:35
 * @Description:
 */

/**
 * @ControllerAdvice 控制器增强：也就是说，给控制器类增加功能：异常处理功能
 * 特点：必须让框架知道这个注解所在的包名，需要在springmvc配置文件中声明组件扫描器，指定@ControllerAdvice所在的包名
 */
@ControllerAdvice
public class GlobalExceptionHandler
{
    //定义方法，处理发生的异常

    /**
     * 处理异常的方法和控制器方法的定义一样，可以有多个参数，可以有ModelAndView，String，void，对象类型的返回值
     * 形参：Exception：表示controller中抛出的异常对象。通过形参可以获取发生的异常信息
     *
     * @ExceptionHandler（属性值是异常的class）：表示异常的类型，当发生此异常时，交由方法处理
     */
    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception exception)
    {
        //处理NameException的异常
        /**
         * 异常发生处理的逻辑
         * 1、需要把异常记录下来，记录到数据库，日志文件。
         * 记录日志发生的时间、异常来自哪个方法、异常的错误内容
         * 2、发送通知，把异常的信息通过邮件、短信、微信发送给相关人员
         * 3、给用户友好的提示。
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "姓名必须是zs，其他用户不能访问");
        mv.addObject("ex", exception);
        mv.setViewName("nameError");
        return mv;
    }

    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception exception)
    {
        //处理NameException的异常
        /**
         * 异常发生处理的逻辑
         * 1、需要把异常记录下来，记录到数据库，日志文件。
         * 记录日志发生的时间、异常来自哪个方法、异常的错误内容
         * 2、发送通知，把异常的信息通过邮件、短信、微信发送给相关人员
         * 3、给用户友好的提示。
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "年龄不能大于80");
        mv.addObject("ex", exception);
        mv.setViewName("ageError");
        return mv;
    }

    //处理其他异常，NameException,AgeException以外的、不知类型的异常
    //不加value属性时，表示除NameException,AgeException以外的异常
    //没有value值的@ExceptionHandler只能有一个
    @ExceptionHandler
    public ModelAndView doOtherException(Exception exception)
    {
        //处理NameException的异常
        /**
         * 异常发生处理的逻辑
         * 1、需要把异常记录下来，记录到数据库，日志文件。
         * 记录日志发生的时间、异常来自哪个方法、异常的错误内容
         * 2、发送通知，把异常的信息通过邮件、短信、微信发送给相关人员
         * 3、给用户友好的提示。
         */
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "年龄不能大于80");
        mv.addObject("ex", exception);
        mv.setViewName("defaultError");
        return mv;
    }

}
