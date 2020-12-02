package org.jht.service;

import java.util.List;

import org.jht.dto.BoardDTO;
import org.jht.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardMapper boardMapper;
	// 글쓰기(insert) 구현부
	public void boardInsert(BoardDTO bdto) {
		// insert할 수 있도록 BoardMapper(DAO)랑 연결
		boardMapper.boardInsert(bdto);
	}
	// 제목을 클릭 -> 상세페이지(select) - 한건 구현부
	public BoardDTO boardDetail(BoardDTO bdto) {
		
		return null;
	}
	// 게시판 전체 리스트 페이지(select) - 여러건 구현부
	public List<BoardDTO> boardList() {
		
		return boardMapper.getList();
	}
	// 수정(update) 구현부
	public void boardUpdate(BoardDTO bdto) {
		boardMapper.boardUpdate(bdto);
		
	}
	// 삭제(delete) 구현부
	public void boardDelete(BoardDTO bdto) {
		boardMapper.boardDelete(bdto);
		
	}

}
