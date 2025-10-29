package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChongwushangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChongwushangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChongwushangchengView;


/**
 * 宠物商城
 *
 * @author 
 * @email 
 * @date 2025-03-28 22:48:34
 */
public interface ChongwushangchengService extends IService<ChongwushangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChongwushangchengVO> selectListVO(Wrapper<ChongwushangchengEntity> wrapper);
   	
   	ChongwushangchengVO selectVO(@Param("ew") Wrapper<ChongwushangchengEntity> wrapper);
   	
   	List<ChongwushangchengView> selectListView(Wrapper<ChongwushangchengEntity> wrapper);
   	
   	ChongwushangchengView selectView(@Param("ew") Wrapper<ChongwushangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChongwushangchengEntity> wrapper);

   	

}

