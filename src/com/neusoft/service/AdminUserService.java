package com.neusoft.service;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.page.Page;

/**
 * π‹¿Ì‘±
 * @author admin
 *
 */
public interface AdminUserService {
	public void saveAdminUser(AdminUser adminUser );
	public void deleteAdminUser(AdminUser adminUser);
	public void updateAdminUserById(int id);
	public Page findAdminUserList(int currentPage,int pageSize);
}
