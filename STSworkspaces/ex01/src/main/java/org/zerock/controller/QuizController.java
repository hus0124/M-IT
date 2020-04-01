package org.zerock.controller;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.Number;
import org.zerock.domain.TotoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class QuizController {

	@RequestMapping("/input1")
	public void input1() {}
	
	@GetMapping("/add")
	public String coffee(Model model, @RequestParam("numA") int numA, @RequestParam("numB") int numB) {
		int sum = numA + numB;
		model.addAttribute("numA", numA);
		model.addAttribute("numB", numB);
		model.addAttribute("sum", sum);
		return "inputAnswer";
	}
	
	/* @GetMapping("/add")
	public String coffee(Model model, @ModelAttribute("numA") int numA, @ModelAttribute("numB") int numB) {
		int sum = numA + numB;
		model.addAttribute("sum", sum);
		return "inputAnswer";
	} */
	
	// ��ü�� ������
	@RequestMapping("/add1")
	public String add1(Number number, Model model) {
		number.exec();
		model.addAttribute("result", number);
		return "sum1";
	}
	
	//�α��� ����
	
	@RequestMapping("/loginform")
	public void ex01() {
		
	}
	
	@GetMapping("/loginact")
	public String ex02(Model model, @ModelAttribute("id") String id, @ModelAttribute("pw") String pw) {
		LocalDate currDay = LocalDate.now();
		model.addAttribute("fornow", currDay);
		return "loginresult";						// pw int�� �ع����� ���� �� �� �������Ƿ� String Ÿ���� ����
	}
	
	//����(?)����Ʈ ����� ����
	
	@RequestMapping("/totosite")
	public void toto() {
		
	}
	
	@RequestMapping("/totoact")
	public String extoto(TotoDTO tDTO, Model model) {
		Random random = new Random();
		int temp = random.nextInt(3);
		int sum = 0;
		switch(temp) {
		case 0 :	// korea
			if (tDTO.getChoice().equals("korea")) {
				sum = 2*tDTO.getStackTrace();
				tDTO.setGameResult("�ѱ���! ��� ȹ�� �����߽��ϴ�.");
			}
			else
				tDTO.setGameResult("�ѱ���! ��� ȹ�� �����߽��ϴ�.");
			break;
		case 1 :	// japan
			if (tDTO.getChoice().equals("japan")) {
				sum = 4*tDTO.getStackTrace();
				tDTO.setGameResult("�Ϻ���! ��� �����߽��ϴ�.");
			}
			else
				tDTO.setGameResult("�Ϻ���! ��� ȹ�� �����߽��ϴ�.");
			break;
		case 2 : 	// draw
			if (tDTO.getChoice().equals("draw")) {
				sum = 3*tDTO.getStackTrace();
				tDTO.setGameResult("���º�! ��� �����߽��ϴ�.");
			}
			else
				tDTO.setGameResult("���º�! ��� ȹ�� �����߽��ϴ�.");
			break;
		}
		model.addAttribute("sum", sum);
		return "totoresult";
	}
	
	
}
