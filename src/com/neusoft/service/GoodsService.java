package com.neusoft.service;

import com.neusoft.bean.Goods;
import com.neusoft.page.Page;

/**
 * ��Ʒ
 * @author admin
 *
 */
public interface GoodsService {
	public void saveGoods(Goods goods);
	public void updateGoods(Goods goods);
	public void deleteGoods(Goods goods);
	public Page findGoodsList(int currentPage,int pageSize);
	public Goods findGoodsById(int goodsid);
}
