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


import com.dao.DiscusschongwushangchengDao;
import com.entity.DiscusschongwushangchengEntity;
import com.service.DiscusschongwushangchengService;
import com.entity.vo.DiscusschongwushangchengVO;
import com.entity.view.DiscusschongwushangchengView;

@Service("discusschongwushangchengService")
public class DiscusschongwushangchengServiceImpl extends ServiceImpl<DiscusschongwushangchengDao, DiscusschongwushangchengEntity> implements DiscusschongwushangchengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongwushangchengEntity> page = this.selectPage(
                new Query<DiscusschongwushangchengEntity>(params).getPage(),
                new EntityWrapper<DiscusschongwushangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongwushangchengEntity> wrapper) {
		  Page<DiscusschongwushangchengView> page =new Query<DiscusschongwushangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscusschongwushangchengVO> selectListVO(Wrapper<DiscusschongwushangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongwushangchengVO selectVO(Wrapper<DiscusschongwushangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongwushangchengView> selectListView(Wrapper<DiscusschongwushangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongwushangchengView selectView(Wrapper<DiscusschongwushangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
