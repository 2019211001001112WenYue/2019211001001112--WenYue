<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2021/4/28
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<%
    User user = (User)session.getAttribute("user");
%>
<%  String message = (String) request.getAttribute("message");
    if(message!= null){%>
<h1><%=message%></h1>
<%}%>
<form action="updateUser" method="post">
    <input type="hidden" name="id" value="<%=user.getId()%>">
    UserName:<input type="text" name="username" value="<%=user.getUsername()%>">
    <br>
    password:<input type="password" Placeholder="password" name="password" value="<%=user.getPassword()%>">
    <br>
    Email:<input type="text"  Placeholder="Email" name="email" value="<%=user.getEmail()%>">
    <br>
    Gender:<input type="radio"  class="gender" name="gender" value="male" <%=user.getGender().equals("male")?"checked":""%>>Male
    <input type="radio"  class="gender" name="gender" value="Female" <%=user.getGender().equals("Female")?"checked":""%>>Female
    <br>
    birthdate:<input type="text"  Placeholder="Date of Birth (yyyy-mm-dd)" name="birthdate" value="<%=user.getBirthDate()%>">
    <br>
    <input type="submit" value="Save changes" >

</form>
<%@include file="footer.jsp"%>
