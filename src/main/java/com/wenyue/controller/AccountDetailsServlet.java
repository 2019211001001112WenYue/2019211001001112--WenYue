package com.wenyue.controller;

import com.wenyue.dao.OrderDao;
import com.wenyue.dao.UserDao;
import com.wenyue.model.Order;
import com.wenyue.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "AccountDetailsServlet", value = "/accountDetails")
public class AccountDetailsServlet extends HttpServlet {
    Connection con = null;
    public void init(){
        con = (Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if(session != null && session.getAttribute("user") != null){
            User user = (User) session.getAttribute("user");
            int id = user.getId();
            UserDao userDao = new UserDao();
            request.setAttribute("user",user);
            OrderDao orderDao = new OrderDao();
            List<Order> orderList = orderDao.findByUserId(con,id);
            request.setAttribute("orderList",orderList);
            request.getRequestDispatcher("/WEB-INF/views/accountDetails.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("login").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
