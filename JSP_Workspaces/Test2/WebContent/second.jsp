<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
String num1 = request.getParameter("num1");
String num2 = request.getParameter("num2");

int num11 = Integer.parseInt(num1);
int num22 = Integer.parseInt(num2);

int tmp;
if (num11 > num22){
	tmp = num11;
	num11 = num22;
	num22 = tmp;
}
int sum = 0;
for(int i = num11 ; i <=num22; i++){
	sum+=i;
}

%>
<b>요청하신 <%=num1 %>~<%=num2 %>까지의 총합은 <%=sum %> 입니다.</b>

</body>
</html>