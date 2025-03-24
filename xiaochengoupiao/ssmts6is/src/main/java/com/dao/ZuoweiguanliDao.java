package com.dao;

import com.entity.ZuoweiguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZuoweiguanliVO;
import com.entity.view.ZuoweiguanliView;


/**
 * 座位管理
 * 
 * @author 
 * @email 
 * @date 2021-05-12 21:06:40
 */
public interface ZuoweiguanliDao extends BaseMapper<ZuoweiguanliEntity> {
	
	List<ZuoweiguanliVO> selectListVO(@Param("ew") Wrapper<ZuoweiguanliEntity> wrapper);
	
	ZuoweiguanliVO selectVO(@Param("ew") Wrapper<ZuoweiguanliEntity> wrapper);
	
	List<ZuoweiguanliView> selectListView(@Param("ew") Wrapper<ZuoweiguanliEntity> wrapper);

	List<ZuoweiguanliView> selectListView(Pagination page,@Param("ew") Wrapper<ZuoweiguanliEntity> wrapper);
	
	ZuoweiguanliView selectView(@Param("ew") Wrapper<ZuoweiguanliEntity> wrapper);
	
}
