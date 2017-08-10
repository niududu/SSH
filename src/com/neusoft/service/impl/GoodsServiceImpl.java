package com.neusoft.service.impl;

import com.neusoft.bean.Goods;
import com.neusoft.dao.GoodsDao;
import com.neusoft.page.Page;
import com.neusoft.service.GoodsService;

/**
 * ��Ʒ
 * @author admin
 *
 */
public class GoodsServiceImpl implements GoodsService {
	//ҵ���߼���������ݳ־ò�Ľӿ�
	private GoodsDao goodsDao;
	//ʹ��Set����ע��
	public void setGoodsDao(GoodsDao goodsDao) {
		this.goodsDao = goodsDao;
	}
	
	@Override
	public void saveGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsDao.saveGoods(goods);
	}

	@Override
	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsDao.updateGoods(goods);
	}

	@Override
	public void deleteGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsDao.deleteGoods(goods);
	}

	@Override
	public Page findGoods(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		Page page = goodsDao.findGoods(currentPage, pageSize);
		return page;
	}

	@Override
	public Goods findGoodsById(int goodsid) {
		// TODO Auto-generated method stub
		Goods goods = goodsDao.findGoodsById(goodsid);
		return goods;
	}

}
