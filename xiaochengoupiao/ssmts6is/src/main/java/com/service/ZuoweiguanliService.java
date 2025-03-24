package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoweiguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoweiguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoweiguanliView;


/**
 * 座位管理
 *
 * @author 
 * @email 
 * @date 2021-05-12 21:06:40
 */
public interface ZuoweiguanliService extends IService<ZuoweiguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoweiguanliVO> selectListVO(Wrapper<ZuoweiguanliEntity> wrapper);
   	
   	ZuoweiguanliVO selectVO(@Param("ew") Wrapper<ZuoweiguanliEntity> wrapper);
   	
   	List<ZuoweiguanliView> selectListView(Wrapper<ZuoweiguanliEntity> wrapper);
   	
   	ZuoweiguanliView selectView(@Param("ew") Wrapper<ZuoweiguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoweiguanliEntity> wrapper);
   	
}

