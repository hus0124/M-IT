package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.testVO;

@Controller
@RequestMapping("/test/*")
public class testController {

//	@GetMapping
//	public String test22(String num1, String num2, String num3, Model model) {
//		model.addAttribute("num1", num1);
//		model.addAttribute("num2", num2);
//		model.addAttribute("num3", num3);
//		return "/test/test2";
//	}
	
//	@GetMapping("/test2")
//	public String test22(testVO tVO, Model model) {
//		
//		model.addAttribute("tVO", tVO);
//		
//		return "/test/test2";
//	}
	
	@GetMapping("/test3")
	public String test33(testVO tVO, RedirectAttributes rttr) {
		rttr.addFlashAttribute(tVO);			
		return "redirect:/test/test4";
	}
	
	@GetMapping("/test4")
	public String test44(testVO tVO, Model model) {
		model.addAttribute("tVO", tVO);
		return "/test/test2";
	}
	
	@GetMapping("/test10")
	public void test10() {
		
	}
	
	@PostMapping("/test11")
	public void test11(testVO tVO, Model model) {
		model.addAttribute("tVO", tVO);
	}
}
