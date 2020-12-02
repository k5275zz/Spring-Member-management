package org.jht.mapper;

import java.util.ArrayList;

import org.jht.dto.BoardDTO;
import org.springframework.web.bind.annotation.RequestParam;

public interface BoardDAO {
	// *DAO로직 실행클래스*
	
	// 글쓰기를 하기 위한 DAO(Insert)
	public void boardInsert(BoardDTO bdto);
	// 글목록 DAO(List)
	public ArrayList<BoardDTO> boardList();
	// 글상세목록
	public BoardDTO boardDetail(@RequestParam("bno") int bno);
	// 글수정
	public void boardUpdate(BoardDTO bdto);
	// 글삭제
	public void boardDelete(@RequestParam("bno") int bno);
}
