package com.ydd.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: yangdongdong
 * @CreateTime: 2021/2/5 22:39
 * @Description:
 */
@WebServlet(name = "ServletOfAnnotation",urlPatterns = "/a")
public class ServletOfAnnotation extends HttpServlet
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("访问到了按注解开发的servlet");

    }
}
