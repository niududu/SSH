package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.User;
import com.neusoft.dao.UserDao;
import com.neusoft.page.Page;
import com.neusoft.service.UserService;

/**
 * �û�
 * @author admin
 *
 */
public class UserServiceImpl implements UserService {
	//ҵ���߼���������ݳ־ò�Ľӿ�
	private UserDao userDao;
	//�ṩSet����ע��
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		userDao.deleteUser(user);
	}

	@Override
	public Page findUserList(int currentPage, int pageSize) {
		Page page = userDao.findUser(currentPage, pageSize);
		return page;
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		User user = userDao.findUserById(id);
		return user;
	}
	
	
}
