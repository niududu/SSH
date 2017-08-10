package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.User;
import com.neusoft.page.Page;
import com.neusoft.service.UserService;
import com.neusoft.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private int id;
	private String username;
	private String password;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//当前页
	private int currentPage=1;
	//页面显示的条数
	private int pageSize=5;
	private Page page;
	//用来接收查找到的数据
	private List<User> data;
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
	public List<User> getData() {
		return data;
	}
	public void setData(List<User> data) {
		this.data = data;
	}
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
	//需要调用业务逻辑层的接口
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Override
	public String execute() throws Exception {
		page =userService.findUserList(currentPage, pageSize);
		return "success";
	}
	public String register(){
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		userService.saveUser(user);
		return "success";
	}
	public String findUserById(){
		user=userService.findUserById(id);
		return "updatetopage";
	}
	public String updateUser(){
		user=new User();
		user.setId(id);
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		userService.updateUser(user);
		return "updatesuccess";
	}
	public String deleteUserById(){
		user=userService.findUserById(id);
		userService.deleteUser(user);
		return "deletesuccess";
	}
}
