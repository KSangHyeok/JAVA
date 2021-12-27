<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
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
            <tr><td></td><td></td><td><a href=mbs.jsp>회원가입</a></td>
</table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.on('submit',function(){
	if($('#id').val()==''){
		alert('아이디가 입력되지않았습니다.');
		return false;
	}else if($('#pw').val()==''){
		alert('비밀번호가 입력되지않았습니다.');
		return false;
	}else{return true}
})
.on('click','#btnCan_h',function(){
	document.location="home.jsp";
})
</script>
</html>