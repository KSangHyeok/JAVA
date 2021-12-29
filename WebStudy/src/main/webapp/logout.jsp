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
// 	request.removeAttribute("userid");
// response.sendRedirect("home.jsp");
// 	Cookie c=new Cookie("name_login",null);  
// 	c.setMaxAge(0); 
// 	response.addCookie(c); 
// 	Cookie p=new Cookie("passcode_login",null);  
// 	p.setMaxAge(0); 
// 	response.addCookie(p); 
session.invalidate();
// response.sendRedirect("home.jsp");

// 	request.getRequestDispatcher("home.jsp").forward(request,response);
	%>
	<jsp:forward page="home.jsp"/>
</body>
</html>