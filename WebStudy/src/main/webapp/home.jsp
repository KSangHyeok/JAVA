<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<%
String name=request.getParameter("realname");
if(request.getParameter("realname")==null){
	out.print(" ");
}else{
	out.print(name);
}
%>
<a href="login_1.jsp">로그인</a>
</body>
</html>