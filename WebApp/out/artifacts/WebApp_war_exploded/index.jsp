<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo Z
  Date: 7/31/2019
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>My Simple Web App</title>
  </head>
  <body>

    <h1>Hello World</h1>
    <p>body text.. This my first WebApp, JSP Page</p>

    <%
      Date date = new Date();
      out.print("<h2>" + date.toString() + "</h2>");
    %>
  </body>

</html>
