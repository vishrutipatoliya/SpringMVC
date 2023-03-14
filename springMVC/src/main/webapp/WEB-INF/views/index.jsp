<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
<h2>this is home page </h2>
<% String name =(String)request.getAttribute("name");
Integer id =(Integer)request.getAttribute("id");
List<String> friends =(List<String>) request.getAttribute("f");
%>

<h2>name is <%= name %></h2>
<h2>id is <%= id %></h2>
<%for(String s: friends){ %>
<h3> <%=s %></h3>
<%} %>
</body>
</html>