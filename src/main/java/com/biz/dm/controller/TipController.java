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
import com.biz.dm.model.TipVO;
import com.biz.dm.service.TipService;

@Controller
public class TipController {
 
	@Autowired
	TipService tService;
	
	@RequestMapping(value = "tip", method = RequestMethod.GET)
	public String tip(Model model) {
		List<TipVO> tList = tService.selectAll();
		model.addAttribute("TIP", tList);
		model.addAttribute("BODY", "TIP");
		return "home";
	}
	
	@RequestMapping(value = "tip_write", method = RequestMethod.GET)
	public String write(Model model) {
		model.addAttribute("BODY", "TIP_WRITE");
		return "home";
	}
	
	@RequestMapping(value = "tip_write", method = RequestMethod.POST)
	public String write(@ModelAttribute TipVO tipVO, Model model	) {
		int ret = tService.insert(tipVO);
		return "redirect:/tip";
	}
	
	@RequestMapping(value = "tip_view", method = RequestMethod.GET)
	public String view(@RequestParam long t_seq, Model model ) {
		TipVO tipVO = tService.findBySeq(t_seq);
		model.addAttribute("TIP", tipVO);
		model.addAttribute("BODY", "TIP_VIEW");
		return "home";
	}
	
	@RequestMapping(value = "tip_update", method = RequestMethod.GET)
	public String update(@RequestParam long t_seq, Model model) {
		
		TipVO tipVO = tService.findBySeq(t_seq);
		model.addAttribute("TIP", tipVO);
		model.addAttribute("BODY", "TIP_WRITE");
		return "home";
	}
	
	@RequestMapping(value = "tip_update", method = RequestMethod.POST)
	public String update(@ModelAttribute TipVO tipVO, Model model) {
		
		int ret  = tService.update(tipVO);
		
		return "redirect:/tip";
	}
	
	@RequestMapping(value = "tip_delete", method = RequestMethod.GET)
	public String delete(@RequestParam long t_seq, Model model) {
		
		int ret = tService.delete(t_seq);
		
		return "redirect:/tip";
	}

}
