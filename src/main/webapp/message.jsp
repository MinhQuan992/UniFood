<%--
  Created by IntelliJ IDEA.
  User: Vo Tran Minh Quan
  Date: 11/24/2020
  Time: 5:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UNIFOOD</title>
</head>
<body>
<c:if test="${not empty message}">
    <h1 style="text-align: center"><c:out value="${message}"/></h1>
</c:if>
</body>
</html>