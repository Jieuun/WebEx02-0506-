<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/WebEx02/param" method="post">
	
	아이디 : <input type="text" name ="id"><br>
	비밀번호 : <input type="text" name ="pwd"><br>
	나이 : <input type="text" name="age"><br><br><br>
	<input type="radio" id="gender" name="gender" value="남자" checked> 남자
	<input type="radio" id="gender" name="gender" value="여자" checked> 여자 <br><br>
	
	관심항목을 선택하세요
	<input type="checkbox" name="hobby" value="영화">영화
	<input type="checkbox" name="hobby" value="음악">음악
	<input type="checkbox" name="hobby" value="운동">운동
	<input type="checkbox" name="hobby" value="먹기">먹기<br><br>
	
	직업
	<select id="job" name="job" size="1">
	<option value="">선택하세요</option>
	<option value="학생">학생</option>
	<option value="회사원">회사원</option>
	<option value="공무원">공무원</option>
	<option value="서비스업">서비스업</option>
	<option value="군인">군인</option>
	<option value="기타">기타</option>
	</select><br><br>
	
	<input type="submit" value="회원가입">

	</form>
	<br>


</body>
</html>