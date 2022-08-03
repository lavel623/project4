<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8">
	<title>Detail Information</title>
	<style>
	
	html {
		font-size: 62.5%;
	}
	
	#firstsec {
		margin: 0 auto;
		margin-top: 5%;
		max-width: 90%;
		background-color: blue;
		height: 150px;
	}
	
	#logo {
		margin: 0 auto;
		margin-left: 5%;
		width: 15%; 
		max-width: 15%;
		border: 1px solid #000;
		height: 148px;
		float: left;
	}
	
	#search {
		margin: 0 auto;
		margin-top: 1%;
		margin-left: 5%;
		width: 55%; 
		max-width: 55%;
		border: 1px solid #000;
		height: 110px;
		float: left;
	}
	
	#login {
		margin: 0 auto;
		margin-top: 2%;
		margin-left: 7%;
		width: 10%;
		max-width: 10%;
		border: 1px solid #000;
		height: 90px;
		float: left;
	}
	
	
	
	#secondsec {
		margin: 3% auto;
		max-width: 116.8rem;
		background-color: red;
		height: 150px;
		clear: left;
	}
	
	#choice {
		margin-top: 1%;
		margin-left: 7%;
		width: 15%;
		max-width: 15%;
		border: 1px solid #000;
		height: 120px;
		float: left;
	}
	
	#region1 {
		margin-left: 15%;
		margin-top: 2%;
		width: 10%;
		border: 1px solid #000;
		height: 100px;
		float: left
	}
	
	#region2 {
		margin-left: 0;
		margin-top: 2%;
		width: 10%;
		border: 1px solid #000;
		height: 100px;
		float: left
	}
	
	#region3 {
		margin-left: 0;
		margin-top: 2%;
		width: 10%;
		border: 1px solid #000;
		height: 100px;
		float: left
	}
	
	#region4 {
		margin-left: 0;
		margin-top: 2%;
		width: 10%;
		border: 1px solid #000;
		height: 100px;
		float: left
	}
	
	#region5 {
		margin-left: 0;
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
		background-color: concrete;
		height: 2000px;
		clear: left;
		border: 1px solid #000;
	}
	
	#foursec {
		margin: 0 auto;
    	position: relative;
		max-width: 76.8rem;
		background-color: concrete;
		height: 600px;
		clear: left;
		border: 1px solid #000;
	}
	
	#choiceregion {
		margin: 0 auto;
		
		margin-top: 1%;
		margin-bottom: 1%; 
		width: 80px;
		border: 1px solid #000;
		height: 60px;
		
	}
	
	#ficture {
		width: 20%;
		height: 100px;	
		margin-top: 4%;
		margin-left: 3.8%;
		position: relative;
		border: 1px solid #000;
		float: left;
	}
	
	#ficturetext {
		margin-top: 80%;
	}
	
	#ficture2 {
		width: 20%;
		height: 100px;	
		margin-top: 25%;
		margin-left: 3.8%;
		position: relative;
		border: 1px solid #000;
		float: left;
	}	
	
	
	</style>
</head>
<body>
	<div>
		<section id="firstsec">
			<article id="logo">
				
			</article>
			
			<article id="search">
				
			</article>
			
			<article id="login">
				
			</article>
			
		</section>
		
		<section id="secondsec">
			<article id="choice">
				
			</article>
			
			<article id="region1">
				
			</article>
			
			<article id="region2">
				
			</article>
			
			<article id="region3">
				
			</article>
			
			<article id="region4">
				
			</article>
			
			<article id="region5">
				
			</article>
		</section>
		
		<section id="choiceregion">서울/경기</section>
		
		<section>
			<div id="foursec">
				<section>
					<article id="ficture"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
						
					
					<article id="ficture"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
					
					<article id="ficture"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
					
					<article id="ficture"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
				</section>
		
				<section>
					<article id="ficture2"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
					
					<article id="ficture2"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
					
					<article id="ficture2"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
					
					<article id="ficture2"><textarea rows="4" cols="18" id="ficturetext" readonly></textarea></article>
				</section>
			</div>
		</section>
		
		
		
	</div>
</body>
</html>