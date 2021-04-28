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
                String remember = request.getParameter("remember");
                if(remember != null && remember.equals("1")){
                    Cookie usernameCookie = new Cookie("cUsername",u.getUsername());
                    Cookie passwordCookie = new Cookie("cPassword",u.getPassword());
                    Cookie rememberMeCookie = new Cookie("cRememberMe",request.getParameter("RememberMe"));
                    usernameCookie.setMaxAge(10);
                    passwordCookie.setMaxAge(10);
                    rememberMeCookie.setMaxAge(10);
                    response.addCookie(usernameCookie);
                    response.addCookie(passwordCookie);
                    response.addCookie(rememberMeCookie);
                };

                HttpSession session = request.getSession();
                session.setMaxInactiveInterval(60*60*24);
                session.setAttribute("user",u);
                //request.setAttribute("user",u);
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