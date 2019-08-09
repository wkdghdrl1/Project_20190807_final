package com.biz.dm.dao;

import java.util.List;

import com.biz.dm.model.AcommentVO;
import com.biz.dm.model.TipVO;

public interface AcommentDao {

	public int update(AcommentVO acommentVO);

	public int insert(AcommentVO acommentVO);

	public List<AcommentVO> selectAll();

	public AcommentVO findBySeq(long a_seq);

	public int delete(long a_seq);

}
