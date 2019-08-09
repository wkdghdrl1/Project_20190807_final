package com.biz.dm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.dm.model.AcommentVO;
import com.biz.dm.model.TipVO;
import com.biz.dm.service.AcommentService;

@Controller
public class AcommnetController {
	@Autowired
	AcommentService aService;
	
	@RequestMapping(value = "acomment", method = RequestMethod.GET)
	public String tip(Model model) {
		List<AcommentVO> aList = aService.selectAll();
		model.addAttribute("COMMENT", aList);
		model.addAttribute("BODY", "ACOMMENT");
		return "home";
	}
	
	@RequestMapping(value = "ac_write", method = RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("BODY", "AC_WRITE");
		return "home";
	}
	
	@RequestMapping(value = "ac_write", method = RequestMethod.POST)
	public String write(@ModelAttribute AcommentVO acommentVO, Model model	) {
		int ret = aService.insert(acommentVO);
		return "redirect:/acomment";
	}
	
	@RequestMapping(value = "ac_view", method = RequestMethod.GET)
	public String view(@RequestParam long a_seq, Model model ) {
		AcommentVO acommentVO = aService.findBySeq(a_seq);
		model.addAttribute("COMMENT", acommentVO);
		model.addAttribute("BODY", "AC_VIEW");
		return "home";
	}
	
	@RequestMapping(value = "ac_update", method = RequestMethod.GET)
	public String update(@RequestParam long a_seq, Model model) {
		
		AcommentVO acommentVO = aService.findBySeq(a_seq);
		model.addAttribute("COMMENT", acommentVO);
		model.addAttribute("BODY", "AC_WRITE");
		return "home";
	}
	
	@RequestMapping(value = "ac_update", method = RequestMethod.POST)
	public String update(@ModelAttribute AcommentVO acommentVO, Model model) {
		
		int ret  = aService.update(acommentVO);
		
		return "redirect:/acomment";
	}
	
	@RequestMapping(value = "ac_delete", method = RequestMethod.GET)
	public String delete(@RequestParam long a_seq, Model model) {
		
		int ret = aService.delete(a_seq);
		
		return "redirect:/acomment";
	}
}
