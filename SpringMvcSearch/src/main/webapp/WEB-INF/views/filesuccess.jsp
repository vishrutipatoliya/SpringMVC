<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file show</title>
</head>
<body><h1>${msg }</h1>
<img alt="profile img" src='<c:url value="/resources/image/${filename }"></c:url>'>
</body>
</html>