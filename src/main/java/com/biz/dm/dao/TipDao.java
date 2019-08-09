package com.biz.dm.dao;

import java.util.List;

import com.biz.dm.model.TipVO;

public interface TipDao {

	int insert(TipVO tipVO);

	List<TipVO> selectAll();

	TipVO findBySeq(long t_seq);

	int delete(long t_seq);

	int update(TipVO tipVO);

}
