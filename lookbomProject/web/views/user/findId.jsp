<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lb</title>
<script type="text/javascript">
function findPwd(){
	location.href = "/lb/views/user/findPwd.jsp";
}
</script>
</head>
<body>
<div align = "center">
	<h2>ID/PW 찾기</h2>
	<table>
	<input type = "button" value = "아이디" style = "border : 0px; color : white; background-color : black; width : 150px; height : 50px;">
	<input type = "button" value = "비밀번호"style = "border : 0px; color : black; background-color : gray; width : 150px; height : 50px;" onclick = "findPwd();">
	</table>
	<table>
	<br>
		<tr>
			<th align = "left" width = "90">이름</th>
			<td><input type = "text" name = "username" placeholder = "내용을 입력해주세요"></td>
		</tr>
		<tr>
			<th align = "left" width = "90">이메일</th>
			<td><input type = "text" name = "username" placeholder = "이메일">@
			<select>
				<option value = "naver">naver.com</option>
				<option value = "daum">daum.com</option>
				<option value = "gmail">gmail.com</option>
				<option value = "anyone" selected>기타</option>
			</select> &nbsp;
			<input type = "button" value = "인증번호 전송" style = "border : 0px; color : white; background-color : black;">
			</td>
		</tr>
		<tr>
			<th align = "left" width = "90">인증번호</th>
			<td><input type = "text" name = "username" placeholder = "인증번호입력"> &nbsp;
			<input type = "button" value = "확인" style = "border : 0px; color : white; background-color : black;">
			</td>
		</tr>
	</table>
	<br>
	<input type = "button" value = "다음" style = "width : 75px; border : 0px; color : white; background-color : black;">
</div>

</body>
</html>