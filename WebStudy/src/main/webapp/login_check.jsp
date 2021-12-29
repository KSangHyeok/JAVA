<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%
		String userid=request.getParameter("userid");
		String passcode=request.getParameter("passcode");
		response.sendRedirect("home.jsp");

%>