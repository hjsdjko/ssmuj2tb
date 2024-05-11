package com.dao;

import com.entity.SijiaokechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SijiaokechengVO;
import com.entity.view.SijiaokechengView;


/**
 * 私教课程
 * 
 * @author 
 * @email 
 * @date 2021-04-02 09:44:11
 */
public interface SijiaokechengDao extends BaseMapper<SijiaokechengEntity> {
	
	List<SijiaokechengVO> selectListVO(@Param("ew") Wrapper<SijiaokechengEntity> wrapper);
	
	SijiaokechengVO selectVO(@Param("ew") Wrapper<SijiaokechengEntity> wrapper);
	
	List<SijiaokechengView> selectListView(@Param("ew") Wrapper<SijiaokechengEntity> wrapper);

	List<SijiaokechengView> selectListView(Pagination page,@Param("ew") Wrapper<SijiaokechengEntity> wrapper);
	
	SijiaokechengView selectView(@Param("ew") Wrapper<SijiaokechengEntity> wrapper);
	
}
