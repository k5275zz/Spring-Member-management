package org.jht.mapper;

import java.util.List;
import org.jht.dto.BoardDTO;

public interface BoardMapper {
	// 게시판 전체 목록 리스트 select
	public List<BoardDTO> getList();
	// 게시판 글쓰기 insert
	public void boardInsert(BoardDTO bdto);
	// 게시판 글 수정 update
	public void boardUpdate(BoardDTO bdto);
	// 게시판 글 삭제 delete
	public void boardDelete(BoardDTO bdto);
	// 게시판 상제 페이지
	public BoardDTO boardDetail(BoardDTO bdto);
}
