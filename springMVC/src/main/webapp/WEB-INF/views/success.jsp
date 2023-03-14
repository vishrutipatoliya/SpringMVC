<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>hyy, ${name }</h1> --%>
<%-- <h1>email address is ${email }</h1> --%>
<%-- <h1>password address is ${password } </h1> --%>
<h1>${head }</h1>
<p>${desc }</p>
<h3 style="color:green">${msg }</h3>
<h1>hyy, ${user.userName }</h1>
<h1>email address is ${user.email }</h1>
<h1>password is ${user.userPassword } </h1>
</body>
</html>