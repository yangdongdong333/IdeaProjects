package com.ydd.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/5 9:20
 * @Description:
 */

public class ContextServlet extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        //获取web.xml中配置的上下文参数context-param
        ServletContext context = getServletConfig().getServletContext();
       String userName= context.getInitParameter("userName");
        System.out.println("userName----->"+userName);
        System.out.println("password----->"+context.getInitParameter("passworde"));
        //2 获取当前的工程路径，格式：/工程路径
        System.out.println("当前工程路径--------》"+context.getContextPath());
        //3 获取工程部署后在服务器上硬盘上的绝对路径
        // “/”会被服务器解析成：http://ip:port/工程名  映射到项目的web目录
        System.out.println("工程部署的路径是-------->"+context.getRealPath("/"));

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
