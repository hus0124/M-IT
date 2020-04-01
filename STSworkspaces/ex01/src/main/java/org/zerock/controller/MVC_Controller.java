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
		return "redirect:abc"; //abc ��û�ؼ� abc.jsp�� ����
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
		//model.addAttribute(product); �̾��ٸ� productVO �� �ҹ��ڷ� �����ϴ� Ŭ���� �̸����� �о�� ��.
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
		// ������ �̸����� ����. ���� ��� �Ǵ� void
	}
	
	@RequestMapping("/ex01")
	public void ex01(SampleDTO sDTO) { //SampleDTO�� ������ �������� �̸��� Ÿ�Ա��� ������ ��.
		System.out.println(sDTO.getName());
		System.out.println(sDTO.getNum1());
		System.out.println(sDTO.getNum2());
		
	}
}
