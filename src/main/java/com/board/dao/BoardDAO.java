package com.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.board.vo.BoardVO;

@Repository
public class BoardDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;


    public int insertBoard() {
        return 0;
    }
    
    public int deleteBoard() {
        return 0;
    }
    
    public int updateBoard() {
        return 0;
    }
    
    public BoardVO getBoardInfo() {
        return null;
    }
    
    public List<BoardVO> getBoardList() {
        return null;
    }
}
