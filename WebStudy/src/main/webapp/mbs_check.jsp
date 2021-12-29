<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>

<%
if(request.getParameter("idname")==null || request.getParameter("passcode")==null){
	out.print("아이디 또는 비밀번호를 입력해주세요");	
	
	request.getRequestDispatcher("mbs.jsp").forward(request,response);
}else{
	session.setAttribute("userid",request.getParameter("idname"));
	session.setAttribute("passcode",request.getParameter("passcode"));
	response.sendRedirect("login_1.jsp");
} %>
