package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.User;

/**
 * π‹¿Ì‘±
 * @author admin
 *
 */
public interface AdminUserDao {
	public void saveAdminUser(AdminUser adminUser );
	public void deleteAdminUser(AdminUser adminUser);
	public void updateAdminUserById(int id);
	public List<AdminUser> findAdminUser();
}
