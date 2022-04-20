package com.weifang.servlet;

import jakarta.servlet.*;

import java.io.*;

public class HelloServlet implements Servlet {
    public void init(ServletConfig var1) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Hello World!");

        response.setContentType("text/html");//设置响应类型要在流输入之前

        PrintWriter out = response.getWriter();
        out.print("Hello Servlet, you are my first servlet!");
        out.print("<h1>Hello Servlet</h1>");
    }

    public String getServletInfo() {
        return "";
    }

    public void destroy() {

    }

}