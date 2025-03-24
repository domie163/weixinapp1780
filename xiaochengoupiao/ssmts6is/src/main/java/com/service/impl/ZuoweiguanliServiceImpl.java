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


import com.dao.ZuoweiguanliDao;
import com.entity.ZuoweiguanliEntity;
import com.service.ZuoweiguanliService;
import com.entity.vo.ZuoweiguanliVO;
import com.entity.view.ZuoweiguanliView;

@Service("zuoweiguanliService")
public class ZuoweiguanliServiceImpl extends ServiceImpl<ZuoweiguanliDao, ZuoweiguanliEntity> implements ZuoweiguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuoweiguanliEntity> page = this.selectPage(
                new Query<ZuoweiguanliEntity>(params).getPage(),
                new EntityWrapper<ZuoweiguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuoweiguanliEntity> wrapper) {
		  Page<ZuoweiguanliView> page =new Query<ZuoweiguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuoweiguanliVO> selectListVO(Wrapper<ZuoweiguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuoweiguanliVO selectVO(Wrapper<ZuoweiguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuoweiguanliView> selectListView(Wrapper<ZuoweiguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuoweiguanliView selectView(Wrapper<ZuoweiguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
