package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodechengchexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodechengchexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodechengchexinxiView;


/**
 * 我的乘车信息
 *
 * @author 
 * @email 
 * @date 2021-05-12 21:06:40
 */
public interface WodechengchexinxiService extends IService<WodechengchexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodechengchexinxiVO> selectListVO(Wrapper<WodechengchexinxiEntity> wrapper);
   	
   	WodechengchexinxiVO selectVO(@Param("ew") Wrapper<WodechengchexinxiEntity> wrapper);
   	
   	List<WodechengchexinxiView> selectListView(Wrapper<WodechengchexinxiEntity> wrapper);
   	
   	WodechengchexinxiView selectView(@Param("ew") Wrapper<WodechengchexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodechengchexinxiEntity> wrapper);
   	
}

