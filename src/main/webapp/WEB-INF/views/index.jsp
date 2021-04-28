<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2021/4/28
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="header.jsp" %>
<form method="get" target="_blank" action="search">
    <input type="text" name="txt" size=30>
    <select name="search">
        <option value="baidu">Baidu</option>
        <option value="bing">Bing</option>
        <option value="google">Google</option>
        <input type="submit" value="Search">
    </select>
</form>
<%@include file="footer.jsp" %>
