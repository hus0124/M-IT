<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>time : <span id="showtime"></span></p>
	<input type="button" id="execute" value="실행" />
	<input type="button" id="stop" value="중지" />
</body>
<script type="text/javascript" src="//code.jquery.com/jquery.min.js"></script>
<script>
var timerID;
$(document).ready(function () {
    $('#execute').on('click',function(e){
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
      url: "GetServer",
      type: "get",
      cache : false,
      success: function(data){ // getserver 요청의 echo 결과값이 data 임
       $('#showtime').html(data);
      }
    });
    timerID = setTimeout("updateData()", 2000); // 2초 단위로 갱신 처리
}
</script>

</html>