<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ page import = "user.model.vo.LookBomUser, search.model.vo.Search" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="/first/resources/js/jquery-3.3.1.min.js">
</script>
<script type="text/javascript">

</script>

<style type="text/css">
	#topbar {
	width:100%;
	height:50px;
	background:black;
	margin: 0px;
	padding:  0px;
	}
	#logo2{
	width:100px;
	height:100px;
	float:left;
	padding : 10px;
	}
	#logo{
	width:200px;
	height:50px;
	position:relative;
	top:10px;
	left:10px;
	padding-botton: 20px;
	}
	body{
 color:black;
 font-family:"맑은고딕";
 font-size: 15px;
 font-weight: bold;

 }
	 a{
 text-decoration:none;
 }
 	ul,ol,li{
 margin:0;
 padding:0;
 list-style-type:none;
 }
 	#navi li{
 float:left;
 position:relative;
 top:10px;
 line-height:40px;
 color:black;
 }
 	#navi li a{
  display:block;
  padding:0 10px;
  color:black;
  margin:0;'
  
 
 }
 	#navi li a:hover{
 font-weight:bold;
 border-bottom:3px solid black;
 background: white;
 color:black;
 }
 	#navi li ul{
 position:absolute;
 opacity:0;
 width:180px;
 box-shadow:0 10px 20px 0 rgba(0,0,0,0.2);
 -webkit-boix-shadow:0 12px 25px 0 rgba(0,0,0,0.2);
 }
 	#navi li:hover ul{
 opacity:1;
 }
 	#navi li ul li{
 float:none;
 position:static;
 height:0;
 line-height:0;
 background:none;
 }
 	#navi li:hover ul li{
 padding:10px 10;
 height:50px;
 line-height:40px;
 background:rgba(0,0,0,0.4);
 
 }
	 #mybar{
 float:left;
 color:black;
 font-size:small;
 }
	 #mybar img{
 width:15px;
 height:15px;
 padding-top:15px;
 padding-left:15px;
 }
	#myBtn img{
		width:50px;
 	height:50px;

 }
 	#myBtn{
 /* 	width:50px;
 	height:50px;
 	display:inline;;
 	position:relative;
 	top:30px;
 	 */
 	   background-color: white; /* Green */
 	 border: none;
  position:relative;
 	top:30px;
 	left:-20px;
  	width:50px;
 	height:50px;
	
	  display: inline-block;

 	}
 		#mybtn:hover{
 	cursor:pointer;
 	}
	/* The Modal (background) */
        .modal {
            display: none; /* Hidden by default */
            position: fixed; /* Stay in place */
            z-index: 1; /* Sit on top */
            left: 0;
            top: 0;
            width: 100%; /* Full width */
            height: 100%; /* Full height */
            overflow: auto; /* Enable scroll if needed */
            background-color: rgb(0,0,0); /* Fallback color */
            background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
        }
    
        /* Modal Content/Box */
        .modal-content {
            background-color: #fefefe;
            margin: 15% auto; /* 15% from the top and centered */
            padding: 20px;
            border: 1px solid #888;
            width: 50%; /* Could be more or less, depending on screen size */                          
        }
        /* The Close Button */
       .close {
            color: #aaa;
            float: right;
            font-size: 28px;
            font-weight: bold;
        }
        .close:hover,
        .close:focus {
            color: black;
            text-decoration: none;
            cursor: pointer;
        }
        #loginUser h3{
        padding:0px;
        margin:0px;
        color: white;
        float : left;
        position:relative;
        top:10px;
        left:10px;
        }
    
	#rank {
	position:relative;
	top:30px;
	left:100px;
	width:200px;
	height:35px;
	float:left;
	}

</style>

<body style="margin:0px; padding:0px;">
<header>
<div id="topbar">
	<div id="loginUser" style="background: pink; height: 50px;; width: 300px;"><!-- 로그인시 유저명이랑 포인트  -->
	<%-- 	<%if(loginUser != null) {%>
		<h3>이름 : <%=loginUser.getUserName() %></h3>&nbsp;&nbsp;	<h3>포인트 : <%= loginUser.getAge() %></h3>
		<%}else{ %>
		<h3>이름      &nbsp;&nbsp;</h3><h3>포인트</h3>
		<%} %> --%>
	</div>
</div>
<div class ="top_fix_zone" id="topbar1">
<a href="#" ><img src="/semi/resources/images/로고2.png" id="logo2"></a>
<a href="#"><img src="/semi/resources/images/로고.png" id="logo"></a>

<div  style="width:26%;height:130px;  float:right;">
<a id="mybar" href="#"><img src="/semi/resources/images/로그인.jpg">상품관리</a>
<a id="mybar" href="#"><img src="/semi/resources/images/회원가입.jpg">회원관리</a>
<a id="mybar" href="#"><img src="/semi/resources/images/게시판관리.jpg">게시판관리</a>
<a id="mybar" href="#"><img src="/semi/resources/images/주문관리.jpg">주문관리</a><br>

<!-- 실시간 랭킹바  -->
<select id="rank" name="rank">
	<option id="rank1">1.</option>
	<option id="rank2">2. </option>
	<option id="rank3">3.</option>
	<option id="rank4">4. </option>
	<option id="rank5">5. </option>
	<option id="rank6">6. </option>
	<option id="rank7">7. </option>
	<option id="rank8">8.></option>
	<option id="rank9">9. </option>
	<option id="rank10">10.</option>
</select>
<button id="myBtn" onclick=""><img src="/semi/resources/images/검색.jpg"></button>

</div>

<!--  메뉴 바 -->
<ul id="navi">	
<li class="on"><a href="index.jsp">MEN</a>
	<ul>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
	</ul>
</li>
<li><a href="index.jsp">WOMEN</a>
<ul>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
	</ul>
</li>
<li><a href="index.jsp">BRAND</a>
	<ul>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
	</ul>
</li>
<li><a href="index.jsp">ACC</a>
	<ul>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
	</ul>
</li>
<li><a href="index.jsp">BRAND</a>
	<ul>
		<li><a href="#">1</a></li>
		<li><a href="#">2</a></li>
		<li><a href="#">3</a></li>
		<li><a href="#">4</a></li>
	</ul>
</li>
</ul>
</div>
<br><br>
<br><br>
<br><br>
<br><br>
<br><br>
<br><br>
<!-- 검색창  -->
</header>
