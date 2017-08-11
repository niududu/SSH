package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.bean.Goods;
import com.neusoft.bean.User;
import com.neusoft.page.Page;
import com.neusoft.service.GoodsService;
import com.neusoft.service.UserService;
import com.neusoft.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class goodsAction extends ActionSupport{
	private int goodsid;
	private String goodsname;
	private String goodsdesc;
	private int price;
	
	public int getGoodsid() {
		return goodsid;
	}
	public void setGoodsid(int goodsid) {
		this.goodsid = goodsid;
	}
	public String getGoodsname() {
		return goodsname;
	}
	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}
	public String getGoodsdesc() {
		return goodsdesc;
	}
	public void setGoodsdesc(String goodsdesc) {
		this.goodsdesc = goodsdesc;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//当前页
	private int currentPage=1;
	//页面显示的条数
	private int pageSize=5;
	private Page page;
	//用来接收查找到的数据
	private List<Goods> data;
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
	public List<Goods> getData() {
		return data;
	}
	public void setData(List<Goods> data) {
		this.data = data;
	}
	private Goods goods;
	
	public Goods getGoods() {
		return goods;
	}
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	//需要调用业务逻辑层的接口
	private GoodsService goodsService;
	
	public GoodsService getGoodsService() {
		return goodsService;
	}
	public void setGoodsService(GoodsService goodsService) {
		this.goodsService = goodsService;
	}
	@Override
	public String execute() throws Exception {
		page =goodsService.findGoodsList(currentPage, pageSize);
		return "success";
	}
	public String register(){
		Goods goods=new Goods();
		goods.setGoodsid(goodsid);
		goods.setGoodsname(goodsname);
		goods.setGoodsdesc(goodsdesc);
		goods.setPrice(price);
		goodsService.saveGoods(goods);
		return "addsuccess";
	}
	public String findGoodsById(){
		goods= goodsService.findGoodsById(goodsid);
		return "updatetopage";
	}
	public String updateGoods(){
		Goods goods=new Goods();
		goods.setGoodsid(goodsid);
		goods.setGoodsname(goodsname);
		goods.setGoodsdesc(goodsdesc);
		goods.setPrice(price);
		goodsService.updateGoods(goods);
		return "updatesuccess";
	}
	public String deleteGoodsById(){
		goods=goodsService.findGoodsById(goodsid);
		goodsService.deleteGoods(goods);
		return "deletesuccess";
	}
	
	
}
