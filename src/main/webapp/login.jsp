<%--
  Created by IntelliJ IDEA.
  User: johndeleon
  Date: 2019-06-11
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>


<html>
<%@include file="partial/head.jsp" %>
<body>

<%@include file="partial/navbar.jsp" %>
<div class="container">
    <form action="login.jsp" method="post">
        <label for="username">
            Username: <br>
        </label>
        <input type="text" name="username" id="username"> <br>
        <label for="password">
            Password: <br>
        </label>
        <input type="password" name="password" id="password"> <br>
        <button>submit</button>


    </form>
</div>

<%@include file="partial/footer.jsp" %>
</body>
</html>
