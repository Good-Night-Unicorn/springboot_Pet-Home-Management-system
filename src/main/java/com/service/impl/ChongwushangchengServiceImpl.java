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


import com.dao.ChongwushangchengDao;
import com.entity.ChongwushangchengEntity;
import com.service.ChongwushangchengService;
import com.entity.vo.ChongwushangchengVO;
import com.entity.view.ChongwushangchengView;

@Service("chongwushangchengService")
public class ChongwushangchengServiceImpl extends ServiceImpl<ChongwushangchengDao, ChongwushangchengEntity> implements ChongwushangchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChongwushangchengEntity> page = this.selectPage(
                new Query<ChongwushangchengEntity>(params).getPage(),
                new EntityWrapper<ChongwushangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChongwushangchengEntity> wrapper) {
		  Page<ChongwushangchengView> page =new Query<ChongwushangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ChongwushangchengVO> selectListVO(Wrapper<ChongwushangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChongwushangchengVO selectVO(Wrapper<ChongwushangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChongwushangchengView> selectListView(Wrapper<ChongwushangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChongwushangchengView selectView(Wrapper<ChongwushangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
