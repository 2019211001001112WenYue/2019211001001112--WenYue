<%--
  Created by IntelliJ IDEA.
  User: w
  Date: 2021/4/8
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../header.jsp" %>
<head>
    <title>register</title>
    <style>
        table{margin:20px auto;}
        input[value="Register"]{width:100px;}
        input{width:280px;height:28px;background-color:rgb(248, 175, 86);margin:4px 0;}
        .gender{width:20px;height:16px;}
    </style>
</head>
<body>
<form action="${pageContext.request.contextPath}/register" method="post" onsubmit="return check()">
    <table>
        <tr>
            <td><input type="text" Placeholder="UserName" name="username"></td>
        </tr>
        <tr>
            <td><input type="password" Placeholder="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="text"  Placeholder="Email" name="email"></td>
        </tr>
        <tr>
            <td>
                Gender:<input type="radio"  class="gender" name="gender" value="male">Male
                <input type="radio"  class="gender" name="gender" value="Female">Female
            </td>
        </tr>
        <tr>
            <td><input type="text"  Placeholder="Date of Birth (yyyy-mm-dd)" name="birthdate"></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Register" >
            </td>
        </tr>
    </table>
</form>
<script>
    function check(){
        var input = document.getElementsByTagName("input");
        var email = input[2].value;
        var date = input[5].value;
        var reg1 = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
        var reg2 = /^\d{4}\-\d{2}\-\d{2}$/;
        var dd;
        if(input[0].value==""){
            alert("The username cannot be empty!");
            return false;
        }
        if(input[1].value.length<8){
            alert("The password should be at least 8 character long!");
            return false;
        }
        if(!reg1.test(email)){
            alert("Please enter valid email!");
            return false;
        }
        if(!reg2.test(date)){
            alert("Please enter the correct date format such as 2010-12-21");
            return false;
        }
        return true;
    }
</script>
</body>
<%@include file="../footer.jsp" %>
