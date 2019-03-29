<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= session.getId() %>
	<%
		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		cookie.setMaxAge(30);
		session.setMaxInactiveInterval(30);
		out.print(session.getMaxInactiveInterval());
		response.addCookie(cookie);
		
		
		
		
	%>
</body>
</html>