<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연산 결과</title>
</head>
<body>
	<%
		String value_1=request.getParameter("value_1");
		String value_2=request.getParameter("value_2");
		String sel=request.getParameter("sel");
		if(value_1==null || value_2==null || sel==null){
			out.println("값이 ㅇㅄ어");
		}
		int result=0;
		int v1=Integer.parseInt(value_1);
		int v2=Integer.parseInt(value_2);		
		if(sel.equals("+")) {
			result=v1+v2;
		}else if(sel.equals("-")) {
			result=v1-v2;
		}
		else if(sel.equals("*")) {
			result=v1*v2;
		}else {
			result=v1/v2;
		}		
		out.println("value_1: "+v1+"<br>value_2: "+v2+"<br>sel: "+sel+"<br>Result: "+result+"<br>");
		/* String outstr="<html><head><title>연산</title></head><body>";		
		out.println(outstr+"value1 :"+v1+"<br>"+"value2 :"+v2+"<br>"+
					"operator :"+sel+"<br>"+"result :"+result+"</body></html>"); */
	%>
	value1: <%=v1 %><br>
	value2: <%=v2 %><br>
	operator: <%=sel %><br>
	Result: <%=result %><br>
</body>
</html>