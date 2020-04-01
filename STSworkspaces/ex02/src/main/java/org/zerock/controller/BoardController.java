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
@RequestMapping("/board/*") // '/' 는 절대 경로 의미
@AllArgsConstructor // 자동 객체 생성 주입
public class BoardController {

	private BoardService service;
	
	@GetMapping("/list")
	public void list(Criteria cri, Model model) {
		log.info("*****리스트 처리*****");
		model.addAttribute("list", service.getList(cri));
		model.addAttribute("pageMaker", new PageDTO(cri,1152));		// 1152는 임의 숫자. 사실 전체 데이터 수 필요.
	}
	
	@GetMapping("/register")	// get 방식으로 단순 입력 페이지 보여주기
	public void register() {
		
	}
	
	@PostMapping("/register") // post 방식으로 입력할 값 전송
	public String register(BoardVO board, RedirectAttributes rttr) {
		log.info("*****글등록처리***** : " + board);
		service.register(board);
		rttr.addFlashAttribute("result", board.getBno());
		return "redirect:/board/list";
	}
	
	@GetMapping({"/get", "/modify"}) // 이 modify는 조회창에서 수정하기 누르는 것 의미. 
	public void get(@RequestParam("bno") Long bno, Model model) {
		log.info("*****글 조회 or 수정*****");
		model.addAttribute("board", service.get(bno));
	}
	
	@PostMapping("/modify")	// 이 modify는 수정 다 하고 수정완료하기 누르는 것 의미.
	public String modify(BoardVO board, RedirectAttributes rttr) {
		log.info("*****글 수정 *****" + board);
		if(service.modify(board)) {
			rttr.addFlashAttribute("result", "success");
		}
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") Long bno, RedirectAttributes rttr) {
		log.info("*****글 삭제 *****" + bno);
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
