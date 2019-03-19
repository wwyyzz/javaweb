<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>bbb PAGE</h4>
	
	<%
// 		request.getRequestDispatcher("/c.jsp").forward(request, response);
		
	response.sendRedirect("c.jsp");
	%>
</body>
</html>