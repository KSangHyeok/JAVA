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
request.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=utf-8");
%>
실명:<%= request.getParameter("realname")%><br>
아이디:<%= request.getParameter("idname")%><br>
성별:<%= request.getParameter("gender")%><br>
비밀번호:<%= request.getParameter("passcode")%><br>
비밀번호확인:<%= request.getParameter("passcode1")%><br>
모바일번호:<%= request.getParameter("mobile")%><br>
관심분야 :
<%
		String[] arInt = request.getParameterValues("interest");
		String outstr = "";
//		if (arInt == null) {
//			outstr += "선택된 것이 없습니다";
//		} else {
//			for (int i = 0; i < arInt.length; i++) {
//				if(i==0) outstr += arInt[i];
////				else	out.println(","); out.println(arInt[i]);
//////			}			
//		}
//		for(String area : arInt){
//			out.println(area+"<br>");
//		}
		for(String area : request.getParameterValues("interest")){
			out.println(area+"<br>");
		}
		%>
<input type=button id=btnlogin value='로그인가기'>
</body>
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<script>
$(document)
.ready(function(){
	setTimeout(function(){
		document.location="login.jsp";
	},3000);
});
</script>
</html>