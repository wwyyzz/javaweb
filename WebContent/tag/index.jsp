<%@page import="java.util.ArrayList"%>
<%@page import="com.wj.bean.Customer"%>
<%@page import="java.util.List"%>
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
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "AA", 12));
		customers.add(new Customer(2, "BB", 13));
		customers.add(new Customer(3, "CC", 14));
		customers.add(new Customer(4, "DD", 15));
		customers.add(new Customer(5, "EE", 16));
		
		request.setAttribute("customers", customers);
	%>
	
	
	<jsp:forward page="testtag.jsp"></jsp:forward>
</body>
</html>