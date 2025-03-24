package com.entity.view;

import com.entity.WodechengchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的乘车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 21:06:40
 */
@TableName("wodechengchexinxi")
public class WodechengchexinxiView  extends WodechengchexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodechengchexinxiView(){
	}
 
 	public WodechengchexinxiView(WodechengchexinxiEntity wodechengchexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, wodechengchexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
