<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<h1>글 상세</h1>
		<a href="logout.do">로그아웃</a>
		<hr>
		<form action="updateRestaurantour.do" method="post">
			<input name="seq" type="hidden" value="${restaurantour.seq }" />
			<table>
				
				<tr>
					<td style="width: 70px">이름</td>
					<td style="text-align:center">
						<input name="title" type="text" value="${restaurantour.marketname }">
					</td>
				</tr>
				
				<tr>
					<td style="width: 70px">설명</td>
					<td style="text-align:center; type:text">${restaurantour.explanation }</td>
				</tr>
				
				<tr>
					<td style="width: 70px">지역</td>
					<td style="text-align:center; type:text">${restaurantour.region }</td>
				</tr>
				
				<tr>
					<td style="width: 70px">주소</td>
					<td style="text-align:center; type:text">${restaurantour.location }</td>
				</tr>
				
			</table>
		</form>
	</section>
	
	<section>
		<a href="mainPage.jsp">메인페이지로 되돌아가기</a>
		<a href="getRestaurantourList.jsp">목록 페이지로 되돌아가기</a>
	</section>
</body>
</html>