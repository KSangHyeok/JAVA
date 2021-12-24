<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table {border-collapse:collapse;}
td {border:1px solid black;}
</style>
<body align=center>
<form method=POST action=validate.jsp>
    <table align=center>
        <tr>
            <td align=left>실명</td>
            <td><input type=text id=realname name=realname></td>
            <td align=left>성별</td>
            <td><input type=radio id=male name=gender value=male>남성
                <input type=radio id=female name=gender value=female>여성</td>
        </tr>
        <tr>
            <td align=left>아이디</td>
            <td><input type=text id=idname name=idname></td>
        </tr>
         <tr>
            <td align=left>비밀번호</td>
            <td><input type=password id=passcode name=passcode size=20></td>
            <td align=left>비밀번호 확인</td>
            <td><input type=password id=passcode1 name=passcode1 size=20></td>
        </tr>
        <tr>
            <td align=left>모바일번호</td>
            <td><input type=text id=mobile name=mobile></td>
        </tr>
		<tr>
            <td align=left>관심분야</td>
            <td align=left >
            	<input type=checkbox value=정치 id=politics name=interest>정치&nbsp;
                <input type=checkbox value=경제 id=economics name=interest>경제&nbsp;
                <input type=checkbox value=사회 id=society name=interest>사회&nbsp;
                <input type=checkbox value=문화 id=culture name=interest>문화&nbsp;<br>
				<input type=checkbox value=역사 id=history name=interest>역사&nbsp;
				<input type=checkbox value=연예 id=entertainment name=interest>연예&nbsp;
                <input type=checkbox value=스포츠 id=sport name=interest>스포츠&nbsp;
                <input type=checkbox value=예술 id=art name=interest>예술&nbsp; 
            </td>
        </tr>
        <tr>
            <td colspan=2>
                <input type=submit value='작성완료'> &nbsp;&nbsp;
                <input type=reset value='Reset'>
                
            </td>
        </tr>
    </table>
</form>
</body>
<script src='https://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.on('submit',function(){
//	if($('#passcode1').val()==''){
	if($('input[name=passcode1]').val()==''){
		alert('false');
		return false;
	}else {
		alert('true')
		return true;
	}
})
</script>
</html>