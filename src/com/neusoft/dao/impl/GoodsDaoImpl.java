package com.neusoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.neusoft.bean.Goods;
import com.neusoft.dao.GoodsDao;
import com.neusoft.page.Page;

/**
 * 商品
 * @author admin
 *
 */
public class GoodsDaoImpl implements GoodsDao {
	private SessionFactory sessionFactory;
	//Set方法注入
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}

	@Override
	public void saveGoods(Goods goods) {
		// TODO Auto-generated method stub
		getSession().save(goods);
	}

	@Override
	public void updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		getSession().update(goods);
	}

	@Override
	public void deleteGoods(Goods goods) {
		// TODO Auto-generated method stub
		getSession().delete(goods);
	}

	@Override
	public Page findGoods(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from Goods");
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<Goods> data=query.list();
		Page page=new Page(data);
		page.setAllRow();
		page.setPageSize(pageSize);
		page.setTotalPage();
		page.setCurrentPage(currentPage);
		return page;
	}

	@Override
	public Goods findGoodsById(int goodsid) {
		// TODO Auto-generated method stub
		Query query=getSession().createQuery("from Goods a where a.goodsid="+goodsid);
		Goods goods=(Goods) query.list().get(0);
		return goods;
	}

}
