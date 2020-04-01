package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

	@GetMapping
	public String test22(String num1, String num2, String num3, Model model) {
		model.addAttribute("num1", "num1");
		model.addAttribute("num2", "num2");
		model.addAttribute("num3", "num3");
		return "/test/test2";
	}
}
