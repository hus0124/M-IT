<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>토토사이트</h3>
경기결과 예상. 축구경기 한국 VS 일본<br>
(도토리배당 : 한국승 2배, 일본승 4배, 무승부 3배)
<form name = "choice" action = "totoact">
결과선택 : 
<input type="radio" name="choice" value="korea">한국승
<input type="radio" name="choice" value="japan">일본승
<input type="radio" name="choice" value="draw">무승부
<br>
도토리 : <input type = "text" name = "stackTrace"><input type="submit" value="확인">
</form>
</body>
</html>