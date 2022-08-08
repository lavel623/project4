package com.springquick.board.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springquick.board.BoardVO;

// DAO(Data Access Object)
@Repository
public class BoardDAOSpring extends JdbcDaoSupport {
	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	
	// SQL 명령어들
//	private final String BOARD_INSERT =
//			"insert into board(seq, title, writer, content)"
//			+ "values((select ifnull(max(seq), 0)+1 from board a),?,?,?)";
	private final String BOARD_INSERT =
			"insert into board(seq, title, writer, content) values(?,?,?,?)";
	private final String BOARD_UPDATE =
			"update from board set title=?, content=? where seq=?";
	private final String BOARD_DELETE =
			"delete from board where seq=?";
	private final String BOARD_GET =
			"select * from board where seq=?";
	private final String BOARD_LIST =
			"select * from board order by seq desc";
	
	private final String BOARD_LIST_T =
			"select * from board where title like '%'||?||'%' order by seq desc";
	private final String BOARD_LIST_C =
			"select * from board where content like '%'||?||'%' order by seq desc";
	
	// getJdbcTemplate 객체 리턴을 위해 DataSource 주입
	@Autowired
	public void setSuperDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
//	@Bean
//	private DataSource createDataSource() {
//		org.apache.commons.dbcp.BasicDataSource dataSource =
//				new org.apache.commons.dbcp.BasicDataSource();
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUrl("jdbc:mysql://localhost:3306/springdb");
//		dataSource.setUsername("root");
//		dataSource.setPassword("1234");
//		return dataSource;
//	}
	
	// CRUD 기능의 메소드 구현
	// 글 등록
	//@Transactional(readOnly = true)
	public void insertBoard(BoardVO _vo) {
		System.out.println("===> Spring JDBC로  insertBoard() 기능 처리");
		this.getJdbcTemplate().update(BOARD_INSERT, _vo.getTitle(),
										_vo.getWriter(), _vo.getContent());
		//jdbcTemplate.update(BOARD_INSERT, _vo.getTitle(),
		//		_vo.getWriter(), _vo.getContent());
		//jdbcTemplate.update(BOARD_INSERT, _vo.getSeq(), _vo.getTitle(),
		//								_vo.getWriter(), _vo.getContent());
	}
	
	// 글 수정
	public void updateBoard(BoardVO _vo) {
		System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");
		this.getJdbcTemplate().update(BOARD_UPDATE, _vo.getTitle(),
										_vo.getContent(), _vo.getSeq());
		//jdbcTemplate.update(BOARD_UPDATE, _vo.getTitle(),
		//		_vo.getContent(), _vo.getSeq());
	}
	
	// 글 삭제
	public void deleteBoard(BoardVO _vo) {
		System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");
		this.getJdbcTemplate().update(BOARD_DELETE, _vo.getSeq());
		//jdbcTemplate.update(BOARD_DELETE, _vo.getSeq());
	}
	
	// 글 상세 조회
	public BoardVO getBoard(BoardVO _vo) {
		System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
		Object[] args = {_vo.getSeq()};
		return this.getJdbcTemplate().queryForObject(BOARD_GET, args,
														new BoardRowMapper());
		//return jdbcTemplate.queryForObject(BOARD_GET, args,
		//		new BoardRowMapper());
	}
	
	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO _vo) {
		System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
		//return this.getJdbcTemplate().query(BOARD_LIST,
		//										new BoardRowMapper());
		//return jdbcTemplate.query(BOARD_LIST,
		//		new BoardRowMapper());
		
		//Object[] args = {_vo.getSearchKeyword()};
		//if(_vo.getSearchCondition().equals("TITLE")) {
		//	return jdbcTemplate.query(BOARD_LIST_T, args, new BoardRowMapper());
		//} else if (_vo.getSearchCondition().equals("CONTENT")) {
		//	return jdbcTemplate.query(BOARD_LIST_C, args, new BoardRowMapper());
		//}
		
		Object[] args = {_vo.getSearchKeyword()};
		if(_vo.getSearchCondition().equals("TITLE")) {
			return this.getJdbcTemplate().query(BOARD_LIST_T, args, new BoardRowMapper());
		} else if (_vo.getSearchCondition().equals("CONTENT")) {
			return this.getJdbcTemplate().query(BOARD_LIST_C, args, new BoardRowMapper());
		}
		return null;
	}
}


// public 클래스는 파일 하나당 하나
class BoardRowMapper implements RowMapper<BoardVO> {
	public BoardVO mapRow(ResultSet _rs, int _rowNum)
			throws SQLException {
		BoardVO board = new BoardVO();
		board.setSeq(_rs.getInt("SEQ"));
		board.setTitle(_rs.getString("TITLE"));
		board.setWriter(_rs.getString("WRITER"));
		board.setContent(_rs.getString("CONTENT"));
		board.setRegDate(_rs.getDate("REGDATE"));
		board.setCnt(_rs.getInt("CNT"));
		return board;
	}
}

