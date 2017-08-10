package com.neusoft.service;

import com.neusoft.bean.Goods;
import com.neusoft.page.Page;

/**
 * …Ã∆∑
 * @author admin
 *
 */
public interface GoodsService {
	public void saveGoods(Goods goods);
	public void updateGoods(Goods goods);
	public void deleteGoods(Goods goods);
	public Page findGoods(int currentPage,int pageSize);
	public Goods findGoodsById(int goodsid);
}
