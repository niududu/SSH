package com.neusoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.User;
import com.neusoft.dao.AdminUserDao;

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
		
	}
	

	@Override
	public void deleteAdminUser(AdminUser adminUser) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAdminUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AdminUser> findAdminUser() {
		Query query = getSession().createQuery("from AdminUser");
		return query.list();
	}
	
	
}
