<%@page import="com.wj.Person" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello world
<%
	Person person = new Person();
	System.out.println(person.getPersonInfo());
%>
</body>
</html>