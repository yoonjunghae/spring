<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

</script>
</head>
<body>

회원가입페이지입니다.<br>

<hr> 


			
		
	
<h3>회원가입</h3>
<form action="insert" method="post">
	id : <input name="id"> <br>
	pw : <input name="pw"> <br>
	name : <input name="name"> <br>
	tel : <input name="tel"> <br>
	<button>서버로 전송</button>
</form>
<hr> 
<h3>로그인</h3>
<form action="login" method="post">
	id : <input name="id"> <br>
	pw : <input name="pw"> <br>
	<button>서버로 전송</button>
</form>
<hr> 
<h3>회원탈퇴</h3>
<form action="delete">
	id : <input name="id" value="test"> <br>
	<button>서버로 전송</button>
</form>

</body>
</html>