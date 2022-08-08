<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<%@ page import="com.springquick.board.BoardServiceClient"%>
<%@ page import="com.springquick.user.UserServiceClient" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<%
	//out.println(BoardServiceClient.process());
	//out.println(BoardServiceClient.process());
%>

</body>
</html>
