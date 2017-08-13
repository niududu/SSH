package com.neusoft.service;

import java.util.List;

import com.neusoft.bean.GoodsType;
import com.neusoft.page.Page;

/**
 * 商品类别
 * @author admin
 *
 */
public interface GoodsTypeService {
	public void saveGoodsType(GoodsType goodsType);
	public void updateGoodsType(GoodsType goodsType);
	public void deleteGoodsType(GoodsType goodsType);
	public Page findGoodsTypeList(int currentPage,int PageSize);
	public GoodsType findGoodsTypeById(int goodsTypeId);
	public List<GoodsType> findGoodsType();
}
