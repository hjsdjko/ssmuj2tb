package com.dao;

import com.entity.KechengyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengyuyueVO;
import com.entity.view.KechengyuyueView;


/**
 * 课程预约
 * 
 * @author 
 * @email 
 * @date 2021-04-02 09:44:11
 */
public interface KechengyuyueDao extends BaseMapper<KechengyuyueEntity> {
	
	List<KechengyuyueVO> selectListVO(@Param("ew") Wrapper<KechengyuyueEntity> wrapper);
	
	KechengyuyueVO selectVO(@Param("ew") Wrapper<KechengyuyueEntity> wrapper);
	
	List<KechengyuyueView> selectListView(@Param("ew") Wrapper<KechengyuyueEntity> wrapper);

	List<KechengyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<KechengyuyueEntity> wrapper);
	
	KechengyuyueView selectView(@Param("ew") Wrapper<KechengyuyueEntity> wrapper);
	
}
