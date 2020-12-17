package org.comstudy21.myweb;

import java.util.List;

import javax.annotation.Resource;

import org.comstudy21.myweb.board.BoardService;
import org.comstudy21.myweb.board.BoardVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value = "/board")
public class BoardController {
	@Resource
	BoardService boardService;
	
	@RequestMapping(value="/write", method=RequestMethod.GET)
	public void write() {}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public ModelAndView write_ok(BoardVO vo, ModelAndView mav) {
		boardService.insertBoard(vo);
		
		mav.setViewName("redirect:list");
		
		return mav;
	}
	
	
	
	@RequestMapping(value="/list", method = RequestMethod.GET)
	public ModelAndView list(BoardVO vo, ModelAndView mav) {
		List<BoardVO> list = boardService.getBoardList(vo);
		System.out.println(list);
		
		mav.addObject("list", list);
		mav.setViewName("board/list");
		
		return mav;

	}
	
	
	@RequestMapping(value="/detail", method=RequestMethod.GET)
	public String detail(BoardVO vo,Model model) {
		BoardVO board = boardService.getBoard(vo);
		model.addAttribute("board", board);
		
		return "board/detail";
		
	}
	
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(BoardVO vo, Model model) {
		BoardVO board = boardService.getBoard(vo);
		model.addAttribute("board", board);
		
		return "board/delete";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public ModelAndView delete_ok(BoardVO vo, ModelAndView mav) {
		boardService.deleteBoard(vo);
		mav.setViewName("redirect:list");
		
		return mav;
	}

}
