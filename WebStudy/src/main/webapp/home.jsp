<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel='stylesheet' type='text/css' href='login.css'>
<title>Home</title>
</head>
<body align="left" class="home_body">
<jsp:include page="10_header.jsp"/><b><em>
<%
String nb="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
String userid=(String)session.getAttribute("userid");
if(userid==null){
	out.print("&nbsp;&nbsp;&nbsp;&nbsp;"+"<a href='login_1.jsp'>로그인</a>"+nb+"<a href='mbs.jsp'>회원가입</a>");
}else{
	out.print("&nbsp;&nbsp;&nbsp;&nbsp;"+userid+nb+"<a href='logout.jsp'>로그아웃</a>");
}

%>
</em></b>
<jsp:include page="10_footer.jsp"/>
</body>
</html>