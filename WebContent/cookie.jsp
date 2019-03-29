<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>cookie</h4>
	<%
		Cookie[] cookies = request.getCookies();
		
		if(cookies !=null && cookies.length > 1){
			for( Cookie c:cookies){
				out.println(c.getName() + ":" + c.getValue());
				out.println("<br>");
			}
		}else{
			Cookie cookie = new Cookie("name", "abc");
			cookie.setMaxAge(30);
			response.addCookie(cookie);
		}
	%>

</body>
</html>