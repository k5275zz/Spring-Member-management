package org.jht.persistence;

import org.jht.dto.BoardDTO;
import org.jht.mapper.BoardMapper;
import org.jht.mapper.TimeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {
	private static final Logger logger = LoggerFactory.getLogger(TimeMapperTests.class);
	@Autowired
	private BoardMapper boardMapper;
	/*
	@Test
	// String getTime2();의 대한 test
	public void testGetList() {
		//logger.info("TimeMapper 클래스="+timeMapper.getClass().getName());
		logger.info("BoardMapper 클래스의 getList 메소드 호출="+boardMapper.getList());
	}*/
	/*
	@Test
	public void testboardInsert() {
		BoardDTO bdto = new BoardDTO();
		bdto.setTitle("새로 작성하는 제목");
		bdto.setContent("새로 작성하는 내용");
		bdto.setWriter("정자바");
		
		boardMapper.boardInsert(bdto);
	}
	*/
	
	 // @Test public void testboardUpdate() {
	 // BoardDTO bdto = new BoardDTO();
	 // bdto.setTitle("제목 수정됨"); 
	 // bdto.setContent("내용 수정됨");
	  //bdto.setBno(1);
	  
	  //boardMapper.boardUpdate(bdto); 
	  //}
	 
	//@Test
	//public void testboardDelete() {
	//	BoardDTO bdto = new BoardDTO();
	//	bdto.setBno(1);
		
	//	boardMapper.boardDelete(bdto);
//	}
	
}
