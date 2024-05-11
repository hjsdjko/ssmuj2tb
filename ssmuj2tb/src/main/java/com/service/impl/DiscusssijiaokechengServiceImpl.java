package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusssijiaokechengDao;
import com.entity.DiscusssijiaokechengEntity;
import com.service.DiscusssijiaokechengService;
import com.entity.vo.DiscusssijiaokechengVO;
import com.entity.view.DiscusssijiaokechengView;

@Service("discusssijiaokechengService")
public class DiscusssijiaokechengServiceImpl extends ServiceImpl<DiscusssijiaokechengDao, DiscusssijiaokechengEntity> implements DiscusssijiaokechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssijiaokechengEntity> page = this.selectPage(
                new Query<DiscusssijiaokechengEntity>(params).getPage(),
                new EntityWrapper<DiscusssijiaokechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssijiaokechengEntity> wrapper) {
		  Page<DiscusssijiaokechengView> page =new Query<DiscusssijiaokechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssijiaokechengVO> selectListVO(Wrapper<DiscusssijiaokechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssijiaokechengVO selectVO(Wrapper<DiscusssijiaokechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssijiaokechengView> selectListView(Wrapper<DiscusssijiaokechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssijiaokechengView selectView(Wrapper<DiscusssijiaokechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
