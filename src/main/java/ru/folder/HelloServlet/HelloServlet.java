package ru.folder.HelloServlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("webapp/WEB-INF/web.xml");
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        pw.println("Hello!");
        pw.close();
    }
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter writer = response.getWriter();
//        writer.write("Hello!");
//        writer.write("<h2>Java the Best!<h2>");
//        writer.write("<h3>Mike Java Developer!<h3>");
//
//    } (HttpServlet)
}
