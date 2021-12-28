<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body align=right>
<%
if(request.getAttribute("userid")==null){
	out.print("<a href='login_1.jsp'>로그인</a>"+"&nbsp"+"<a href='mbs.jsp'>회원가입</a>");
}else{
	out.print(request.getAttribute("userid")+"<a href='logout.jsp'>로그아웃</a>");
}
%>
</body>
</html>