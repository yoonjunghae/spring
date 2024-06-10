<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

</head>
<body>
	<div id="total">
		<div id="center">
			<h3 style="text-align: center;">영화 등록 페이지</h3>
			<hr color="grey">
			<form action="insert" id="form" method="post" enctype="multipart/form-data" >
				<span class="input-group-text">TITLE</span>
				 <input type="text"
					class="form-control input-sm" name="title" placeholder="title"><br>
					
				<span class="input-group-text">IMG</span>
						파일 선택: <input type="file" name="singleFile" ><br>
					
				<span class="input-group-text">GENRE</span> 
				<input type="text"
					class="form-control" name="genre" placeholder="genre"><br>
					
				<span class="input-group-text">RUNNINGTIME</span> 
				<input
					type="text" class="form-control" name="runningTime"
					placeholder="runningTime"><br> 
					<span
					class="input-group-text">VIDEO</span> 
					<input type="text"
					class="form-control" name="link" placeholder="link"><br>
				<button type="submit" class="btn btn-secondary">등록</button>
			</form>
		</div>
	</div>
	
	<h3>multi file 업로드</h3>
	<form action="multi-file" method="post" encType="multipart/form-data">
		파일 : <input type="file" name="multiFiles" multiple><br>
		파일 설명 : <input type="text" name="multiFileDescription"><br>
		<input type="submit">
	</form>
	
</body>
</html>