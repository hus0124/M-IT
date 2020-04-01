package org.zerock.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {	//GetServer Uri�� getŸ�� ��û�Ǹ� �ʸ� �ؽ�Ʈ�� �����ϴ� ��Ʈ�ѷ�
	
	@GetMapping("/jQuery/ajax")
	public void ajax() {

	}
	
	@GetMapping("/GetServer")
	@ResponseBody // ��ü ��ü�� �����ϴ� ������̼�
	public String second() {
		Calendar calendar=Calendar.getInstance();
	    int second=calendar.get(Calendar.SECOND);
	    System.out.println(second);
	    String str=Integer.toString(second); //���� �ð��� �ʸ� ���ڷ� �������
	    
	    return str;	// � Ư�� �並 ������ �ϴ°� �ƴ϶� �ʸ� ���ڷ� ���� str�� ����
	}
}
