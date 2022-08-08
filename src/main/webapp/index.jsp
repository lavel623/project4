<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page language = "java" pageEncoding = "UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

	<style>
	
	
	html {
		font-size: 92.5%;
	}

	#firstsec {
		margin: 0 auto;
		margin-top: 2%;
		max-width: 90%;
		height: 100px;
		background-color:pink
	}

	#logo {
		margin: 0 auto;
		margin-left: 5%;
		width: 15%;
		max-width: 15%;
		border: 1px solid #000;
		height: 148px;
		float: left
	}

	#search {
		margin: 0 auto;
		margin-top: 1%;
		margin-left: 5%;
		width: 55%;
		max-width: 55%;
		border: 1px solid #000;
		height: 110px;
		float: left
	}

	#login {
		margin: 0 auto;
		margin-top: 2%;
		margin-left: 7%;
		width: 10%;
		max-width: 10%;
		border: 1px solid #000;
		height: 90px;
		float: left
	}

	#secondsec {
		margin: 3% auto;
		max-width: 116.8rem;
		height: 150px;
		clear: left
	}

	#choice {
		margin-top: 1%;
		margin-left: 7%;
		width: 15%;
		max-width: 15%;
		border: 1px solid #000;
		height: 120px;
		float: left
	}

	#region1 {
		margin-left: 15%;
		margin-top: 2%;
		width: 21%;
		height: 100px;
		float: left
	}

	#region2 {
		margin-left: 0%;
		margin-top: 2%;
		width: 21%;
		height: 100px;
		float: left
	}

	#region3 {
		margin-left: 0%;
		margin-top: 2%;
		width: 21%;
		height: 100px;
		float: left
	}

	#region4 {
		margin-left: 0%;
		margin-top: 2%;
		width: 10%;
		border: 1px solid #000;
		height: 100px;
		float: left
	}

	#region5 {
		margin-left: 0%;
		margin-top: 2%;
		width: 10%;
		border: 1px solid #000;
		height: 100px;
		float: left
	}

	#thirdsec {
		margin: 0 auto;
		position: relative;
		max-width: 76.8rem;
		height: 2000px;
		clear: left;
	}
	
	section ul, li{
		list-style:none;
	}

	</style>

<title>Insert title here</title>
</head>
<body>
<div style="text-align:center;">
	<h1 id="firstsec">게시판 프로그램</h1>
	
	<form id="secondsec" accept-charset="UTF-8">
	<ul  >
		
		<li id="region1"><a href="login.do">로그인</a></li>
		<li id="region2"><a href="getBoardList.do">글 목록 바로가기</a></li>
		<li id="region3"><a href="dataTransform.do">글 목록 변환 처리</a></li>
		
	</ul>
	</form>
</div>
</body>
</html>


