package org.jht.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("Exam")
public class ExamController {
	private static final Logger logger = LoggerFactory.getLogger(ExamController.class);
	
	@RequestMapping(value="exam01", method=RequestMethod.GET)
	public String Getex01() {
		
		logger.info("ex01이 실행되는지...");
		
		return "redirect:Exam/abcd";
	}
	@RequestMapping(value="abcd", method=RequestMethod.GET)
	public String Getabcd() {
		logger.info("ex01이 실행되는지...");		
		return "Exam/abcd";
	}
}