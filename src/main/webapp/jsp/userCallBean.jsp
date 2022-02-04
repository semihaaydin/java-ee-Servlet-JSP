<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page import="helloJSP.model.Kullanici" %>
    <%@ page import="helloJSP.model.Department" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="user" class="helloJSP.model.Kullanici" scope="request"/>

<p>Name:<jsp:getProperty property="name" name="user"/> </p><br>
<p>Surname:<jsp:getProperty property="surname" name="user"/> </p><br>





</body>
</html>