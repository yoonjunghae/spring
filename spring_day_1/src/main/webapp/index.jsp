<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	welcome!! spring world!!! <a href="hi">hi call</a>
	<hr color="red">
	<img src="resources/img/ok.JPG"> <!-- 파일 대소문자 확인 잘하기~  -->
	<br><br>
	<!-- <a href = "WEB-INF/views/member.jsp"> 
			<button id="b1">첫페이지로</button>
		</a>  --><!-- WEB-INF안에 있는페이지 보안상 찾을 수 없음 404p ctrl shift / 영역잡고 주석처리 -->
		
		 <jsp:forward page="WEB-INF/views/member.jsp"/>

</body>
</html>