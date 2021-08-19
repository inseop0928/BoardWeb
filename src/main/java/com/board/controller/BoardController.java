package com.board.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.board.service.BoardService;
import com.board.vo.BoardVO;

@Controller //������̼��� ������� ������ handler �� controller �������̽� ��� �����ؾ���
@SessionAttributes("board")
@RequestMapping(value ="/board")
public class BoardController {

	@Autowired
	BoardService boardService;
	
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	@RequestMapping(value ="/insertBoard.do")
	public String insertBoard(HttpServletRequest request) {
		
		
		try {
			request.setCharacterEncoding("UTF-8");
			String title = request.getParameter("title");
			String writer = request.getParameter("writer");
			String content = request.getParameter("content");
			   
			
		}catch (Exception e) {
			new Exception("���� ���� ������ �߻��߽��ϴ�.");
		}
		return null;
	}
	
	@RequestMapping(value ="/updateBoard.do")
	public String updateBoard(HttpServletRequest request) {
		
		
		try {
			request.setCharacterEncoding("UTF-8");
			String title = request.getParameter("title");
		
		}catch (Exception e) {
			new Exception("���� ���� ������ �߻��߽��ϴ�.");
		}
		return null;
	}
	
	@RequestMapping(value ="/selectBoardList.do" , method =RequestMethod.POST)
	public String selectBoardList(@RequestParam(value ="searchText",defaultValue = "",required = false)String searchText
			,	Model model) {
		
		
		Map<String,Object> paramMap = new HashMap<String,Object>();
		
		try {
			model.addAttribute("board",boardService.selectBoardList(paramMap));
		
		}catch (Exception e) {
			new Exception("���� ���� ������ �߻��߽��ϴ�.");
		}
		return null;
	}
	
	

	@RequestMapping(value ="/selectBoardInfo.do", method =RequestMethod.GET)
	public String selectBoardInfo(BoardVO vo,Model model) {
		
		Map<String,Object> paramMap = new HashMap<String,Object>();
		
		try {
			model.addAttribute("board",boardService.selectBoardInfo(paramMap));
		
		}catch (Exception e) {
			new Exception("���� ���� ������ �߻��߽��ϴ�.");
		}
		return null;
	}
	
	
	public Map<String,Object> searchContitionMap(){
	
		Map<String,Object> conditionMap = new HashMap<String,Object>();
		
		
		
		return conditionMap;
	}
}