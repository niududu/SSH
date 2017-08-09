package com.neusoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.User;
import com.neusoft.dao.AdminUserDao;
import com.neusoft.page.Page;

/**
 * π‹¿Ì‘±
 * @author admin
 *
 */
public class AdminUserDaoImpl implements AdminUserDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	@Override
	public void saveAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		getSession().save(adminUser);
	}
	

	@Override
	public void updateAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		getSession().update(adminUser);
	}

	@Override
	public void deleteAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		getSession().delete(adminUser);
	}

	@Override
	public Page findAdminUser(int currentPage,int pageSize) {
		Query query = getSession().createQuery("from AdminUser");
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<AdminUser> data=query.list();
		Page page=new Page(data);
		page.setAllRow();
		page.setPageSize(pageSize);
		page.setTotalPage();
		page.setCurrentPage(currentPage);
		
		return page;
	}
	@Override
	public AdminUser findAdminById(int id) {
		Query query=getSession().createQuery("from AdminUser a where a.id="+id);
		AdminUser admin=(AdminUser) query.list().get(0);
		return admin;
	}
	
	
}
