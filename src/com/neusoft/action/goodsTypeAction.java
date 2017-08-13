package com.neusoft.action;

import java.util.List;
import java.util.Set;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.Goods;
import com.neusoft.bean.GoodsType;
import com.neusoft.bean.User;
import com.neusoft.page.Page;
import com.neusoft.service.GoodsService;
import com.neusoft.service.GoodsTypeService;
import com.neusoft.service.UserService;
import com.neusoft.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class goodsTypeAction extends ActionSupport{
	private int goodsTypeId;
	private String goodsTypeName;
	private Set<Goods> goodes;
	
	public int getGoodsTypeId() {
		return goodsTypeId;
	}
	public void setGoodsTypeId(int goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	public String getGoodsTypeName() {
		return goodsTypeName;
	}
	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	public Set<Goods> getGoodes() {
		return goodes;
	}
	public void setGoodes(Set<Goods> goodes) {
		this.goodes = goodes;
	}
	//当前页
	private int currentPage=1;
	//页面显示的条数
	private int pageSize=5;
	private Page page;
	//用来接收查找到的数据
	private List<GoodsType> data;
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
	public List<GoodsType> getData() {
		return data;
	}
	public void setData(List<GoodsType> data) {
		this.data = data;
	}
	private GoodsType goodsType;
	
	public GoodsType getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}
	//需要调用业务逻辑层的接口
	private GoodsTypeService goodsTypeService;
	
	public GoodsTypeService getGoodsTypeService() {
		return goodsTypeService;
	}
	public void setGoodsTypeService(GoodsTypeService goodsTypeService) {
		this.goodsTypeService = goodsTypeService;
	}
	@Override
	public String execute() throws Exception {
		page=goodsTypeService.findGoodsTypeList(currentPage, pageSize);
		return "success";
	}
	public String addGoodsType(){
		return "addtopage";
	}
	public String register(){
		GoodsType goodsType=new GoodsType();
		goodsType.setGoodsTypeId(goodsTypeId);
		goodsType.setGoodsTypeName(goodsTypeName);
		goodsTypeService.saveGoodsType(goodsType);
		return "addsuccess";
	}
	public String findGoodsTypeById(){
		goodsType = goodsTypeService.findGoodsTypeById(goodsTypeId);
		return "updatetopage";
	}
	public String updateGoodsType(){
		GoodsType goodsType=new GoodsType();
		goodsType.setGoodsTypeId(goodsTypeId);
		goodsType.setGoodsTypeName(goodsTypeName);
		goodsTypeService.updateGoodsType(goodsType);
		return "updatesuccess";
	}
	public String deleteGoodsTypeById(){
		goodsType= goodsTypeService.findGoodsTypeById(goodsTypeId);
		goodsTypeService.deleteGoodsType(goodsType);
		return "deletesuccess";
	}
	
	
}
