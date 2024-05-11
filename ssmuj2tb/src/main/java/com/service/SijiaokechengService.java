package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SijiaokechengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SijiaokechengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SijiaokechengView;


/**
 * 私教课程
 *
 * @author 
 * @email 
 * @date 2021-04-02 09:44:11
 */
public interface SijiaokechengService extends IService<SijiaokechengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SijiaokechengVO> selectListVO(Wrapper<SijiaokechengEntity> wrapper);
   	
   	SijiaokechengVO selectVO(@Param("ew") Wrapper<SijiaokechengEntity> wrapper);
   	
   	List<SijiaokechengView> selectListView(Wrapper<SijiaokechengEntity> wrapper);
   	
   	SijiaokechengView selectView(@Param("ew") Wrapper<SijiaokechengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SijiaokechengEntity> wrapper);
   	
}

