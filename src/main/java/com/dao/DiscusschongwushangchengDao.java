package com.dao;

import com.entity.DiscusschongwushangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongwushangchengVO;
import com.entity.view.DiscusschongwushangchengView;


/**
 * 宠物商城评论表
 * 
 * @author 
 * @email 
 * @date 2025-03-28 22:48:35
 */
public interface DiscusschongwushangchengDao extends BaseMapper<DiscusschongwushangchengEntity> {
	
	List<DiscusschongwushangchengVO> selectListVO(@Param("ew") Wrapper<DiscusschongwushangchengEntity> wrapper);
	
	DiscusschongwushangchengVO selectVO(@Param("ew") Wrapper<DiscusschongwushangchengEntity> wrapper);
	
	List<DiscusschongwushangchengView> selectListView(@Param("ew") Wrapper<DiscusschongwushangchengEntity> wrapper);

	List<DiscusschongwushangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongwushangchengEntity> wrapper);

	
	DiscusschongwushangchengView selectView(@Param("ew") Wrapper<DiscusschongwushangchengEntity> wrapper);
	

}
