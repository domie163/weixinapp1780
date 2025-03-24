package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WodechengchexinxiDao;
import com.entity.WodechengchexinxiEntity;
import com.service.WodechengchexinxiService;
import com.entity.vo.WodechengchexinxiVO;
import com.entity.view.WodechengchexinxiView;

@Service("wodechengchexinxiService")
public class WodechengchexinxiServiceImpl extends ServiceImpl<WodechengchexinxiDao, WodechengchexinxiEntity> implements WodechengchexinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodechengchexinxiEntity> page = this.selectPage(
                new Query<WodechengchexinxiEntity>(params).getPage(),
                new EntityWrapper<WodechengchexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodechengchexinxiEntity> wrapper) {
		  Page<WodechengchexinxiView> page =new Query<WodechengchexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodechengchexinxiVO> selectListVO(Wrapper<WodechengchexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodechengchexinxiVO selectVO(Wrapper<WodechengchexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodechengchexinxiView> selectListView(Wrapper<WodechengchexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodechengchexinxiView selectView(Wrapper<WodechengchexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
