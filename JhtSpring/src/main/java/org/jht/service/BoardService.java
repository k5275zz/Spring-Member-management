package org.jht.service;

import java.util.List;

import org.jht.dto.BoardDTO;

public interface BoardService {
	// 글쓰기(insert)
	public void boardInsert(BoardDTO bdto);
	// 제목을 클릭 -> 상세페이지(select) - 한건
	public BoardDTO boardDetail(BoardDTO bdto);
	// 게시판 전체 리스트 페이지(select) - 여러건
	public List<BoardDTO> boardList();
	// 수정(update)
	public void boardUpdate(BoardDTO bdto);
	// 삭제(delete)
	public void boardDelete(BoardDTO bdto);
}

