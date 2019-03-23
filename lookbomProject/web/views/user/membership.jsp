<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>lb</title>
<script type="text/javascript" src = "/lb/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(function (){
	
	$("#all").on("change", function(){
		
		if(this.checked == true){
			$("#select td input[type = checkbox]").attr("checked", true);
		}else{
			$("#select td input[type = checkbox]").attr("checked",false);
		}
	});
});
function checkId(){
	$.ajax({
		url: "/lb/checkid",
		type: "post",
		data:{userid: $("#userid").val() },
		success: function(data){
			console.log("success : " + data);
			
			if(data == "ok"){
				alert("사용 가능한 아이디입니다.");
				$("#username").focus();
			} else {
				alert("이미 사용중인 아이디입니다. \n다시 입력하십시오.");
				$("#userid").select();
			}
			},
			error: function(jqXHR, textStatus, errorThrown){
				console.log("error : " + jqXHR + "," + textStatus + ", " + errorThrown);
			}
	});
	return false;
}

$(function(){
	$("#userpwd2").blur(function(){
		console.log("포커스 사라짐.");
		var pwd1 = $("#userpwd").val();
		var pwd2 = $("#userpwd2").val();
		
		if(pwd1 != pwd2){
			alert("암호와 암호확인이 일치하지 않습니다. \n다시 입력하십시오");
			$("#userpwd1").select();
		}
	});
});
</script>
</head>
<section>
	<h2 align = "center">회원가입</h2><br>
	<form action = "/lb/insert" method = "get">

	<table width = "650" align = "center">
		<tr height = "40">
		<th align = "left">*아이디</th>
		<td><input type = "text" name = "userid" id = "userid" placeholder = "내용을 입력하세요" border-color = "gray" required>
		&nbsp; <button onclick = "return checkId();">중복 확인</button></td>
		</tr>
		
		<tr height = "40">
		<th colspan = "2">*영문자 및 숫자만 기입</th>
		</tr>
		
		<tr>
		<th align = "left">*비밀번호</th>
		<td><input type = "password" name = "userpwd" id = "userpwd" placeholder = "내용을 입력하세요" border-color = "gray" required></td>
		</tr>
		
		<tr height = "40">
		<th align = "left">*비밀번호 확인</th>
		<td><input type = "password" id = "userpwd2" placeholder = "내용을 입력하세요" border-color = "gray" required>
		</tr>
		<tr height = "40">
		<th align = "left">*생년월일</th>
		<td>
		<input type = "date" name = "birth">
		</td>
		</tr>
		
		<tr height = "40">
		<th align = "left">*이메일</th>
		<td>
		<input type = "text" name = "email" id = "email" placeholder = "아이디">@
		<select name = "emailback">
			
			<option value = "naver.com">naver.com</option>
			<option value = "daum.com">daum.com</option>
			<option value = "gmail.com">gmail.com</option>
			<option value = "anyone" selected>기타</option>
		</select>
		</td>
		</tr>
			
		<tr height = "40">
		<th align = "left">*이름</th>
		<td><input type = "text" id = "username" name = "username" placeholder = "내용을 입력하세요" border-color = "gray" required></td>
		</tr>
		
		<tr height = "40">
		<th align = "left">*전화번호(-제외)</th>
		<td>
			<select name = "frontphone">
				<option value = "010" selected>010</option>
				<option value = "017">017</option>
				<option value = "011">011</option>
			</select>
			<input type = "text" name = "phone">
		</td>
		</tr>
		<tr height = "40">
		<th align = "left">*성별</th>
		<td>
			<input type = "radio" name = "gender" value = "M">남자 &nbsp;
			<input type = "radio" name = "gender" value = "F">여자
		</td>
		</tr>
		
  		<tr height = "40">
  			<th align = "left">*주소</th>
  			<td>
  			<table>
  			<tr>
  				<td width = "150"><input type = "text" name = "codepostal" required></td>
  				<td width = "150"><input type = "button" name = "findaddress" value = "주소찾기"></td>
  			</tr>
  			<tr>
  				<td><input type = "text" name = "address1" required></td>
  			</tr>
  			<tr>
  				<td><input type = "text" name = "address2" required></td>
  			</tr>
  			</table>
  			
  			</td>
  	
		<table align = "center" id = "select">
		<br><br>
	
			<tr>
				
				<td width = "250"><input type = "checkbox" required>이용약관(필수)</td> 
				<td width = "250"><input type = "checkbox" required>개인정보 수집 및 이용(필수)</td>
				
			</tr>
			<tr>
				<td width = "250"><input type = "checkbox" name = "check1" value = "Y" >이메일 수신 동의</td>
				<td width = "250"><input type = "checkbox" name = "check2" value = "Y" >SMS 수신동의</td>
			</tr>
			
			<tr align = "right">
				<td width = "250"><input type = "checkbox" id = "all" value = "checkall">전체동의</td>
				
			</tr>
		</table>
		<hr>
		<div align = "center">
		<br>
			<input type = "submit" value = "가입하기" style = "width : 300px; height : 60px; color : white; border : 0;background-color : black">&nbsp;
		</div>
		
		
	</form>
</section>


</body>
</html>