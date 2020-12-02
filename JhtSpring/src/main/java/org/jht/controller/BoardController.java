package org.jht.controller;

import java.util.ArrayList;
import java.util.List;

import org.jht.dto.BoardDTO;
import org.jht.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//@Controller
//@RequestMapping("/board")
public class BoardController {
	//private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	//@Autowired
	//private BoardService bservice; //private BoardService bservice
	
	/*
	@GetMapping("/writer")
	public String Getwrite(Model model) {
		logger.info("게시판 글쓰기....");
		String name="정자바";
		model.addAttribute("name", name);
		return "board/write";
	}
	*/
	//@GetMapping("/write")
	//public String Getwrite(@ModelAttribute("name") String name) {
	//	logger.info("게시판 글쓰기....");

	//	return "board/write";
	//}
	
	//@RequestMapping(value="/write",method=RequestMethod.POST)
	//public void Postupload(BoardDTO bdto,ArrayList<MultipartFile> files) {
	//@PostMapping("/write")
	//public void Postupload(BoardDTO bdto) {
		
	//	bservice.boardInsert(bdto);
		
		/*
		for(int i=0;i<files.size();i++) {
		
			logger.info("업로드 된 파일 이름="+files.get(i).getOriginalFilename());
			logger.info("업로드 된 파일 크기="+files.get(i).getSize());
		}
		*/
		/*
		 * files.forEach(file -> {
		 * logger.info("업로드 된 파일 이름="+file.getOriginalFilename());
		 * logger.info("업로드 된 파일 크기="+file.getSize()); });
		 */
	//}
	
	//@GetMapping("/update")
	//public void Getupdate(BoardDTO bdto) {
	//	bservice.boardUpdate(bdto);
	//	logger.info("게시판 글수정....");
	//}
	//@GetMapping("/delete")
//	public void Getdelete(BoardDTO bdto) {
	//	bservice.boardDelete(bdto);
	//	logger.info("게시판 글삭제....");
//	}
//	@GetMapping("/read")
//	public void Getread(BoardDTO bdto,Model model) {
	//	logger.info("게시판 글 상세 페이지....");
//		model.addAttribute("detail", bservice.boardDetail(bdto));
		
//	}
//	@GetMapping("/list")
//	public void list(Model model){
//		model.addAttribute("list",bservice.boardList());
//	}
//	@RequestMapping(value="/redirect",method=RequestMethod.GET)
//	public String Redirect(RedirectAttributes rttr) {
//		rttr.addFlashAttribute("name", "정자바");
//		rttr.addFlashAttribute("age", 10);
//		
		//return "redirect:/member/write";
//		return "redirect:/";
//	}
	
}
