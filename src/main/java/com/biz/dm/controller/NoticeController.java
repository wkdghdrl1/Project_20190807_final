package com.biz.dm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.biz.dm.model.NoticeVO;
import com.biz.dm.service.NoticeService;



@Controller
public class NoticeController {
	
	@Autowired
	NoticeService nService;
	
	@RequestMapping(value = "notice", method = RequestMethod.GET)
	public String notice(Model model) {
		List<NoticeVO> nList = nService.selectAll();
		model.addAttribute("NOTE", nList);
		model.addAttribute("BODY", "NOTICE");
		return "home";
	}
	
	@RequestMapping(value = "write", method = RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("BODY", "WRITE");
		return "home";
	}
	
	@RequestMapping(value = "write", method = RequestMethod.POST)
	public String write(@ModelAttribute NoticeVO noticeVO, Model model	) {
		int ret = nService.insert(noticeVO);
		return "redirect:/notice";
	}
	
	@RequestMapping(value = "view", method = RequestMethod.GET)
	public String view(@RequestParam long n_seq, Model model ) {
		NoticeVO noticeVO = nService.findBySeq(n_seq);
		model.addAttribute("NOTE", noticeVO);
		model.addAttribute("BODY", "VIEW");
		return "home";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(@RequestParam long n_seq, Model model) {
		
		NoticeVO noticeVO = nService.findBySeq(n_seq);
		model.addAttribute("NOTE", noticeVO);
		model.addAttribute("BODY", "WRITE");
		return "home";
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(@ModelAttribute NoticeVO noticeVO, Model model) {
		
		int ret  = nService.update(noticeVO);
		
		return "redirect:/notice";
	}
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(@RequestParam long n_seq, Model model) {
		
		int ret = nService.delete(n_seq);
		
		return "redirect:/notice";
	}
}
