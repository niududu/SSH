package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.Goods;
import com.neusoft.bean.GoodsType;
import com.neusoft.page.Page;

/**
 * 商品类别
 * @author admin
 *
 */
public interface GoodsTypeDao {
	public void saveGoodsType(GoodsType goodsType);
	public void updateGoodsType(GoodsType goodsType);
	public void deleteGoodsType(GoodsType GoodsType);
	public Page findGoodsType(int currentPage,int pageSize);
	public GoodsType findGoodsTypeById(int GoodsTypeId);
	public List<GoodsType> findGoodsType();
}
