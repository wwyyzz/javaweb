<%@page import="com.wj.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Customer customer = new Customer();
		customer.setAge(20);
	%>
	
	<form action="el.jsp" method="post">
		username: <input type="text" name="username" 
		value = "${param.username }"/>
		<input type="submit" value="Submit" />
	</form>
	
	username: <%=request.getParameter("username") %>
	<br><br>
	age: <%=customer.getAge() %>
	<br><br>
	age: "${customer.name }"
</body>
</html>