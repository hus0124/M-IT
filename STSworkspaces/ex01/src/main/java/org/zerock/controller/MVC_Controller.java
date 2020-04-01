package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MVC_Controller {

	@RequestMapping("/ex05")
	public void ex05() {
		
	}
	
	@RequestMapping("/ex06")
	public String ex06() {
		return "redirect:abc"; //abc 요청해서 abc.jsp로 간다
	}
	
	@RequestMapping("/abc")
	public void ex07() {
		
	}
	
	@RequestMapping("/test3")
	public void ex08(Model model) {
		ProductVO product = new ProductVO();
		product.setCount(100);
		product.setName("sample P");
		model.addAttribute("prod", product);
		//model.addAttribute(product); 이었다면 productVO 즉 소문자로 시작하는 클래스 이름으로 읽어야 함.
	}
	
	@RequestMapping("/test4")
	public @ResponseBody ProductVO ex08() {
		ProductVO product = new ProductVO();
		product.setCount(100);
		product.setName("sample P");
		return product;
	}
	
	@RequestMapping("/form")
	public void formform() {
		// 동일한 이름으로 맵핑. 리턴 없어도 되는 void
	}
	
	@RequestMapping("/ex01")
	public void ex01(SampleDTO sDTO) { //SampleDTO에 선언한 변수들의 이름과 타입까지 맵핑해 줌.
		System.out.println(sDTO.getName());
		System.out.println(sDTO.getNum1());
		System.out.println(sDTO.getNum2());
		
	}
}
