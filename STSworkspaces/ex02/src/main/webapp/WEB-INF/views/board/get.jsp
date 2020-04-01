<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>    
<%@include file = "../includes/header.jsp" %> <!-- 상위로 가서 다시 includes 폴더의 header.jsp로 경로 설정한단 뜻 -->

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Board Read</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Board Read Page
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                                                      
                            <div class = "form-group">
                            	<label>글번호</label><input class = "form-control" name="bno"
                            	value = '<c:out value = "${board.bno }"/>' readonly="readonly"></div>
                            
                            <div class = "form-group"> 	
                             	<label>글제목</label><input class = "form-control" name="title"
                             	value = '<c:out value = "${board.title }"/>' readonly="readonly"></div>
                            
                            <div class = "form-group"> 	
                             	<label>작성자</label><input class = "form-control" name="writer"
                             	value = '<c:out value = "${board.writer }"/>' readonly="readonly"></div>
                            
                            <div class = "form-group"> 	
                             	<label>작성일자</label><input class = "form-control" name="regDate"
                             	value = '<fmt:formatDate pattern = "yyyy/MM/dd" value = "${board.regdate }"/>' readonly="readonly"></div>
                            
                            <div class = "form-group"> 	
                             	<label>수정일자</label><input class = "form-control" name="updateDate"
                             	value = '<fmt:formatDate pattern = "yyyy/MM/dd" value = "${board.updateDate }"/>' readonly="readonly"></div>
                             	
                            <div class = "form-group"> 	
                             	<label>내용</label><textarea class = "form-control" rows="10" name="content"
                             	readonly = "readonly"><c:out value = "${board.content }"/></textarea></div>
                            
        					<button data-oper="modify" class="btn btn-default" 
        					onclick="location.href='/board/modify?bno= <c:out value="${board.bno }"/>'">편집하기</button>
                            <button data-oper="list" class="btn btn-info"
                            onclick="location.href='/board/list'">목록보기</button> 	
                             
                          
                      
                        </div>
                        <!-- end panel-body -->
                    </div>
                    <!-- end panel-body -->
                </div>
                	<!-- end panel -->
            </div>
                 <!-- /.row -->
       

    <%@include file="../includes/footer.jsp" %>
