<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="main.model.vo.MainPost ,java.util.ArrayList"  %>
    <%
	ArrayList<MainPost> list = (ArrayList<MainPost>)request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="/semi/resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
/* if(message != null){
	alert(message);
}; */
/* if(message !=null){
	alert("message");
} */
	/* $("#update").click(function(){
		$.ajax({
			type:"post",
			url:
		})
	}); */
</script>
<style type="text/css">
 #row1 {
 	width:20vw;
 	height:20vh;
 	border:1px solid black;
 	margin:0;
 }
 #row1 img{
 	width:20vw;
 	height:20vh;
 }
 #row2 {
 	width:30vw;
 	height:10vh;
 	border:1px solid black;
 	align:center;
  }
 #url{
 width:15vw;
 height:3vh;
 font-size:800;
 }
 #viewmp {
 width:15vw;
 height:15vh;
 }
</style>
</head>
<body style="padding:0; margin:0;">
<%@ include file="../common/adminHeader.jsp" %>
<br><br><br><br><br><br><br><br><br><br>

<form name="mpselect" id="mpselect" method="post" action="/semi/mpselect" enctype="multipart/form-data">
<table align="center">
<tr>
<%-- 	<%for(int i =0;i<list.size();i++){ %>
		 <td><a id="viewbutton" href="<%= list.get(i).getUrl()%>"><img id="viewmp" src="<%= list.get(i).getImg()%>"></a></td>
		 <td><button type="checkbox" value="<%=i%>"></button></td>
		<%if(i == 4 ){ %>
		</tr><td><a id="viewbutton" href="<%= list.get(i).getUrl()%>"><img id="viewmp" src="<%= list.get(i).getImg()%>"></a></td>
		<td><button type="checkbox" value="<%=i%>"></button></td><tr> 
	
		<%} }%> --%>
			<%for(int i =0;i<list.size();i++){ %>
		 <td><img id="viewmp" src="<%= list.get(i).getImg()%>"></td>
		<%--  <td><button type="checkbox" value="<%=i%>"></button></td> --%>
		<%if(i == 4 ){ %>
		</tr><td><img id="viewmp" src="<%= list.get(i).getImg()%>"></td>
		<%-- <td><button type="checkbox" value="<%=i%>"></button></td> --%><tr> 
	
		<%} }%>

</tr>
</table>
</form>
<form name="mpost" id="mpost" method="post" action="/semi/mpinsert" enctype="multipart/form-data">
<table align="center">
<tr>
<td>url : </td><td><input type="text" name="url1"></td>
</tr>
<tr>
<td>img : </td><td><input type="text" name="img1"></td>
</tr>
<tr>
<td colspan="2" align="center"><button type="submit">등록</button></td>
</tr>
</table>
</form>
<br><br><br>
<table align="center">
	<tr><td><button>수정하기</button><button>돌아가기</button></td></tr>
</table>

<%@ include file= "../common/footer.jsp" %>
</body>
</html>