package org.jht.service;

import java.util.ArrayList;

import org.jht.dto.BoardDTO;
import org.springframework.web.bind.annotation.RequestParam;

public interface Board2Service {
	// *추상메소드*
	// 게시판 글쓰기
	public void boardWrite(BoardDTO bdto);
	// 게시판 리스트
	public ArrayList<BoardDTO> boardList();
	// 게시판 상세 페이지
	public BoardDTO boardDetail(@RequestParam("bno") int bno);
	// 게시판 글 수정
	public void boardUpdate(BoardDTO bdto);
	// 게시판 글 삭제
	public void boardDelete(@RequestParam("bno") int bno);
}
