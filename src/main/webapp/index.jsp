<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 프로젝트 (블로그)</title>
<link href="/resources/css/index.css" rel="stylesheet"> <!-- css여기서 일괄관리 -->
<link href="https://fonts.googleapis.com/css2?family=Edu+VIC+WA+NT+Beginner&display=swap" rel="stylesheet">
</head>
<style>
body{
	display: flex;
	align-items: center;
    justify-content: center;
}
.main-header>div {
	text-align: center;
}
.main-header-title {
	margin: 10px;
	font-family: 'Edu VIC WA NT Beginner', cursive;
}
h2 {
	margin: 15px;
}
.header-sub-menu>ul {
	display: flex;
	list-style: none;
	justify-content: center;
	padding: 0;
	border-bottom: 1px solid black;
	border-top: 1px solid black;
}
.header-sub-menu>ul>li {
	margin: 10px;
	margin-left: 30px;
	margin-right: 30px;
}
.header-sub-menu>ul>li>a {
	width: 100%;
	height: 100%;
	color: black;
	text-decoration: none;
}
.header-sub-menu>ul>li>a:hover {
	color: blue;
	transition: 0.5s;
}
.main{
	width: 1200px;
	display: flex;
	flex-direction: column;
	margin: 0;
}
.main-content-study{
	width: 100%;
	height: 400px; /*auto로 변경예정*/
	border: 1px solid black;
	margin-bottom: 10px;
}
.main-footer{
	width: 100%;
	height: 150px; /*auto로 변경예정*/
}
</style>
<body>
	<div class="main">
		<div class="main-header">
			<div>
				<h1 class="main-header-title">Lim's Blog</h1>
			</div>
			<div class="header-sub-menu">
				<ul>
					<li><a href="/studyMain.do">STUDY</a></li>
					<li><a href="#">PHOTO</a></li>
					<li><a href="#">INFO</a></li>
				</ul>
			</div>
		</div>
		<div class="main-content-study">
			이미지자리
		</div>
		<div class="main-footer">
			임재형 웹페이지에 오신것을 환영합니다. 개인 공부 페이지 입니다.
		</div>
	</div>
</body>