<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method=post action="mbs_check.jsp" id=frmSignon>
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
</body>
<script src='https://code.jquery.com/jquery-3.5.0.js'></script>
<script>
$(document)
.on('submit','#frmsignon',function(){
	if($('input[name=realname]').val()==''){
		alert("이름없다");
		return false;
	}else if($('input:radio[name=gender]').id('checkd'==false){
		alert("성별없다");
		return false;
	}else if($('input[name=idname]').val()==''){
		alert("아이디없다");
		return false;
	}else if($('input[name=password]').val()==''){
		alert("비밀번호 없다");
		return false;
	}else if($('input[name=password]').val()==''){
		alert("비밀번호 확인해라");
		return false;
	}else if($('input:checkbox[name=interest]').id(':checkd')==false){
		alert("관심분야 없다");
		return false;
	}
	return true;
})
.on('click','#btnCan',function(){
	document.location="home.jsp";
})
</script>
</html>