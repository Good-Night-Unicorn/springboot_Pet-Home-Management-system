package com.dao;

import com.entity.ChongwushangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChongwushangchengVO;
import com.entity.view.ChongwushangchengView;


/**
 * 宠物商城
 * 
 * @author 
 * @email 
 * @date 2025-03-28 22:48:34
 */
public interface ChongwushangchengDao extends BaseMapper<ChongwushangchengEntity> {
	
	List<ChongwushangchengVO> selectListVO(@Param("ew") Wrapper<ChongwushangchengEntity> wrapper);
	
	ChongwushangchengVO selectVO(@Param("ew") Wrapper<ChongwushangchengEntity> wrapper);
	
	List<ChongwushangchengView> selectListView(@Param("ew") Wrapper<ChongwushangchengEntity> wrapper);

	List<ChongwushangchengView> selectListView(Pagination page,@Param("ew") Wrapper<ChongwushangchengEntity> wrapper);

	
	ChongwushangchengView selectView(@Param("ew") Wrapper<ChongwushangchengEntity> wrapper);
	

}
