<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page language = "java" pageEncoding = "UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%
 
    request.setCharacterEncoding("UTF-8");
 
%>

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

	</style>

<title>글 목록</title>
</head>
<body>
	<center>
		<h1><spring:message code="message.board.list.mainTitle"/></h1>
		<h3>
			<!-- 테스트님 환영합니다...<a href="logout_proc.jsp">Log-out</a> -->
			${userName}<spring:message code="message.board.list.welcomeMsg"/>...<a href="logout.do">Log-out</a>
		</h3>
		<!-- 검색 시작 -->
		<!-- <form action="getBoardList.jsp" method="post"> -->
		<form action="getBoardList.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<!-- <option value="TITLE">제목 -->
							<!-- <option value="CONTENT">내용 -->
							<c:forEach items="${conditionMap}" var="option">
								<option value="${option.value}">${option.key}
							</c:forEach>
						</select>
						<input name="searchKeyword" type="text" />
						<input type="submit" value="<spring:message code="message.board.list.search.condition.btn"/>" /></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 -->
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100">
				<spring:message	code="message.board.list.table.head.seq" /></th>
				<th bgcolor="orange" width="200">
				<spring:message code="message.board.list.table.head.title" /></th>
				<th bgcolor="orange" width="150">
				<spring:message code="message.board.list.table.head.writer" /></th>
				<th bgcolor="orange" width="150">
				<spring:message code="message.board.list.table.head.regDate" /></th>
				<th bgcolor="orange" width="100">
				<spring:message code="message.board.list.table.head.cnt" /></th>
			</tr>

			<c:forEach items="${boardList}" var="board">
				<tr>
					<td>${board.seq}</td>
					<td align="left"><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
					<td>${board.writer}</td>
					<td>${board.regDate}</td>
					<td>${board.cnt}</td>
				</tr>
			</c:forEach>

		</table>
		<br> <a href="insertBoard.jsp"><spring:message code="message.board.list.link.insertBoard"/></a>
	</center>
</body>
</html>