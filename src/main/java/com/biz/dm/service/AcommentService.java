package com.biz.dm.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dm.dao.AcommentDao;
import com.biz.dm.dao.TipDao;
import com.biz.dm.model.AcommentVO;
import com.biz.dm.model.TipVO;

@Service
public class AcommentService {
	
	@Autowired
	SqlSession sqlSession;
	
	AcommentDao aDao;
	
	@Autowired
	public void getMapper() {
		aDao = sqlSession.getMapper(AcommentDao.class);
	}

public int write(AcommentVO acommentVO) {
		
		long a_seq = acommentVO.getA_seq();
		if(a_seq > 0) {
			aDao.update(acommentVO);
		}else {
			aDao.insert(acommentVO);
		}
		
		return 0;
	}
	
	public int insert(AcommentVO acommentVO) {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat st = new SimpleDateFormat("HH:mm:ss");
		
		String curDate = sd.format(date);
		String curTime = st.format(date);
		
		acommentVO.setA_date(curDate);
		acommentVO.setA_time(curTime);
		acommentVO.setA_subject(acommentVO.getA_subject());
		
		
		
		int ret = aDao.insert(acommentVO);
		return ret;
	}


	public List<AcommentVO> selectAll() {
		List<AcommentVO> aList = aDao.selectAll();
		return aList;
	}


	public AcommentVO findBySeq(long a_seq) {
		AcommentVO acommentVO = aDao.findBySeq(a_seq);
		return acommentVO;
	}


	public int update(AcommentVO acommentVO) {
		int ret = aDao.update(acommentVO);
		return ret;
	}

	public int delete(long a_seq) {
		int ret = aDao.delete(a_seq);
		return ret;
	}

	
	
	
}
