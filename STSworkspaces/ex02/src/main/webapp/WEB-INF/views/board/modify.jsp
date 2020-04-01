<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>    
<%@include file = "../includes/header.jsp" %> <!-- 상위로 가서 다시 includes 폴더의 header.jsp로 경로 설정한단 뜻 -->

            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Modify</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Modify Page
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                           <form role="form" action = "/board/modify" method="post">                           
                            <div class = "form-group">
                            	<label>글번호</label><input class = "form-control" name="bno"
                            	value = '<c:out value = "${board.bno }"/>' readonly="readonly"></div>
                            
                            <div class = "form-group"> 	
                             	<label>글제목</label><input class = "form-control" name="title"
                             	value = '<c:out value = "${board.title }"/>'></div>
                            
                            <div class = "form-group"> 	
                             	<label>작성자</label><input class = "form-control" name="writer"
                             	value = '<c:out value = "${board.writer }"/>' readonly="readonly"></div>
                            
                            <div class = "form-group"> 	
                             	<label>내용</label><textarea class = "form-control" rows="10" name="content"
                             	><c:out value = "${board.content }"/></textarea></div>
                                                     
        					<button type="submit" data-oper="modify" class="btn btn-default"> 
        					수정하기</button>
                            
                            <button type="submit" data-oper="remove" class="btn btn-danger"> 
        					삭제하기</button>
        					
                            <button type="submit" data-oper="list" class="btn btn-info">
                           	목록보기</button> 	
                             
                            </form> 
                          
                      
                        </div>
                        <!-- end panel-body -->
                    </div>
                    <!-- end panel-body -->
                </div>
                	<!-- end panel -->
            </div>
                 <!-- /.row -->
       
<script type="text/javascript">
$(document).ready(function(){
	
	var formObj = $("form");
	
	$("button").on("click", function(e){
		
		e.preventDefault();
		
		var operation = $(this).data("oper");
		console.log(operation);
		
		if(operation == "remove"){
			formObj.attr("action", "/board/remove");
		}
		else if(operation == "list"){
			self.location = "/board/list";
			return;
		}
		
		formObj.submit();
	});
});
</script>
    <%@include file="../includes/footer.jsp" %>
