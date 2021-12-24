<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>operator</title>
</head>
<body>
<form method="POST" action="operator_bk.jsp">
<table>
<tr><td>value1:<input type=text id=value_1 name=value_1></td></tr>
<tr><td>value2:<input type=text id=value_2 name=value_2></td></tr>
<tr><td><select id=sel name=sel>
<option value="+">+</option>
<option value="-">-</option>
<option value="*">*</option>
<option value="/">/</option></select></td></tr>
<tr><td colspan=2 align=center><input type=submit value="계산"></td></tr>
</table>
</form>

</body>
</html>