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


import com.dao.SijiaokechengDao;
import com.entity.SijiaokechengEntity;
import com.service.SijiaokechengService;
import com.entity.vo.SijiaokechengVO;
import com.entity.view.SijiaokechengView;

@Service("sijiaokechengService")
public class SijiaokechengServiceImpl extends ServiceImpl<SijiaokechengDao, SijiaokechengEntity> implements SijiaokechengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SijiaokechengEntity> page = this.selectPage(
                new Query<SijiaokechengEntity>(params).getPage(),
                new EntityWrapper<SijiaokechengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SijiaokechengEntity> wrapper) {
		  Page<SijiaokechengView> page =new Query<SijiaokechengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SijiaokechengVO> selectListVO(Wrapper<SijiaokechengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SijiaokechengVO selectVO(Wrapper<SijiaokechengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SijiaokechengView> selectListView(Wrapper<SijiaokechengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SijiaokechengView selectView(Wrapper<SijiaokechengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
