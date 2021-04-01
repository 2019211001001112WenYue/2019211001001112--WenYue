<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2021/4/8
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp" %>
<body>
<h1>Login</h1>
<form action="${pageContext.request.contextPath}/login" method="post">
    UserName: <input type="text" name="username">
    <br>
    Password: <input type="password" name="password">
    <br>
    <input type="submit" value="Login">
</form>
</body>
<%@include file="footer.jsp" %>
