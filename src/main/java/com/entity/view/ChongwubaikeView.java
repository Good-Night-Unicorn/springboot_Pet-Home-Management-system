package com.entity.view;

import com.entity.ChongwubaikeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 宠物百科
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2025-03-28 22:48:34
 */
@TableName("chongwubaike")
public class ChongwubaikeView  extends ChongwubaikeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongwubaikeView(){
	}
 
 	public ChongwubaikeView(ChongwubaikeEntity chongwubaikeEntity){
 	try {
			BeanUtils.copyProperties(this, chongwubaikeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
