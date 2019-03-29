<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="../../resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
   $(".sidebar").offset(function(){
      
   })
</script>
<style type="text/css">
   body{margin:0; padding:0;}
   .stop{
   position:absolute;
   top:50vh;
   }
   .sidebar{
   /* border:1px solid black; */
   width:11vw;
   height:35vh;
   padding:1vw;
   position:sticky;
   left:1vw;
   top: 40vh;
   background:white;
   box-shadow:0 10px 20px 0 rgba(0,0,0,0.2);
   z-index:100;
   }

</style>

<head>
</head>
<body>



<side class="sidebar">
<content>
<table>
   <tr><td style="padding:1vh; color:black;"><a href="#">NEW</a></td></tr>
   <tr><td style="padding:1vh; color:black;"><a href="#">BEST</a></td></tr>
   <tr><td style="padding:1vh; color:black;"><a href="#">Outer</a></td></tr>
   <tr><td style="padding:1vh; color:black;"><a href="#">Top</a></td></tr>
   <tr><td style="padding:1vh; color:black;"><a href="#">Bottom</a></td></tr>
   <tr><td style="padding:1vh; color:black;"><a href="#">Accessories</a></td></tr>
   <tr><td style="padding:1vh; color:black;"><a href="#">Shoes</a></td></tr>
</table>
</content>
</side>



</body>
</html>