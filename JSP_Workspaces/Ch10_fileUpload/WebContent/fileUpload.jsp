<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String uploadPath = request.getRealPath("/upload");
	System.out.println(uploadPath);
	int size = 1024 * 1024 * 10; // kb 단위. 지금 size는 10 MB
	MultipartRequest multi = null;
	String name = "";
	String subject = "";
	String filename1 = "";
	String filename2 = "";
	String ofile1 = "";
	String ofile2 = "";
	
	try {
		multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());
		name = multi.getParameter("name");
		subject = multi.getParameter("subject");
		
		Enumeration file = multi.getFileNames();	// 폼에서 전송되어 온 입력상자 이름 반환
		
		String file1 = (String)file.nextElement();	// 첫번째 입력상자 이름
		filename1 = multi.getFilesystemName(file1); // 서버상 업로드 된 파일 이름
		ofile1 = multi.getOriginalFileName(file1);	// 폼에서 선택된 파일 이름
		
		String file2 = (String)file.nextElement();	// 두번째 입력상자 이름
		filename2 = multi.getFilesystemName(file2); // 서버상 업로드 된 파일 이름
		ofile2 = multi.getOriginalFileName(file2);	// 폼에서 선택된 파일 이름

	}
	catch (Exception e){
		e.printStackTrace();
	}
		
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action = "fileCheck.jsp" method = "post">
<input type = "hidden" name = "name" value = "<%=name %>">
<input type = "hidden" name = "subject" value = "<%=subject %>">
<input type = "hidden" name = "filename1" value = "<%=filename1 %>">
<input type = "hidden" name = "filename2" value = "<%=filename2 %>">
<input type = "hidden" name = "ofile1" value = "<%=ofile1 %>">
<input type = "hidden" name = "ofile2" value = "<%=ofile2 %>">
<input type = "submit" value = "업로드 확인 및 다운로드">
</form>


</body>
</html>