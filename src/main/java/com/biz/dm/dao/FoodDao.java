package com.biz.dm.dao;

import java.util.List;

import com.biz.dm.model.FoodVO;

public interface FoodDao {

	public List<FoodVO> selectFoodList();

	public List<FoodVO> selectFoodListRandom(FoodVO foodVO);
}
