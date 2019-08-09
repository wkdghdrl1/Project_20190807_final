package com.biz.dm.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dm.dao.MenuDao;
import com.biz.dm.model.MenuVO;

@Service
public class MenuService {
	
	@Autowired
	SqlSession sqlSession;
	
	MenuDao MeDao;
	
	@Autowired
	public void getMapper() {
		MeDao = sqlSession.getMapper(MenuDao.class);
	}

	public List<MenuVO> selectMenu() {
		
		List<MenuVO> menuList = MeDao.selectMenu();
		
		return menuList;
	}
}
