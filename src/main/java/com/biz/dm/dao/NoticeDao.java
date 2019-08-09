package com.biz.dm.dao;

import java.util.List;

import com.biz.dm.model.NoticeVO;

public interface NoticeDao {

	public int insert(NoticeVO noticeVO);

	public List<NoticeVO> selectAll();

	public NoticeVO findBySeq(long n_seq);

	public int update(NoticeVO noticeVO);

	public int delete(long n_seq);

}
