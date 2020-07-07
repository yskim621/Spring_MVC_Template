<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터 전송</title>
</head>
<body>
	<!-- action 생략 시 이 페이지에 오게된 요청 : form 
		 method 생략 시 get
		 enctype file이 있을 때만 multipart/form-data를 설정-->
	<form id="paramform" method="post">
		이름:<input type="text" name="name" id="name"/><br/>
		전화번호:<input type="text" name="phone" id="phone" /><br/>
		나이:<input type="text" name="age" id="age" /><br/>
		<!-- Web에서'만' form 작성시 -->
		<input type="submit" value="전송" />
		<!-- 모바일 등 여러 기기를 다루려면 ajax요청을 해야하며 아래와 같이 해야함 -->
		<input type="button" value="전송" id="ajaxbtn" />
	</form>
</body>
</html>