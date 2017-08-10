package com.neusoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.User;
import com.neusoft.dao.UserDao;
import com.neusoft.page.Page;

/**
 * ”√ªß
 * @author admin
 *
 */
public class UserDaoImpl implements UserDao{
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession(){
		Session session = sessionFactory.getCurrentSession();
		return session;
	}
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		getSession().save(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		getSession().update(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		getSession().delete(user);
	}

	@Override
	public Page findUser(int currentPage, int pageSize) {
		Query query = getSession().createQuery("from User");
		query.setFirstResult((currentPage-1)*pageSize);
		query.setMaxResults(pageSize);
		List<User> data=query.list();
		Page page=new Page(data);
		page.setAllRow();
		page.setPageSize(pageSize);
		page.setTotalPage();
		page.setCurrentPage(currentPage);
		return page;
		
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		Query query = getSession().createQuery("from User a where a.id="+id);
		User user=(User)query.list().get(0);
		return user;
	}
	
}
