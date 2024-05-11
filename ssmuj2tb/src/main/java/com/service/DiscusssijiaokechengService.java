package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssijiaokechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssijiaokechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssijiaokechengView;


/**
 * 私教课程评论表
 *
 * @author 
 * @email 
 * @date 2021-04-02 09:44:11
 */
public interface DiscusssijiaokechengService extends IService<DiscusssijiaokechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssijiaokechengVO> selectListVO(Wrapper<DiscusssijiaokechengEntity> wrapper);
   	
   	DiscusssijiaokechengVO selectVO(@Param("ew") Wrapper<DiscusssijiaokechengEntity> wrapper);
   	
   	List<DiscusssijiaokechengView> selectListView(Wrapper<DiscusssijiaokechengEntity> wrapper);
   	
   	DiscusssijiaokechengView selectView(@Param("ew") Wrapper<DiscusssijiaokechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssijiaokechengEntity> wrapper);
   	
}

