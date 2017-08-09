package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.page.Page;
import com.neusoft.service.AdminUserService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserAction extends ActionSupport {
	private int id;
	private String username;
	private String password;
	//��Ҫ����ҵ���߼���Ľӿ�
	private AdminUserService adminUserService;
	//��ǰҳ
	private int currentPage=1;
	//ҳ����ʾ������
	private int pageSize=5;
	private Page page;
	//�������ղ��ҵ�������
	private List<AdminUser> data;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public List<AdminUser> getData() {
		return data;
	}
	public void setData(List<AdminUser> data) {
		this.data = data;
	}
	public AdminUserService getAdminUserService() {
		return adminUserService;
	}
	//�ṩset��������ע��
	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}
	@Override
	public String execute() throws Exception {
		//ʹ��ҵ���߼���Ľӿڣ����ò������й���Ա�ķ���
		page = adminUserService.findAdminUserList(currentPage, pageSize);
		return "success";
	}
	public String register(){
		AdminUser adminUser=new AdminUser();
		adminUser.setUsername(username);
		adminUser.setPassword(password);
		adminUserService.saveAdminUser(adminUser);
		return "success";
	}
}
