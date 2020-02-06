<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
	int sum = 0;
	for(int i = 3; i < 501; i++){
		if ((i%2!=0)){
			sum+=i;
		}
	}
%>
3 ~ 500 까지의 홀수를 다 더한 값은 <%=sum %> 입니다.

	

</body>
</html>