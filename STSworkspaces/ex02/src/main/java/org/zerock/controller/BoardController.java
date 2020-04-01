package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.PageDTO;
import org.zerock.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*") // '/' �� ���� ��� �ǹ�
@AllArgsConstructor // �ڵ� ��ü ���� ����
public class BoardController {

	private BoardService service;
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("*****����Ʈ ó��*****");
		model.addAttribute("list", service.getList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri,1152));		// 1152�� ���� ����. ��� ��ü ������ �� �ʿ�.
	}
	
	@GetMapping("/register")	// get ������� �ܼ� �Է� ������ �����ֱ�
	public void register() {
		
	}
	
	@PostMapping("/register") // post ������� �Է��� �� ����
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("*****�۵��ó��***** : " + board);
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get", "/modify"}) // �� modify�� ��ȸâ���� �����ϱ� ������ �� �ǹ�. 
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("*****�� ��ȸ or ����*****");
		model.addAttribute("board", service.get(bno));
	}
	
	@PostMapping("/modify")	// �� modify�� ���� �� �ϰ� �����Ϸ��ϱ� ������ �� �ǹ�.
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("*****�� ���� *****" + board);
		if(service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("*****�� ���� *****" + bno);
		if(service.remove(bno)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	@GetMapping("/test1")
	public String test1(@ModelAttribute("name") String name) {
		return "/board/test2";
	}
}
