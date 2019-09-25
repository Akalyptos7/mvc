<%--
  Created by IntelliJ IDEA.
  User: Akalyptos Laptop
  Date: 9/23/2019
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome To Spring Web MVC</title>
</head>
<body>
<jsp:include page="header.jsp"/>

<br>
<br>
<h1>Hello World!!!</h1>
<div>
    ${fulluser.firstname}<br> ${fulluser.lastname}
</div>

</body>
</html>
