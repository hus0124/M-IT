package org.zerock.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {	//GetServer Uri가 get타입 요청되면 초를 텍스트로 응답하는 컨트롤러
	
	@GetMapping("/jQuery/ajax")
	public void ajax() {

	}
	
	@GetMapping("/GetServer")
	@ResponseBody // 객체 자체를 리턴하는 어노테이션
	public String second() {
		Calendar calendar=Calendar.getInstance();
	    int second=calendar.get(Calendar.SECOND);
	    System.out.println(second);
	    String str=Integer.toString(second); //현재 시간의 초를 문자로 만들었음
	    
	    return str;	// 어떤 특정 뷰를 열리게 하는게 아니라 초를 문자로 만든 str을 던짐
	}
}
