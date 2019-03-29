<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Books Page</h4>
	
	<a href="book.jsp?book=JavaWeb">Java Web</a><br><br>
	<a href="book.jsp?book=Java">Java</a><br><br>
	<a href="book.jsp?book=Oracle">Oracle</a><br><br>
	<a href="book.jsp?book=Ajax">Ajax</a><br><br>
	<a href="book.jsp?book=JavaScript">JavaScript</a><br><br>
	<a href="book.jsp?book=Android">Android</a><br><br>
	<a href="book.jsp?book=Jbpm">Jbpm</a><br><br>
	<a href="book.jsp?book=Strusts">Strusts</a><br><br>
	<a href="book.jsp?book=hibernate">Hibernate</a><br><br>
	<a href="book.jsp?book=Spring">Spring</a><br><br>
	
	<br><br>
	
	<%
	Cookie [] cookies = request.getCookies();
	
	if(cookies != null && cookies.length > 0){
		for(Cookie cookie:cookies){
			String cookieName = cookie.getName();
			if(cookieName.startsWith("ATGUIGU_BOOK_")){
				out.println(cookie.getValue());
				out.print("<br>");
			}
				
		}
	}
	%>
	
</body>
</html>