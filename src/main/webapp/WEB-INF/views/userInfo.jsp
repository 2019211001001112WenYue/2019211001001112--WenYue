<%@ page import="com.wenyue.model.User" %>
<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2021/4/28
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<% User user = (User)session.getAttribute("user");%>
<h1>User Info</h1>
<table border="1px" cellspacing="0" >
    <tr >
        <td>Username: </td>
        <td><%=user.getUsername()%></td>
    </tr>
    <tr>
        <td>Password: </td>
        <td><%=user.getPassword()%></td>
    </tr>
    <tr>
        <td>Email: </td>
        <td><%=user.getEmail()%></td>
    </tr>
    <tr>
        <td>Gender: </td>
        <td><%=user.getGender()%></td>
    </tr>
    <tr>
        <td>BirthDate: </td>
        <td><%=user.getBirthDate()%></td>
    </tr>
</table>
<a href="updateUser">Update User
    <%@include file="footer.jsp"%>
