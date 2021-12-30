<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<link rel='stylesheet' type='text/css' href='login.css'>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="mbs_body"><b>
<form method=post action="mbs_check.jsp">
 <table align=center class="mbs_table">
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
                <input type=submit value='가입완료'> &nbsp;&nbsp;
                <input type=button id=btnCan value='취소'>
                
            </td>
        </tr>
    </table>
    </form>
    </b>
</body>
<script src='https://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.on('submit',function(){
	if($('#realname').val()==''){
		alert("이름없다");
		return false;
	}else if($('input[name=gender]:checked').val()==undefined){
		alert("성별없다");
		return false;
	}else if($('#idname').val()==''){
		alert("아이디없다");
		return false;
	}else if($('#passcode').val()==''){
		alert("비밀번호 없다");
		return false;
	}else if($('#passcode1').val()==''){
		alert("비밀번호 확인해라");
		return false;
	}else if($('#passcode').val() !=$('#passcode1').val()){
		alert("달라~");
		return false;	
	}else if($('input[name=interest]:checked').val()==undefined){
		alert("관심분야 없다");
		return false;
	}else return true;
})
.on('click','#btnCan',function(){
	document.location="home.jsp";
})
</script>
</html>