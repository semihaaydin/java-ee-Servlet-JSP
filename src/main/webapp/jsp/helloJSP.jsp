<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

    
<%@ page import="java.util.*, java.applet.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${message}</h1>
<%
System.out.print("Hello JSP File");
%>

<%
String user="admin";
%>
<%=user%>

   <%! public int calculatior(int a, int b) {return a+b;}; %>
   <% int a=calculatior(10,30); %>
   <%=a %>

</body>
</html>