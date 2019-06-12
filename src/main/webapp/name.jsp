<%@ page import="java.io.Writer" %><%--
  Created by IntelliJ IDEA.
  User: johndeleon
  Date: 2019-06-11
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Name" />
    </jsp:include>
</head>
<%--
 A user goes to the url "/name" and is given a "name" page. On the "name" page, the user sees a
 form prompting them to enter their first name. After submitting their name, the user is redirected
 to a page that says in an h1: "Well, howdy, TheUserNameGoesHere!"

- use a POST request on the form
- use one servlet and two JSPs.
- don't worry about styling.
- the request dispatcher will be used for both the doGet and doPost methods of the servlet
 --%>
<body>

<%
    if(request.getMethod().equalsIgnoreCase("get")){
        request.setAttribute("useme", "form");
        System.out.println(request.getAttribute("useme"));
        String useme = request.getAttribute("useme").toString();
    }else{
        request.setAttribute("useme", "noform");
        System.out.println(request.getAttribute("useme"));
        String useme = request.getAttribute("useme").toString();
    }
%>

<jsp:include page="partials/navbar.jsp" />


<c:if test="${param.name.length()>0}">

    <h1>Well Howdy, ${param.name}</h1>


</c:if>
<c:if test="${useme.equals('form')}" >

        <div class="container">
            <form action="/name.jsp" method="post">
                <label for="name">Please enter your name:</label><br>
                <input name="name" id="name" type="text"><br>
                <button>submit</button>
            </form>
        </div>

</c:if>

</body>
</html>
