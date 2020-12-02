package org.jht.controller;

import java.util.ArrayList;

import org.jht.dto.BoardDTO;
import org.jht.service.Board2Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class Board2Controller {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private Board2Service b2service;
	// GET방식 write 페이지
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public void aaa() {
		
	}
	// POST방식 write 페이지
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String bbb(BoardDTO bdto) {
		b2service.boardWrite(bdto);
		return "redirect:/board/list";
	}
	// list
	@GetMapping(value = "/list")
	public void Getlist(Model model) {
		// b2service.boardList().forEach(board->logger.info(""+board)); // 제대로 값이 들어왔는지 찍어보는 용도
		ArrayList<BoardDTO> list = b2service.boardList();
		model.addAttribute("list", list); // forward방식으로 보낸다.
	}
	// 상세 페이지
	@GetMapping(value = "/detail")
	public void GetDetail(@RequestParam("bno") int bno, Model model) {
		model.addAttribute("detail", b2service.boardDetail(bno));
	}
	// 수정 페이지
	@PostMapping(value = "/update")
	public String GetModify(BoardDTO bdto) {
		b2service.boardUpdate(bdto);
		return "redirect:/board/list";
	}
	// 삭제 페이지
	@GetMapping(value = "/delete")
	public String GetDelete(@RequestParam("bno") int bno) {
		b2service.boardDelete(bno);
		return "redirect:/board/list";
	}
	
}
