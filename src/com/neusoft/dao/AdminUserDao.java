package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.User;
import com.neusoft.page.Page;

/**
 * π‹¿Ì‘±
 * @author admin
 *
 */
public interface AdminUserDao {
	public void saveAdminUser(AdminUser adminUser );
	public void updateAdminUser(AdminUser adminUser);
	public void deleteAdminUser(AdminUser adminUser);
	public Page findAdminUser(int currentPage,int pageSize);
	public AdminUser findAdminById(int id);
}
