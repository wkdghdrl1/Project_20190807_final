package com.biz.dm.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dm.dao.TipDao;
import com.biz.dm.model.TipVO;

@Service
public class TipService {
	
	@Autowired
	SqlSession sqlSession;
	
	TipDao tDao;
	
	@Autowired
	public void getMapper() {
		tDao = sqlSession.getMapper(TipDao.class);
	}

public int write(TipVO tipVO) {
		
		long t_seq = tipVO.getT_seq();
		if(t_seq > 0) {
			tDao.update(tipVO);
		}else {
			tDao.insert(tipVO);
		}
		
		return 0;
	}
	
	public int insert(TipVO tipVO) {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat st = new SimpleDateFormat("HH:mm:ss");
		
		String curDate = sd.format(date);
		String curTime = st.format(date);
		
		tipVO.setT_date(curDate);
		tipVO.setT_time(curTime);
		tipVO.setT_subject(tipVO.getT_subject());
		
		
		
		int ret = tDao.insert(tipVO);
		return ret;
	}


	public List<TipVO> selectAll() {
		List<TipVO> tList = tDao.selectAll();
		return tList;
	}


	public TipVO findBySeq(long t_seq) {
		TipVO tipVO = tDao.findBySeq(t_seq);
		return tipVO;
	}


	public int update(TipVO tipVO) {
		int ret = tDao.update(tipVO);
		return ret;
	}

	public int delete(long t_seq) {
		int ret = tDao.delete(t_seq);
		return ret;
	}

	
	
	
}
