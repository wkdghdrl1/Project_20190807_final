package com.biz.dm.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dm.dao.FoodDao;
import com.biz.dm.model.FoodVO;

@Service
public class FoodService {
	
	@Autowired
	SqlSession sqlSession;
	
	FoodDao foodDao;
	
	@Autowired
	public void getMapper() {
		foodDao = sqlSession.getMapper(FoodDao.class);
	}
	public List<FoodVO> selectFoodList() {
		
		List<FoodVO> foodList = foodDao.selectFoodList();
		
		return foodList;
	}
	
	public List<FoodVO> selectFoodListRandom(FoodVO foodVO) {
		
		List<FoodVO> foodList = foodDao.selectFoodListRandom(foodVO);
		
		return foodList;
	}
}
