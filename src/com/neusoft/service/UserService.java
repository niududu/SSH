package com.neusoft.service;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.User;
import com.neusoft.page.Page;

/**
 * ”√ªß
 * @author admin
 *
 */
public interface UserService {
	public void saveUser(User user );
	public void updateUser(User user);
	public void deleteUser(User user);
	public Page findUserList(int currentPage,int pageSize);
	public User findUserById(int id);
	
}
