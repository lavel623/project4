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
		font-size: 92.5%;
	}
	
	#firstdiv {
	}

	#seconddiv {
		margin: 0 auto;
	}
	
	#firstsec {
		margin: 0 auto;
		margin-top: 2%;
		max-width: 90%;
		height: 150px;
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
		
		clear: left
	}
	
	#maintable {
		margin: 0 auto;
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

	#region {
		
		float: left
	}

	#thirdsec {
		margin: 0 auto;
		position: relative;
		max-width: 76.8rem;
		height: 2000px;
		clear: left;
	}
	
	#listsec {
		display: flex;
 		justify-content: space-between;
	}

	</style>

<title>글 상세</title>
</head>
<body>
	<div id="firstdiv">
		<section id="firstsec">
			<h1 style="margin-left:50%; text-align:center; display:inline-block">글 상세</h1>
			<h1 style="margin-right:10px; margin-top:10px; float:right"><a href="logout.do">Log-out</a></h1>
		</section>
		<div id="seconddiv">
			<form action="updateBoard.do" method="post" id="secondsec">
				<input name="seq" type="hidden" value="${board.seq}" />
				<table id="maintable" border="1" cellpadding="0" cellspacing="0">
					<tr>
						<td bgcolor="orange" width="70">제목</td>
						<td align="left"><input name="title" type="text"
							value="${board.title}" /></td>
					</tr>
					<tr>
						<td bgcolor="orange">작성자</td>
						<td align="left">${board.writer}</td>
					</tr>
					<tr>
						<td bgcolor="orange">내용</td>
						<td align="left"><textarea name="content" cols="40" rows="10">
							${board.content}</textarea></td>
					</tr>
					<tr>
						<td bgcolor="orange">등록일</td>
						<td align="left">${board.regDate}</td>
					</tr>
					<tr>
						<td bgcolor="orange">조회수</td>
						<td align="left">${board.cnt}</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit"
							value="글 수정" /></td>
					</tr>
				</table>
			</form>
		</div>
		<div id="thirdsec">
		<section id="listsec" style="width: 30%; height:20%; margin: 0 auto;">
			<h1 style="float:left"><a href="insertBoard.jsp" id="region">글등록</a></h1>
			<h1 style="float:left"><a href="deleteBoard.do?seq=${board.seq}" id="region">글삭제</a></h1>
			<h1 style="float:left"><a href="getBoardList.do" id="region">글목록</a></h1>
		</div>
		</section>
	</div>
</body>
</html>
