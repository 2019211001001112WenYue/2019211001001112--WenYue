package com.wenyue.week4.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ConfigDemoServlet", value = "/config",
        initParams = {
                @WebInitParam(name = "name",value = "WenYue"),
                @WebInitParam(name = "studentId",value = "2019211001001112"),
        })

public class ConfigDemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name =getServletConfig().getInitParameter("name");
        String studentId = getServletConfig().getInitParameter("studentId");

        PrintWriter pw = response.getWriter();
        pw.write("<h1>name: "+ name+"</h1>");
        pw.write("<h1>studentId: : "+ studentId+"</h1>");

    }
}
