package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.Goods;
import com.neusoft.bean.GoodsType;
import com.neusoft.dao.GoodsTypeDao;
import com.neusoft.page.Page;
import com.neusoft.service.GoodsService;
import com.neusoft.service.GoodsTypeService;

/**
 * 商品类别
 * @author admin
 *
 */
public class GoodsTypeServiceImpl implements GoodsTypeService {
	private GoodsTypeDao goodsTypeDao;
	
	public void setGoodsTypeDao(GoodsTypeDao goodsTypeDao) {
		this.goodsTypeDao = goodsTypeDao;
	}

	@Override
	public void saveGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		goodsTypeDao.saveGoodsType(goodsType);
	}

	@Override
	public void updateGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		goodsTypeDao.updateGoodsType(goodsType);
	}

	@Override
	public void deleteGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		goodsTypeDao.deleteGoodsType(goodsType);
	}

	@Override
	public Page findGoodsTypeList(int currentPage, int PageSize) {
		// TODO Auto-generated method stub
		Page page = goodsTypeDao.findGoodsType(currentPage, PageSize);
		return page;
	}

	@Override
	public GoodsType findGoodsTypeById(int goodsTypeId) {
		// TODO Auto-generated method stub
		GoodsType goodsType = goodsTypeDao.findGoodsTypeById(goodsTypeId);
		return goodsType;
	}

	public List<GoodsType> findGoodsType() {
		return goodsTypeDao.findGoodsType();
	}
	
	
}
