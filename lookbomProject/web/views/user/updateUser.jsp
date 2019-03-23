<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage = "userError.jsp" %>
<%@ page import = "user.model.vo.LookBomUser" %>
<%
	LookBomUser loginUser = (LookBomUser)session.getAttribute("loginUser");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lb</title>
<script type="text/javascript" src = "/lb/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">

</script>
</head>
<body>
<h2 align = "center">회원 정보 수정</h2>
<form action = "/lb/update" method = "post">
<table width = "650" align = "center">
	<tr height = "40">
		<th width = "150">아이디</th>
		<td><input type = "text" name = "userid" readonly></td>
	</tr>
	<tr height = "40">
		<th width = "150">비밀번호 변경</th>
			<td>
			<table align = "center">
			<tr>
			<td width = "600">현제 비밀번호&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "password" name = "currentpwd" value = "" required></td>
			</tr>
			<tr>
			<td>신규 비밀번호&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "password" id = "userpwd1" name = "userpwd" value = "" required></td>
			</tr>
			<tr>
			<td>신규 비밀번호 확인&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "password" id = "userpwd2" value = "" required><br>
			
			</tr> 
			</table>
			 </td>
			<tr heigth = "40"> 
			<th width = "150">이름</th>
				<td><input type = "text" name = "username" readonly value = "이름"></td>
			</tr>
			<tr>
				<th width = "150">전화번호</th>
					<td><select>
						<option name = "frontphone" value = "010" checked>010</option>
						<option value = "017">017</option>
						<option value = "011">011</option>
					</select>
					<input type = "text" name = "phone"></td>
					</td>
			</tr>
			<tr>
			<th width = "150">주소</th>
					<td>
						<input type = "text" name = "postal"><input type = "button" value = "우편번호 검색"><br>
						<input type = "text" name = "address"><br>
						<input type = "text" name = "address2">
					</td>
			</tr>
			
			x	
			
</table>
	<div align = "center">
		<input type = "button" name = "cancel" value = "취소">&nbsp;&nbsp;&nbsp;
				<input type = "submit" name = "store" value = "저장">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input type = "button" value = "탈퇴하기" onclick = "Leave();">
	</div>
	
</form>
</body>
</html>