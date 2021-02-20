package com.ydd.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.Serializable;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/3 15:20
 * @Description:
 */
public class HelloServlet implements Servlet
{
    public HelloServlet()
    {
        System.out.println("1 构造器方法");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {
        //1可以获取servlet程序的别名，也就是servlet-name的值
        System.out.println("servlet的别名是----》"+servletConfig.getServletName());

        //2 获取初始化参数
        System.out.println("初始化参数-----》"+servletConfig.getInitParameter("userName"));
        //3 获取servletContext对象
        System.out.print("servletContext----->");
        System.out.println(servletConfig.getServletContext());

        System.out.println("2 init方法");
    }

    @Override
    public ServletConfig getServletConfig()
    {
        return null;
    }

    /**
     * service方式是专门用来处理请求和响应的
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if (method.equals("GET"))
            doGet();
        else if (method.equals("POST"))
            doPost();
    }

    /**
     * 做get请求的响应
     */
    public void doGet()
    {
        System.out.println("get请求");
        System.out.println("get请求");
    }

    public void doPost()
    {
        System.out.println("get请求");
        System.out.println("get请求");
    }

    @Override
    public String getServletInfo()
    {
        return null;
    }

    @Override
    public void destroy()
    {
        System.out.println("4 destory方法");

    }
}
