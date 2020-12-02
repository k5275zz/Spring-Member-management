/*
 * package org.jht.controller;
 * 
 * import org.jht.dto.MemberDTO; import org.slf4j.Logger; import
 * org.slf4j.LoggerFactory; import org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.stereotype.Controller; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RequestMethod; import
 * org.springframework.web.bind.annotation.ResponseBody;
 * 
 * @Controller
 * 
 * @RequestMapping("/sample")
 * 
 * public class SampleController {
 * 
 * private static final Logger logger =
 * LoggerFactory.getLogger(SampleController.class);
 * 
 * // springframework 버전 4.3 이전 버전에서만 사용
 * 
 * @RequestMapping(value="/samplebasic1",method=RequestMethod.GET) public void
 * basicGet1() {
 * 
 * logger.info("samplebasic1");
 * 
 * } // springframework 버전 4.3 이후 버전에서는 둘다 가능.
 * 
 * @GetMapping("/samplebasic2") public void basicGet2() {
 * logger.info("samplebasic2"); }
 * 
 * @GetMapping("/samplebasic3") public String basicGet3() {
 * logger.info("samplebasic3"); return "sb3"; } // JSON 타입(jackson-databind라는
 * 라이브러리 추가)
 * 
 * @RequestMapping(value="/json",method=RequestMethod.GET) public @ResponseBody
 * MemberDTO jsonGet() { MemberDTO mdto = new MemberDTO(); //mdto.setAge(10);
 * mdto.setName("정자바");
 * 
 * return mdto; } // ResponseEntity 타입
 * 
 * @RequestMapping(value="/entity",method=RequestMethod.GET) public
 * ResponseEntity<String> entityGet(){
 * 
 * String msg="{\"name\" : \"정자바\"}"; HttpHeaders header = new HttpHeaders();
 * 
 * header.add("Content-type", "application/json;charset=UTF-8");
 * 
 * return new ResponseEntity<>(msg,header, HttpStatus.OK);
 * 
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */