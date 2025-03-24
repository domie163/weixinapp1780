package com.dao;

import com.entity.WodechengchexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodechengchexinxiVO;
import com.entity.view.WodechengchexinxiView;


/**
 * 我的乘车信息
 * 
 * @author 
 * @email 
 * @date 2021-05-12 21:06:40
 */
public interface WodechengchexinxiDao extends BaseMapper<WodechengchexinxiEntity> {
	
	List<WodechengchexinxiVO> selectListVO(@Param("ew") Wrapper<WodechengchexinxiEntity> wrapper);
	
	WodechengchexinxiVO selectVO(@Param("ew") Wrapper<WodechengchexinxiEntity> wrapper);
	
	List<WodechengchexinxiView> selectListView(@Param("ew") Wrapper<WodechengchexinxiEntity> wrapper);

	List<WodechengchexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<WodechengchexinxiEntity> wrapper);
	
	WodechengchexinxiView selectView(@Param("ew") Wrapper<WodechengchexinxiEntity> wrapper);
	
}
