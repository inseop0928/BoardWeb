package com.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.vo.BoardVO;

@Service
public class BoardService {
	
	
	@Autowired
	BoardDAO boardDAO;
	
    public void insertBoard(BoardVO vo) {

    }

    public int updateBoard(BoardVO vo) {
    
    	return boardDAO.updateBoard();
    	
    	
    }

    public void deleteBoard(BoardVO vo) {

    }

    public BoardVO selectBoardInfo(Map<String, Object> param) {

        return null;

    }

    public List<BoardVO> selectBoardList(Map<String, Object> param) {

        return null;

    }


}
