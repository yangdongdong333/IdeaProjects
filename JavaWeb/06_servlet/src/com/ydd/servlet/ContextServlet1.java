package com.ydd.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/5 9:20
 * @Description:
 */

public class ContextServlet1 extends HttpServlet
{


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //获取servletContext对象
        ServletContext context = getServletContext();
        context.setAttribute("key1","value1");
        System.out.println("context1 中获取域数据key1的值是"+context.getAttribute("key1"));
        System.out.println("context1 中获取域数据key1的值是"+context.getAttribute("key1"));
        System.out.println("context1 中获取域数据key1的值是"+context.getAttribute("key1"));
        System.out.println("context1 中获取域数据key1的值是"+context.getAttribute("key1"));
    }
}
