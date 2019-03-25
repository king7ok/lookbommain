<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="user.model.vo.LookBomUser" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>semi</title>
<style type="text/css">
/* HTML  CSS  JS Result
EDIT ON
 @import url(https://fonts.googleapis.com/css?family=Varela+Round); */
@media all and(max-width:670px){
	.slides {position:absolute;}
}

 body {
 padding:0px;
 margin:0px; /* background: #333 url("https://codepen.io/images/classy_fabric.png");  */
 border:1px slide rgba(67,67,67,0.9);
 align:center;

 }

.slides {
   z-index:2;
    width: 80vw;
    height: 80vh;
    display: block;
    margin: 0 auto;
     padding: 0;
    position: relative;
   
}

.slides * {
	z-index:0;
    user-select: none;
    -ms-user-select: none;
    -moz-user-select: none;
    -khtml-user-select: none;
    -webkit-user-select: none;
    -webkit-touch-callout: none;
}

.slides input { display: none; }

.slide-container { display: block; }

.slide {
    top: 0;
    opacity: 0;
    width: 80vw;
    height: 80vh;
    display: block;
    position: absolute;

    transform: scale(0);

    transition: all .7s ease-in-out;
}

.slide img {
    width: 100%;
    height: 100%;
}

.nav label {
    width: 200px;
    height: 100%;
    display: none;
    position: absolute;

      opacity: 0;
    z-index: 9;
    cursor: pointer;

    transition: opacity .2s;

    color: #FFF;
    font-size: 156pt;
    text-align: center;
    line-height: 380px;
    font-family: "Varela Round", sans-serif;
    background-color: rgba(255, 255, 255, .3);
    text-shadow: 0px 0px 15px rgb(119, 119, 119);
}

.slide:hover + .nav label { opacity: 0.5; }

.nav label:hover { opacity: 1; }

.nav .next { right: 0; }

input:checked + .slide-container  .slide {
    opacity: 1;

    transform: scale(1);

    transition: opacity 1s ease-in-out;
}

input:checked + .slide-container .nav label { display: block; }

.nav-dots {
    width: 100%;
    bottom: 9px;
    height: 11px;
    display: block;
    position: absolute;
    text-align: center;
}

.nav-dots .nav-dot {
    top: -5px;
    width: 11px;
    height: 11px;
    margin: 0 4px;
    position: relative;
    border-radius: 100%;
    display: inline-block;
    background-color: rgba(0, 0, 0, 0.6);
}

.nav-dots .nav-dot:hover {
    cursor: pointer;
    background-color: rgba(0, 0, 0, 0.8);
}

input#img-1:checked ~ .nav-dots label#img-dot-1,
input#img-2:checked ~ .nav-dots label#img-dot-2,
input#img-3:checked ~ .nav-dots label#img-dot-3,
input#img-4:checked ~ .nav-dots label#img-dot-4,
input#img-5:checked ~ .nav-dots label#img-dot-5,
input#img-6:checked ~ .nav-dots label#img-dot-6 {
    background: rgba(0, 0, 0, 0.8);
}

/* Resources 1×0.5×0.25× Rerun */
	#imgdiv{
	width:22vw;
	height:35vh;
    margin-bottom:0px;
    margin-left:35px; 
	margin-right:35px;
	margin-top:35px; 
	border:1px solid black;
	/* position:static; */
	
	}
	#textdiv{
	width:22vw;
	height:10vh;
	pading:35px;
	margin-top:0px;
	margin-bottom:50px;
	margin-left:35px;
	margin-right:35px;
	border:1px solid black;
	position:relative;
	}
	
	/* best아템이미지 사이즈 */
	body table tr td div img{
	
	height:300px;
	width:300px;
	}
	/* man women 버튼css*/
/* 	#men, */
	.womeon{
	background-color: white; /* Green */
 	border: none;
	padding:0px;
	margin:0;
	display: inline-block;
	}
</style>
</head>
<body style="margin:0px; padding:0px;">
 <%@ include file="views/common/header.jsp" %>
<br><br><br><br><br><br><br><br><br><br>

 
<ul class="slides">
    <input type="radio" name="radio-btn" id="img-1" checked />
    <li class="slide-container">
        <div class="slide">
            <a href="#"><img name="img1" src="http://farm9.staticflickr.com/8072/8346734966_f9cd7d0941_z.jpg" /></a>
        </div>
        <div class="nav">
            <label for="img-6" class="prev">&#x2039;</label>
            <label for="img-2" class="next">&#x203a;</label>
        </div>
    </li>

    <input type="radio" name="radio-btn" id="img-2" />
    <li class="slide-container">
        <div class="slide">
          <a href="#"><img name="img2" src="http://farm9.staticflickr.com/8504/8365873811_d32571df3d_z.jpg" /></a>
        </div>
        <div class="nav">
            <label for="img-1" class="prev">&#x2039;</label>
            <label for="img-3" class="next">&#x203a;</label>
        </div>
    </li>

    <input type="radio" name="radio-btn" id="img-3" />
    <li class="slide-container">
        <div class="slide">
          <a href="#"><img name= "img3"src="http://farm9.staticflickr.com/8068/8250438572_d1a5917072_z.jpg" /></a>
        </div>
        <div class="nav">
            <label for="img-2" class="prev">&#x2039;</label>
            <label for="img-4" class="next">&#x203a;</label>
        </div>
    </li>

    <input type="radio" name="radio-btn" id="img-4" />
    <li class="slide-container">
        <div class="slide">
         <a href="#"><img src="http://farm9.staticflickr.com/8061/8237246833_54d8fa37f0_z.jpg" /></a>
        </div>
        <div class="nav">
            <label for="img-3" class="prev">&#x2039;</label>
            <label for="img-5" class="next">&#x203a;</label>
        </div>
    </li>

    <input type="radio" name="radio-btn" id="img-5" />
    <li class="slide-container">
        <div class="slide">
          <a href="#"><img src="http://farm9.staticflickr.com/8055/8098750623_66292a35c0_z.jpg" /></a>
        </div>
        <div class="nav">
            <label for="img-4" class="prev">&#x2039;</label>
            <label for="img-6" class="next">&#x203a;</label>
        </div>
    </li>

    <input type="radio" name="radio-btn" id="img-6" />
    <li class="slide-container">
        <div class="slide">
         <a href="#"> <img src="http://farm9.staticflickr.com/8195/8098750703_797e102da2_z.jpg" /></a>
        </div>
        <div class="nav">
            <label for="img-5" class="prev">&#x2039;</label>
            <label for="img-1" class="next">&#x203a;</label>
        </div>
    </li>

    <li class="nav-dots">
      <label for="img-1" class="nav-dot" id="img-dot-1"></label>
      <label for="img-2" class="nav-dot" id="img-dot-2"></label>
      <label for="img-3" class="nav-dot" id="img-dot-3"></label>
      <label for="img-4" class="nav-dot" id="img-dot-4"></label>
      <label for="img-5" class="nav-dot" id="img-dot-5"></label>
      <label for="img-6" class="nav-dot" id="img-dot-6"></label>
    </li>
</ul>
<!-- 메인 포스트 수정버튼 관리자일때만 -->
<%-- <%if(loginUser != null && loginUser.getUserId().equals("admin")){ %>
<button value="수정하기"><a href="#"></a></button>
<%} %> --%>
<button value="pupBtn"><a href="views/adminMain/mainPostUpdate.jsp">수정하기</a></button>

<a href="views/common/header.jsp">헤더</a>
<a href="views/common/adminHeader.jsp">관리자헤더</a>
<a href="views/side/side1.jsp">사이드1</a>
<a href="views/side/side2.jsp">사이드2</a>
<a href="views/side/side3.jsp">사이드3</a>
<a href="views/side/side4.jsp">사이드4</a>
<a href="views/side/side5.jsp">사이드5</a>
<br>
<br>


<!-- Best 남/여 구분버튼 -->

<table>
<tr>
	<td style="width:5vw;"></td>
	<td style="width:3vw;"><h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BEST</h1></td>
	<td style="width:1vw;"></td>
	<td style="width:3vw;"><a class="man" onclick="menList();">MEN</a></td>
	<td style="width:3vw;"><a class="women" onclick="womenList();">WOMEN</a></td>
	<td></td>
</tr>
</table>


<table align = "center" >
<tr>
	<td id="imgdiv"></td>
	<td id="imgdiv"></td>
	<td id="imgdiv"></td>
	<td id="imgdiv"></td>
</tr>
<tr>
	<td id="textdiv"></td>
	<td id="textdiv"></td>
	<td id="textdiv"></td>
	<td id="textdiv"></td>
</tr>
<tr>
	<td id="imgdiv"></td>
	<td id="imgdiv"></td>
	<td id="imgdiv"></td>
	<td id="imgdiv"></td>
</tr>
<tr>
	<td id="textdiv"></td>
	<td id="textdiv"></td>
	<td id="textdiv"></td>
	<td id="textdiv"></td>
</tr>
</table>
<table>

</table>

 <%@ include file= "views/common/footer.jsp" %>

</body>
</html>