<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>time:<span id="showtime"></span></p>
	<input type = "button" id = "execute" value = "실행" />
	<input type="button" id="stop" value="중지" />
		
</body>

	<script type = "text/javascript" src = "http://code.jquery.com/jquery.min.js"></script>
	<script>
		$(document).ready(function(){
			$('#execute').on('click', function(e){
				e.preventDefault();
				updateData();
			});
			
		    $('#stop').on('click',function(e){
		        e.preventDefault();
		        clearTimeout(timerID); // 타이머 중지
		        $('#showtime').html('');
		    });    

		});
		
		function updateData(){
			$.ajax({
				url:"http://localhost:8090/GetServer",
				type:"get",
				cache:false,
				success:function(data){
					$('#showtime').html(data);
				}
			});
		
		timerID = setTimeout("updateData()", 1000);	// 2초 단위로 갱신 처리. 버튼 안 눌러도 자동 작동	
		}
	</script>
</html>