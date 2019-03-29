<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	SessionID: <%= session.getId() %>
	<br><br>
	
	IsNew: <%= session.isNew() %>
	<br><br>
	MaxInactiveInterval: <%=session.getMaxInactiveInterval() %>
	<br><br>
	CreateTime: <%= session.getCreationTime() %>
	
	<br><br>
	LastAccessTime: <%= session.getLastAccessedTime() %>
	<br><br>
	
	Hello: <%= request.getParameter("username") %>
	<br><br>
	
	<a href="login.jsp">relogin</a>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="logout.jsp">logout</a>
	
	<form action="hello.jsp" method="post">
		username: <input type="text" name="username"/>
		<input type="submit" value="Submit" />
		
	</form>
</body>
</html>