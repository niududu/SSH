package com.neusoft.service;

import java.util.List;

import com.neusoft.bean.AdminUser;

/**
 * π‹¿Ì‘±
 * @author admin
 *
 */
public interface AdminUserService {
	public void saveAdminUser(AdminUser adminUser );
	public void deleteAdminUser(AdminUser adminUser);
	public void updateAdminUserById(int id);
	public List<AdminUser> findAdminUser();
}
