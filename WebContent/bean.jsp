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
	<jsp:useBean id="customer" class="com.wj.bean.Customer" scope="request"></jsp:useBean>
	<jsp:setProperty property="age" value="20" name="customer"/>
	age: <jsp:getProperty property="age" name="customer"/>
	
	<%--
		customer.setAge(10);
		out.println(customer.toString());
	--%>
	
	<%--
		if(customer == null){
			customer = (Customer)Class.forName("com.wj.bean.Customer").newInstance();
			session.setAttribute("customer", customer);
		}
	--%>
</body>
</html>