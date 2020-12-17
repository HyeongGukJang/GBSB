package org.comstudy21.myweb.board.impl;

import java.util.List;

import org.comstudy21.myweb.board.BoardVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// DAO(Data Access Object)
@Repository("boardDAO")
public class BoardDAO {
	@Autowired
	SqlSessionTemplate mybatis;

	public void insertBoard(BoardVO vo) {
		mybatis.insert("org.comstudy21.myweb.BoardMapper.insertBoard", vo);
	}

	// 글 삭제
	public void deleteBoard(BoardVO vo) {
		mybatis.delete("org.comstudy21.myweb.BoardMapper.deleteBoard", vo);
	}

	// 글 상세 조회
	public BoardVO getBoard(BoardVO vo) {
		return mybatis.selectOne("org.comstudy21.myweb.BoardMapper.getBoard", vo);
	}

	// 글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo) {
		return mybatis.selectList("org.comstudy21.myweb.BoardMapper.getBoardList", vo);
	}
}