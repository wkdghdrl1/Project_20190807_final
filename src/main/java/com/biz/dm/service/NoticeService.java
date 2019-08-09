package com.biz.dm.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.dm.dao.NoticeDao;
import com.biz.dm.model.NoticeVO;

@Service
public class NoticeService {
	
	@Autowired
	SqlSession sqlSession;
	
	NoticeDao nDao;
	
	@Autowired
	public void getMapper() {
		nDao = sqlSession.getMapper(NoticeDao.class);
	}
	
	public int write(NoticeVO noticeVO) {
		
		long n_seq = noticeVO.getN_seq();
		if(n_seq > 0) {
			nDao.update(noticeVO);
		}else {
			nDao.insert(noticeVO);
		}
		
		return 0;
	}
	
	public int insert(NoticeVO noticeVO) {

		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat st = new SimpleDateFormat("HH:mm:ss");
		
		String curDate = sd.format(date);
		String curTime = st.format(date);
		
		noticeVO.setN_date(curDate);
		noticeVO.setN_time(curTime);
		noticeVO.setN_subject(noticeVO.getN_subject());
		
		
		
		int ret = nDao.insert(noticeVO);
		return ret;
	}


	public List<NoticeVO> selectAll() {
		List<NoticeVO> nList = nDao.selectAll();
		return nList;
	}


	public NoticeVO findBySeq(long n_seq) {
		NoticeVO noticeVO = nDao.findBySeq(n_seq);
		return noticeVO;
	}


	public int update(NoticeVO noticeVO) {
		int ret = nDao.update(noticeVO);
		return ret;
	}

	public int delete(long n_seq) {
		int ret = nDao.delete(n_seq);
		return ret;
	}



}
