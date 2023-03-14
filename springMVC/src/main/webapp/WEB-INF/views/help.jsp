<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>help page</title>
</head>
<body>
<h1>help page</h1>
	<%
// 	String name=(String) request.getAttribute("name");
// 	Integer id=(Integer) request.getAttribute("id");
	%>
<h1>name is 
<%-- <%=name %> --%>
${name}
</h1>

<h1>id is  
<%-- <%=id %> --%>
${id}
</h1>
<h1>time is  
<%-- <%=id %> --%>
${time}
</h1>
<h1>mark is  
<%-- <%=id %> --%>
<c:forEach var="item" items="${marks}">
<h4>${item}</h4>
<h4><c:out value="${item}"></c:out></h4>
</c:forEach>
</h1>
</body>
</html>