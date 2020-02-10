<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page import="java.awt.Graphics2D" %>
<%@ page import="java.awt.image.renderable.ParameterBlock" %>
<%@ page import="java.awt.image.BufferedImage" %>
<%@ page import="javax.media.jai.JAI" %>
<%@ page import="javax.media.jai.RenderedOp" %>
<%@ page import="javax.imageio.ImageIO" %>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>
<%@ page import="java.io.*" %>
<% 
// 파일 업로드 부분
String uploadPath = request.getRealPath("/upload");
System.out.println(uploadPath);
int size = 1024 * 1024 * 10; // kb 단위. 지금 size는 10 MB
MultipartRequest multi = null;

String filename = "";

try {
	multi = new MultipartRequest(request, uploadPath, size, "UTF-8", new DefaultFileRenamePolicy());
		
	Enumeration file = multi.getFileNames();	// 폼에서 전송되어 온 입력상자 이름 반환
	
	String file1 = (String)file.nextElement();	// 첫번째 입력상자 이름
	filename = multi.getFilesystemName(file1); // 서버상 업로드 된 파일 이름
	
}
catch (Exception e){
	e.printStackTrace();
}

/* 이미지 파일 썸네일로 만들기 */

ParameterBlock pb = new ParameterBlock();
pb.add(uploadPath+"/"+filename); // 경로는 자신이 설정한 대로. 위에서 upload 설정했으니 여기서도 upload로 
RenderedOp rOp=JAI.create("fileload",pb);

BufferedImage bi= rOp.getAsBufferedImage();
BufferedImage thumb =new BufferedImage(100,100,BufferedImage.TYPE_INT_RGB);

Graphics2D g=thumb.createGraphics();
g.drawImage(bi,0,0,100,100,null);

File file = new File(uploadPath+"/sm_"+filename);
ImageIO.write(thumb,"jpg",file);

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