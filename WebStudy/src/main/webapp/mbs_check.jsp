<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %> 
<%
session.setAttribute("name_login",request.getParameter("idname"));
session.setAttribute("passcode_login",request.getParameter("passcode"));
%>
<%
if(request.getParameter("idname")==null || request.getParameter("passcode")==null){
	out.print("아이디 또는 비밀번호를 입력해주세요");
	request.getRequestDispatcher("mbs.jsp").forward(request,response);
}else{
	
	request.getRequestDispatcher("login_1.jsp").forward(request,response);
}
%>