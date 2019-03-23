<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<%@ page import = "user.model.vo.LookBomUser" %> 
<%
	LookBomUser loginUser = (LookBomUser)session.getAttribute("loginUser");
	String message = (String)request.getAttribute("message");
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lb</title>
</head>
<body>
<h1>회원서비스 오류</h1>
<% if(exception != null){ %>
	JSP 예외발생 : <%= message %><br>
<% } %>
<br>
<a href = "/lb/index.jsp">메인페이지</a><br>
</body>
</html>