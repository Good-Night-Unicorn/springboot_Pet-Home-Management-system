package com.entity.view;

import com.entity.ChongwushangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 宠物商城
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-03-28 22:48:34
 */
@TableName("chongwushangcheng")
public class ChongwushangchengView  extends ChongwushangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwushangchengView(){
	}
 
 	public ChongwushangchengView(ChongwushangchengEntity chongwushangchengEntity){
 	try {
			BeanUtils.copyProperties(this, chongwushangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
