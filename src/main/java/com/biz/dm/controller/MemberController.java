package com.biz.dm.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.biz.dm.model.FoodVO;
import com.biz.dm.model.MemberVO;
import com.biz.dm.service.FoodService;

@Controller
public class MemberController {



	@Autowired
	FoodService foodService;

	@RequestMapping(value = "controllmenu", method = RequestMethod.GET)
	public String controllMenu(Model model) {
		List<FoodVO> foodList = foodService.selectFoodList(); 
		//식단 가져오기
		model.addAttribute("BODY", "CONTROLLMENU");
		model.addAttribute("FOODLIST", foodList);
	
		return "home";
	}

	
	@RequestMapping(value = "userview", method = RequestMethod.POST)
	public String userview1(Model model, @ModelAttribute MemberVO memberVO) {
		
		
		model.addAttribute("BODY", "USERVIEW");
		model.addAttribute("MemVO", memberVO);
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value = "selectFoodListAjax", method = RequestMethod.GET)
	public List<FoodVO> selectFoodListAjax(Model model, @ModelAttribute FoodVO foodVO) {
		
		List<FoodVO> foodList = foodService.selectFoodListRandom(foodVO);
		return foodList;
	}
	
	
}
