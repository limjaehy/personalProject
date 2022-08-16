<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>개인 프로젝트 (블로그)</title>
</head>
<body>
	<%@include file="/WEB-INF/views/common/header.jsp"%>
	<div class="main-content-study">
		<h1>MAIN PAGE</h1>
		<div class="container">
			<div class="photo">
				<div class="main-img">
					<img src="/resources/img/main/main_img1.jpg">
					<img src="/resources/img/main/main_img2.jpg">
					<img src="/resources/img/main/main_img3.jpg">
				</div>
			</div>
			<button class="prev">PREV</button>
			<button class="next">NEXT</button>
		</div>
	</div>
	<%@include file="/WEB-INF/views/common/footer.jsp"%>
</body>
<script>
	let curPos = 0;
	let postion = 0;
	const IMAGE_WIDTH = 640;
	const prevBtn = document.querySelector(".prev")
	const nextBtn = document.querySelector(".next")
	const images = document.querySelector(".main-img")

	function prev() {
		if (curPos > 0) {
			nextBtn.removeAttribute("disabled")
			postion += IMAGE_WIDTH;
			images.style.transform = `translateX(${postion}px)`;
			curPos = curPos - 1;
		}
		if (curPos == 0) {
			prevBtn.setAttribute('disabled', 'true')
		}
	}
	function next() {
		if (curPos < 3) {
			prevBtn.removeAttribute("disabled")
			postion -= IMAGE_WIDTH;
			images.style.transform = `translateX(${postion}px)`;
			curPos = curPos + 1;
		}
		if (curPos == 3) {
			nextBtn.setAttribute('disabled', 'true')
		}
	}

	function init() {
		prevBtn.setAttribute('disabled', 'true')
		prevBtn.addEventListener("click", prev)
		nextBtn.addEventListener("click", next)
	}

	init();
</script>
</html>