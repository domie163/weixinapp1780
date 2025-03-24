package com.entity.view;

import com.entity.ZuoweiguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 座位管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-12 21:06:40
 */
@TableName("zuoweiguanli")
public class ZuoweiguanliView  extends ZuoweiguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoweiguanliView(){
	}
 
 	public ZuoweiguanliView(ZuoweiguanliEntity zuoweiguanliEntity){
 	try {
			BeanUtils.copyProperties(this, zuoweiguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
