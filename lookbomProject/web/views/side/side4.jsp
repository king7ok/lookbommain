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

</style>

<head>
</head>
<body>
<%@ include file="../common/header.jsp" %>


<aside class="sidebar">
<table>
	<tr><td style="padding:1vh; color:black;"><a href="#">NEW</a></td></tr>
	<tr><td style="padding:1vh; color:black;"><a href="#">BEST</a></td></tr>
	<tr><td style="padding:1vh; color:black;"><a href="#">Outer</a></td></tr>
	<tr><td style="padding:1vh; color:black;"><a href="#">Top</a></td></tr>
	<tr><td style="padding:1vh; color:black;"><a href="#">Bottom</a></td></tr>
	<tr><td style="padding:1vh; color:black;"><a href="#">Accessories</a></td></tr>
	<tr><td style="padding:1vh; color:black;"><a href="#">Shoes</a></td></tr>
</table>
</aside>

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


 <%@ include file= "../common/footer.jsp" %>
</body>
</html>