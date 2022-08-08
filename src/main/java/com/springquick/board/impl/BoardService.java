package com.springquick.board.impl;

import java.util.List;

import com.springquick.board.BoardVO;

public interface BoardService {

	// CRUD(Create, Read, Update, Delete) 기능의 메소드 구현
	// 글 동록
	void insertBoard(BoardVO _vo);

	// 글 수정
	void updateBoard(BoardVO _vo);

	// 글 삭제
	void deleteBoard(BoardVO _vo);

	// 글 상세 조회
	BoardVO getBoard(BoardVO _vo);

	// 글 목록 조회
	List<BoardVO> getBoardList(BoardVO _vo);

}