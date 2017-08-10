package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.User;
import com.neusoft.page.Page;

/**
 * ”√ªß
 * @author admin
 *
 */
public interface UserDao {
	public void saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public Page findUser(int currentPage,int pageSize);
	public User findUserById(int id);
}
