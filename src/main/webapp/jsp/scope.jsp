<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	request.setAttribute("reqAttribute", 1000); 
	session.setAttribute("sessionAttribute", "Hello Session");
	application.setAttribute("ApplicationContext", "ApplicationContext");
	
	
%>

<h1>Benim Attribute : <%=pageContext.getAttribute("ApplicationContext") %></h1>

</body>
</html>