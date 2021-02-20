package com.ydd.handler;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/17 17:56
 * @Description:
 */
public class MyIntercepter implements HandlerInterceptor
{
    /**
     * preHandle：预处理方法
     * @param request
     * @param response
     * @param handler 被拦截的控制器对象
     * @return 一个布尔值
     * @throws Exception
     *
     * 特点：1、方法在控制器方法之前先执行的
     * 用户的请求首先到达此方法
     * 2、在这个方法中可以获取请求的信息，验证请求是否符合要求
     * 可以验证用户是否登录，验证用户是否有权限访问某个链接地址（URL）。
     * 如果验证失败，可以阶段请求，请求不能被处理:
     *      执行结果：拦截器的MyIntercepter的preHandler
     * 如果验证成功，可以放行请求，此时控制器方法才能执行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        System.out.println("11111的拦截器的MyIntercepter的preHandler");

        return true;
    }

    /**
     *
     * @param request
     * @param response
     * @param handler 被拦截的处理器对象
     * @param mv 处理器方法的返回值，比如doSome方法的返回值mv
     * @throws Exception
     *
     * 特点：1、在处理器方法之后执行的（MyController.doSome())
     * 2、能够获取到处理器方法的返回值ModelAndView，可以修改ModelAndView中的数据和视图，可以影响到最后的执行结果
     * 3、主要对原来的执行结果做二次修正，
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv) throws Exception
    {
        System.out.println("11111的拦截器的MyIntercepter的postHandle");

    }

    /**
     *
     * @param request
     * @param response
     * @param handler  被拦截的处理器对象
     * @param ex 程序中发生的异常
     * @throws Exception
     *
     *
     * 最后执行的方法
     *
     * 特点：1、在请求处理完成之后执行的。在框架中规定是：当视图处理完成后（对视图执行了forward）则认为请求处理完成之后。
     * 2、一般是做资源回收工作：程序请求过程中创建了一些对象，在这里可以删除，把占用的内存回收。
     *
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {
        System.out.println("11111的afterCompletion");
    }
}
