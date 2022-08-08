<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page language = "java" pageEncoding = "UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

	<style>
	
	
	
	html {
		font-size: 62.5%;
	}

	#firstsec {
		margin: 0 auto;
		margin-top: 5%;
		max-width: 90%;
		height: 100px;
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
		margin-left: 5%:
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
		margin: 0 auto;
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
		width: 10%:
		border: 1px solid #000;
		height: 100px;
		float: left
	}

	#region2 {
		margin-left: 50%;
		margin-top: 30%;
		width: 10%:
		border: 1px solid #000;
		height: 100px;
		float: left
	}

	#region3 {
		margin-left: 0%;
		margin-top: 2%;
		width: 10%:
		border: 1px solid #000;
		height: 100px;
		float: left
	}

	#region4 {
		margin-left: 0%;
		margin-top: 2%;
		width: 10%:
		border: 1px solid #000;
		height: 100px;
		float: left
	}

	#region5 {
		margin-left: 0%;
		margin-top: 2%;
		width: 10%:
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

	</style>




<title>새글등록</title>
</head>
<body>
	<center>
	<div>
		
	</div>
		<h1>글 등록</h1>
		<a href="logout_proc.jsp">Log-out</a>
	
		<!-- <form action="insertBoard_proc.jsp" method="post"> -->
		<form id="secondsec" action="insertBoard.do" method="post" enctype="multipart/form-data">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">작성자</td>
					<td align="left"><input type="text" value="${sessionid}" name="writer" size="10" readonly /></td>
				</tr>
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left"><textarea name="content" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td bgcolor="orange" width="70">업로드</td>
					<td align="left">
						<input type="file" name="uploadFile" />
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value=" 새글 등록 " /></td>
				</tr>
			</table>
		</form>
		<div id="thirdsec">
		<!-- <a href="getBoardList.jsp">글 목록 가기</a> -->
		
			<a href="getBoardList.do" id="region2">글 목록 가기</a>
			
		</div>
	
	</center>
	
</body>
</html>