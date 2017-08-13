package com.neusoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.neusoft.bean.GoodsType;
import com.neusoft.dao.GoodsDao;
import com.neusoft.dao.GoodsTypeDao;
import com.neusoft.page.Page;

/**
 * 商品类别
 * @author admin
 *
 */
public class GoodsTypeDaoImpl implements GoodsTypeDao {
	
	private SessionFactory sessionFactory;
	//利用Set方法注入
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	@Override
	public void saveGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		getSession().save(goodsType);
	}

	@Override
	public void updateGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		getSession().update(goodsType);
	}

	@Override
	public void deleteGoodsType(GoodsType goodsType) {
		// TODO Auto-generated method stub
		getSession().delete(goodsType);
	}

	@Override
	public Page findGoodsType(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from GoodsType");
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<GoodsType> data=query.list();
		Page page=new Page(data);
		page.setAllRow();
		page.setPageSize(pageSize);
		page.setTotalPage();
		page.setCurrentPage(currentPage);
		return page;
	}

	@Override
	public GoodsType findGoodsTypeById(int goodsTypeId) {
		// TODO Auto-generated method stub
		Query query=getSession().createQuery("from GoodsType a where a.goodsTypeId="+goodsTypeId);
		GoodsType goodsType=(GoodsType) query.list().get(0);
		return goodsType;
	}

	public List<GoodsType> findGoodsType() {
		String hql="from GoodsType";
		List<GoodsType> list= getSession().createQuery(hql).list();
		return list;
	}

}
