package com.springquick.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springquick.board.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	//private BoardDAOSpring boardDAO;
	//private BoardDAO boardDAO;
	private BoardDAOMybatis boardDAO;
	//private BoardDAOMybatis2 boardDAO;
	
	@Override
	public void insertBoard(BoardVO _vo) {
//		if (_vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAO.insertBoard(_vo);
	}
	
	
	
	@Override
	public void updateBoard(BoardVO _vo) {
		boardDAO.updateBoard(_vo);
	}
	
	@Override
	public void deleteBoard(BoardVO _vo) {
		boardDAO.deleteBoard(_vo);
	}
	
	@Override
	public BoardVO getBoard(BoardVO _vo) {
		return boardDAO.getBoard(_vo);
	}
	
	@Override
	public List<BoardVO> getBoardList(BoardVO _vo) {
		return boardDAO.getBoardList(_vo);
	}
}
