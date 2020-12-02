package org.jht.mapper;

import java.util.ArrayList;

import org.jht.dto.MemberDTO;
import org.springframework.web.bind.annotation.RequestParam;

public interface MemberDAO {
	// 회원가입
	public void memberInsert(MemberDTO mdto);
	// 회원 리스트 명단
	public ArrayList<MemberDTO> memberList();
	// 회원 상세 페이지
	public MemberDTO memberDetail(@RequestParam("id") String id);
	// 회원 정보 수정
	public void memberUpdate(MemberDTO mdto); 
	// 회원 탈퇴
	public void memberDelete(@RequestParam("id") String id);
}
