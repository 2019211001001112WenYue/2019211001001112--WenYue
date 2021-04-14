package com.wenyue.week5.demo;

import com.wenyue.dao.UserDao;
import com.wenyue.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    Connection con = null;
    @Override
    public void init() throws ServletException {//link sqlserver
        super.init();
//        String driver = getServletConfig().getServletContext().getInitParameter("driver");
//        String url = getServletConfig().getServletContext().getInitParameter("url");
//        String username = getServletConfig().getServletContext().getInitParameter("Username");
//        String password = getServletConfig().getServletContext().getInitParameter("Password");
//        try {
//            Class.forName(driver);
//            con = DriverManager.getConnection(url,username,password);
//            System.out.println("hell0");
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("error");
//            e.printStackTrace();
//        }
        con = (Connection) getServletContext().getAttribute("con");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserDao userDao = new UserDao();
        try {
            User u = userDao.findByUsernamePassword(con,username,password);
            if(u !=null){
                request.setAttribute("user",u);
                request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
            }else{
                request.setAttribute("message", "Username or Password Error!");
                request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}