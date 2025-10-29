package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongwushangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongwushangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongwushangchengView;


/**
 * 宠物商城评论表
 *
 * @author 
 * @email 
 * @date 2025-03-28 22:48:35
 */
public interface DiscusschongwushangchengService extends IService<DiscusschongwushangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongwushangchengVO> selectListVO(Wrapper<DiscusschongwushangchengEntity> wrapper);
   	
   	DiscusschongwushangchengVO selectVO(@Param("ew") Wrapper<DiscusschongwushangchengEntity> wrapper);
   	
   	List<DiscusschongwushangchengView> selectListView(Wrapper<DiscusschongwushangchengEntity> wrapper);
   	
   	DiscusschongwushangchengView selectView(@Param("ew") Wrapper<DiscusschongwushangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongwushangchengEntity> wrapper);

   	

}

