<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Akalyptos Laptop
  Date: 9/24/2019
  Time: 6:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
<spring:form modelAttribute="emUser" action="submituserform.htm" method="post">
    <table>
        <tr>
            <td><spring:label path="firstname">First Name</spring:label></td>
            <td><spring:input path="firstname"/></td>
        </tr>
        <tr>
            <td><spring:label path="lastname">Last Name</spring:label></td>
            <td><spring:input path="lastname"/></td>
        </tr>
    </table>
    <input type="submit" value="Submit">
</spring:form>
</body>
</html>
