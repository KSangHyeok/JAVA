<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
// String id=request.getParameter("userid");
// String pw=request.getParameter("passcode");
request.setAttribute("userid",request.getParameter("userid"));
request.getRequestDispatcher("home.jsp").forward(request,response);
// 	if(request.getParameter("userid").equals(session.getAttribute("name_login"))&&
// 			request.getParameter("passcode").equals(session.getAttribute("passcode_login"))){
// 			request.getParameter("userid");
// 			request.getRequestDispatcher("home.jsp").forward(request,response);
// 	}else {
// 			out.print("아이디 또는 비밀번호가 틀렸습니다");
// 			RequestDispatcher rd=request.getRequestDispatcher("login_1.jsp");
// 			rd.forward(request,response);
// 		}
%>