package com.board.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.board.service.BoardService;
import com.board.vo.BoardVO;

@Controller//어노테이션을 사용하지 않으면 handler 및 controller 인터페이스 상속 구현해야함
@SessionAttributes("board")//session에 board를 저장
@RequestMapping(value = "/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/insertBoard.do")
    public String insertBoard(BoardVO vo) {


        try {
        	
        	MultipartFile file = vo.getMultipartFile();
        	
        	if(!file.isEmpty()) {
        		String fileName = file.getOriginalFilename();
                file.transferTo(new File("D:/"+fileName));//파일을 destFile에 저장
        	}
        	 
        } catch (Exception e) {
            new Exception("저장 도중 에러가 발생했습니다.");
        }
        return "selectBoardList.do";
    }

    @RequestMapping(value = "/updateBoard.do",method = RequestMethod.POST)
    public String updateBoard(@ModelAttribute("board")BoardVO vo) {//sessionAttribute에 있는 객체를 꺼내서 쓴다.

        try {
           
            boardService.updateBoard(vo);
            
        } catch (Exception e) {
            new Exception("저장 도중 에러가 발생했습니다.");
        }
        return "getBoardList.do";
    }
    
    
    @RequestMapping(value = "/deleteBoard.do",method = RequestMethod.POST)
    public String deleteBoard(HttpServletRequest request,BoardVO vo) {

        try {
            request.setCharacterEncoding("UTF-8");
            String title = request.getParameter("title");
            
            boardService.deleteBoard(vo);
            
        } catch (Exception e) {
            new Exception("저장 도중 에러가 발생했습니다.");
        }
        return "getBoardList.do";
    }
    

    @RequestMapping(value = "/selectBoardList.do", method = RequestMethod.POST)
    public String selectBoardList(@RequestParam(value = "searchText", defaultValue = "", required = false) String searchText
            , Model model) {


        Map<String, Object> paramMap = new HashMap<String, Object>();

        try {
            model.addAttribute("board", boardService.selectBoardList(paramMap));

        } catch (Exception e) {
            new Exception("저장 도중 에러가 발생했습니다.");
        }
        return null;
    }


    @RequestMapping(value = "/selectBoardInfo.do", method = RequestMethod.GET)
    public String selectBoardInfo(BoardVO vo, Model model) {

        Map<String, Object> paramMap = new HashMap<String, Object>();

        try {
            model.addAttribute("board", boardService.selectBoardInfo(paramMap));

        } catch (Exception e) {
            new Exception("저장 도중 에러가 발생했습니다.");
        }
        return null;
    }


    
    @ModelAttribute //ModelAttribute가 설정된 메소드는 @RequestMapping 어노테이션이 적용된 메소드보다 먼저 호출된다.
    public Map<String, Object> searchContitionMap() {

        Map<String, Object> conditionMap = new HashMap<String, Object>();


        return conditionMap;
    }
}
