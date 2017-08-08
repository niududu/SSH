package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.service.AdminUserService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserAction extends ActionSupport {
	//需要调用业务逻辑层的接口
	private AdminUserService adminUserService;
	//用来接收查找到的数据
	private List<AdminUser> data;
	
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
		data = adminUserService.findAdminUser();
		return "success";
	}
}
