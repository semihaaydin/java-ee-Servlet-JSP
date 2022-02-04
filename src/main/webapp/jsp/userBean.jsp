<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>${user.name} </p>
<p>${user.surname} </p>
<p>${user.department.name} </p>

<p>${user['name']}
<p>${user['department']['name']}
<p>${user['department']['name']}


</body>
</html>