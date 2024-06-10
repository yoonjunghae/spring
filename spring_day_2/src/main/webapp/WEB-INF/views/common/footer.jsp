<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    /* div{border:1px solid red;} */
    #footer{
        width:80%;
        height:200px;
        margin:auto;
        margin-top:50px;
    }
    #footer-1{
        width:100%;
        height:20%;
        border-top:1px solid lightgray;
        border-bottom:1px solid lightgray;
    }
    #footer-2{
        width:100%;
        height:80%;
    }
    #footer-1, #footer-2{
        padding-left:50px
    }

    #footer-1 > a{
        text-decoration:none;
        font-weight: 600;
        margin:10px;
        line-height: 40px;
        color: black;
    }
    #footer-2>p{
        margin: 0;
        padding:10px;
        font-size: 13px;
    }
    #p2{
        text-align:center;
    }
</style>
</head>
<body>
	<div id="footer">
        <div id="footer-1">
            <a href="#">이용약관</a> | 
            <a href="#">개인정보취급방침</a> | 
            <a href="#">인재채용</a> | 
            <a href="#">고객센터</a> 
        </div>

        <div id="footer-2">
            <p id="p1">
                1관 : 서울특별시 강남구 테헤란로 1 UNI 빌딩 2F, 3F, 4F, 5F <br>
                2관 : 서울특별시 강남구 테헤란로 2 UNI 빌딩 4F, 5F, 7F <br>
               
             
            </p>
            <p id="p2">Copyright ⓒ UNI Information Educational Institute All Right Reserved</p>     
        </div>
    </div>
</body>
</html>