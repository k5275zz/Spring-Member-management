package org.jht.persistence;

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
public class TimeMapperTests {
	private static final Logger logger = LoggerFactory.getLogger(TimeMapperTests.class);
	@Autowired
	// TimeMapper timeMapper = new TimeMapper();
	private TimeMapper timeMapper;
	/*
	@Test
	// String getTime();의 대한 test
	public void testGetTime() {
		logger.info("TimeMapper 클래스="+timeMapper.getClass().getName());
		logger.info("TimeMapper 클래스의 getTime 메소드 호출="+timeMapper.getTime());
	}
	*/
	@Test
	// String getTime2();의 대한 test
	public void testGetTime2() {
		//logger.info("TimeMapper 클래스="+timeMapper.getClass().getName());
		logger.info("TimeMapper 클래스의 getTime2 메소드 호출="+timeMapper.getTime2());
	}
}
