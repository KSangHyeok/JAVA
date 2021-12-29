<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page session="true" %>
<%-- <% --%>
<!-- // String name_login= (String)request.getAttribute("name_login"); -->
<!-- // String passcode_login= (String)request.getAttribute("passcode_login"); -->
<%-- %> --%>
<!DOCTYPE html>
<html>
<head>
<style>
table {border-collapse:collapse}
td {border:1px solid green;}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method=post action="login_check.jsp">
<table align=center>
<tr><td>아이디</td><td><input type=text id=id name=userid></td></tr>
<tr><td>비밀번호</td><td><input type=password id=pw name=passcode></td></tr>
<tr><td colspan=2><input type=submit value='로그인'>&nbsp;
            <input type=button id=btnCan_h value='취소'></td></tr>
            <tr><td colspan=2 align=right><a href=mbs.jsp>회원가입</a></td></tr>
            <tr><td>
            <%=session.getAttribute("userid")%> , <%=session.getAttribute("passcode")%>
            </td></tr>      
</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
// .ready(){
<%-- 	String id<%=request.getAttribute("name_login")%>; --%>
<%-- 	String pw<%=request.getAttribute("passcode_login")%>; --%>
// 	alert(id);
// }
.on('submit',function(){
	if($('#id').val()==''){
		alert('아이디가 입력되지않았습니다.');
		return false;
	}else if($('#pw').val()==''){
		alert('비밀번호가 입력되지않았습니다.');
		return false;
	}else if($('#id').val()!="<%=session.getAttribute("userid")%>" || $('#pw').val()!="<%=session.getAttribute("passcode")%>"){
		alert("아이디 또는 비밀번호가 틀렸");
		return false;
	}else{
		alert("로그인굿");
		
		return true;
	}
})
.on('click','#btnCan_h',function(){
	document.location="home.jsp";
})
</script>
</html>