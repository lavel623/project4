<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ page language = "java" pageEncoding = "UTF-8" contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%
 
    request.setCharacterEncoding("UTF-8");
 	response.setContentType("text/html; charset=UTF-8");
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
	
	#instance{
		margin-top: 5%;
	}

	</style>

<title><spring:message code="message.user.login.title"/></title>
</head>
<body>

	
	<center>
		<h1 id="firstsec"><spring:message code="message.user.login.title"/></h1>
		<div id="secondsec">
			<a href="login.do?lang=en">
		<spring:message code="message.user.login.language.en"/></a>&nbsp;&nbsp;
			<a href="login.do?lang=ko">
		<spring:message code="message.user.login.language.ko"/></a>
		
	
		<form action="login.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange"><spring:message code="message.user.login.id"/></td>
					<td><input type="text" name="id" value="${user.id }" /></td>
				</tr>
				<tr>
					<td bgcolor="orange"><spring:message code="message.user.login.password"/>
					<td><input type="password" name="password" value="${user.password }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
					<input type="submit" value="<spring:message code="message.user.login.loginBtn"/>"/>
				</tr>
			</table>
		</form>
		</div>
	</center>
	
</body>
</html>