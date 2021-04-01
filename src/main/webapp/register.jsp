<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2021/3/24
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="register">
    <span style="color: black"> New User Registration</span><br/><br/>
    <span style="color:black">id</span> <input type="text" name="id" required="true" style="background-color: blue"><br/><br/>
    <span style="color:black">Username</span> <input type="text" name="name" required="true" style="background-color: blue"><br/><br/>
    <span style="color: black">Password</span> <input type="password" name="password" maxlength="8" style="background-color: blue"><br/><br/>
    <span style="color: black">Email</span><input type="email" name="email" required="true"style="background-color: blue"><br/><br/>
    <span style="color: black">Gender</span>
    <label for="1">
        <input type="radio" name="gender" value="male" id="1"/> <span style="color: blue">Male</span>
    </label>

    <label for="2">
        <input type="radio" name="gender" value="female" id="2"/> <span style="color: blue">Female</span>
    </label>
    <br/><br/>
    <span style="color: yellow">Date of birth(yyyy-mm-dd)</span><input type="date"name="date"  pattern="yyyy-mm-dd" required="true"style="background-color: blue"><br/><br/>
    <input type="submit" value="register"style="background-color: yellow">
</form>
</body>
</html>