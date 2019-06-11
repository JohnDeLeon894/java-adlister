<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.io.IOException" %><%--
  Created by IntelliJ IDEA.
  User: johndeleon
  Date: 2019-06-11
  Time: 09:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<html>
<%@ include file="partials/header.jsp" %>
<body>
<%@ include file="partials/navbar.jsp" %>
<div class="container">

    <% counter++; %>
    <%
        if (counter >= 1) {
            System.out.println("counter = " + counter);
        }
    %>
    <h1> This is my Adlister.</h1>
    <p>Counter: <%= counter %>
    </p>

    <%@include file="partials/footer.jsp" %>
</div>
</body>
</html>
