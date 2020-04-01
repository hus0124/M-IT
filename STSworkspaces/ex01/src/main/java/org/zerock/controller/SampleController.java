package org.zerock.controller;

//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

//import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*") // �ϴ� sample�� ����. �� ���� ���� �޼ҵ���� �ּҿ� �̾���.
@Log4j
public class SampleController {
	
//	@RequestMapping("")
//	public void basic() {
//		log.info("basic.........................");
//	}
	
	@RequestMapping(value="/basic", method = {RequestMethod.GET, RequestMethod.POST}) // "basic" �� ���� �Ͱ� ����
	public void basicGet() {
		log.info("basic get.....................");
	}
	
	@GetMapping("/basicOnlyGet")
	public void basicGet2() {
		log.info("basic get only get.............");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO sDTO) {
		log.info("" + sDTO);
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name:" + name);
		log.info("age:" + age);
		return "ex01";
	}
	
	@GetMapping("/ex02List")
	public void ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("ids"+ids);
	}
	
	@GetMapping("/ex02Array")
	public void ex02List(@RequestParam("ids") String[] ids) {
		log.info("ids"+ Arrays.toString(ids));
	}

	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) { //uri : ex02Bean?list[0].name=aaa&list[1].name=bbb
		log.info("list dtos : " + list);
		return "ex02Bean";
	}
	
/*	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
	}*/
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("todo :" + todo);
		return "ex03";
	}
	
	//uri : /sample/ex04?name=aaa&age=11&page=9
	
	@GetMapping("/ex04")
	public void ex04(SampleDTO sDTO, int page) { //�⺻�� ������ �ʹٸ� @Modelattribute("page") int page �� ������
		log.info("sDTO Ȯ�� : " + sDTO);
		log.info("page Ȯ�� : " + page);
		
	}
}