<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="helloJSP.model.Kullanici" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%

 Kullanici user=(Kullanici) request.getAttribute("user");
%>
<p>Hoşgeldin</p>
<p> <%=user.getName() %></p>
<p> <%=user.getSurname() %> </p>




</body>
</html>