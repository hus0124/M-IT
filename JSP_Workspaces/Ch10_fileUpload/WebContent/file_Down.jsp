<%@page import="java.io.FileInputStream"%>
<%@page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String fileName = request.getParameter("file_name");
	String savePath = "upload";
	
	ServletContext context = getServletContext();
	String sDownloadPath = context.getRealPath(savePath); //물리적경로
	System.out.println(sDownloadPath);
	
	String sFilePath = sDownloadPath + "\\" + fileName; //풀경로
	
	byte b[] = new byte[4096];
	FileInputStream in = new FileInputStream(sFilePath);
	String sMimeType = getServletContext().getMimeType(sFilePath);
	
	if(sMimeType==null)
		sMimeType = "application/octet-stream";
	
	response.setContentType(sMimeType);
		
	fileName = URLEncoder.encode(fileName, "UTF-8").replace("\\+", "%20"); 	// 한글 이름 파일 위한 내용
	
	response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
	out.clear();	// jsp에서 처리하기 때문에 넣어줌
	out = pageContext.pushBody();	//jsp는 기본적으로 getOutputStream이 out 만들어진다
	
	ServletOutputStream out2 = response.getOutputStream();
	int numRead;
	while((numRead = in.read(b,0,b.length)) != -1){
		out2.write(b,0,numRead);
	}
	
	out2.flush();
	out2.close();
	in.close();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>