<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.net.URLEncoder" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	pageContext.setAttribute("name","page man");
	request.setAttribute("name","request man");
	session.setAttribute("name","session man");
	application.setAttribute("name","application mans");
	
	out.println("firstPage.jsp<br>");
	out.println("하나의 PAGE속성:"+pageContext.getAttribute("name")+"<br>");
	out.println("하나의 REQUEST속성:"+request.getAttribute("name")+"<br>");
	out.println("하나의 SESSION속성:"+session.getAttribute("name")+"<br>");
	out.println("하나의 APLLIATION속성:"+application.getAttribute("name")+"<br>");
	
	//RequestDispatcher rd=request.getRequestDispatcher("07_secondpage.jsp");
	//rd.forward(request,response);
	request.getRequestDispatcher("07_secondpage.jsp").forward(request,response); //포워드방식
	String name=(String) request.getAttribute("name");
	response.sendRedirect("07_secondpage.jsp?name="+URLEncoder.encode(name,"UTF-8")); //리다이렉트 방식
%>
</body>
</html>