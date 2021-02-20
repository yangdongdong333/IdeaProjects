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
        //验证登录的用户信息，正确返回true，其他返回false
        System.out.println("11111的拦截器的MyIntercepter的preHandler");
        //从session中获取数据
        Object attr = request.getSession().getAttribute("name");
        String loginName="";
        if (attr!=null){
            loginName=(String) attr;
        }
        //判断登录的账户是否符合要求‘
        if (!loginName.equals("zs")){
            request.getRequestDispatcher("/tips.jsp").forward(request,response);

        }
        //zs登录
        return true;
    }


}
