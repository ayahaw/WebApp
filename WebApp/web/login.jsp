<%--
  Created by IntelliJ IDEA.
  User: Lenovo Z
  Date: 8/1/2019
  Time: 4:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h1>Welcome, Please Login:</h1>

    <form action="/WebApp_war_exploded/login" method="post">
        User-name: <input type="text" name="loginname" width="30"/>
        Password: <input type="password" name="password" width="10"/>
        <input type="submit" value="login"/>
    </form>

    <p style="color: red">${errorMessage}</p>

</body>
</html>
