package com.dao;

import com.entity.DiscusssijiaokechengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssijiaokechengVO;
import com.entity.view.DiscusssijiaokechengView;


/**
 * 私教课程评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-02 09:44:11
 */
public interface DiscusssijiaokechengDao extends BaseMapper<DiscusssijiaokechengEntity> {
	
	List<DiscusssijiaokechengVO> selectListVO(@Param("ew") Wrapper<DiscusssijiaokechengEntity> wrapper);
	
	DiscusssijiaokechengVO selectVO(@Param("ew") Wrapper<DiscusssijiaokechengEntity> wrapper);
	
	List<DiscusssijiaokechengView> selectListView(@Param("ew") Wrapper<DiscusssijiaokechengEntity> wrapper);

	List<DiscusssijiaokechengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssijiaokechengEntity> wrapper);
	
	DiscusssijiaokechengView selectView(@Param("ew") Wrapper<DiscusssijiaokechengEntity> wrapper);
	
}
