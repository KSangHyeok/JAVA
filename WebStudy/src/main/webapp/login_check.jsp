<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id=request.getParameter("userid");
String pw=request.getParameter("passcode");
	if(request.getParameter("idname").equals(id)&&
		request.getParameter("passcode").equals(pw)){
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request,response);
	}else {
			out.print("아이디 또는 비밀번호가 틀렸습니다");
			RequestDispatcher rd=request.getRequestDispatcher("login_1.jsp");
			rd.forward(request,response);
		}
%>