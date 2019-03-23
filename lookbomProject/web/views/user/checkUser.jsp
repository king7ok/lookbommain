<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage = "userError.jsp"%>
<%@ page import = "user.model.vo.LookBomUser " %>
<%
	LookBomUser loginUser = (LookBomUser)session.getAttribute("loginUser");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호로 유저 확인</title>
<script type="text/javascript" src = "/lb/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	function checkUser(){
		var userpwd = <%= loginUser.getUserPwd() %>;
		if(userpwd == $("#password").val()){
			opener.location.href ="/lb/views/user/updateUser.jsp";
			self.close();
			return true;
			} else {
				alert("암호가 일치하지 않습니다.");
				$("#password").select();
				return false;
			}
	}
</script>
	
</head>
<body>
<div align = "center">
	<input type = "password" id = "password">	&nbsp;&nbsp;&nbsp;
	<input type = "button" name = "checkpass" value = "비밀번호 확인"  onclick = "return checkUser();">
	
</div>
</body>
</html>