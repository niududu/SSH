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
	private AdminUser adminUser;
	public AdminUser getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(AdminUser adminUser) {
		this.adminUser = adminUser;
	}
	//需要调用业务逻辑层的接口
	private AdminUserService adminUserService;
	//当前页
	private int currentPage=1;
	//页面显示的条数
	private int pageSize=5;
	private Page page;
	//用来接收查找到的数据
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
	//提供set方法进行注入
	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}
	@Override
	public String execute() throws Exception {
		//使用业务逻辑层的接口，调用查找所有管理员的方法
		page = adminUserService.findAdminUserList(currentPage, pageSize);
		return "success";
	}
	public String addAdminUser(){
		return "addtopage";
	}
	public String register(){
		AdminUser adminUser=new AdminUser();
		adminUser.setUsername(username);
		adminUser.setPassword(password);
		adminUserService.saveAdminUser(adminUser);
		return "addsuccess";
	}
	//通过id查找数据
	public String findAdminById(){
		 adminUser = adminUserService.findAdminById(id);
		return "updatetopage";
	}
	public String updateAdmin(){
		adminUser=new AdminUser();
		adminUser.setId(id);
		adminUser.setUsername(username);
		adminUser.setPassword(password);
		adminUserService.updateAdminUser(adminUser);
		return "updatesuccess";
	}
	public String deleteAdminById(){
		adminUser = adminUserService.findAdminById(id);
		adminUserService.deleteAdminUser(adminUser);
		return "deletesuccess";
	}
}
