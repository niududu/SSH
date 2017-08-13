package com.neusoft.bean;
/**
 * 商品 (未加入商品类型的相关属性)
 * @author admin
 *
 */
public class Goods {
	//商品编号
	private int goodsid;
	//商品名称
	private String goodsname;
	//商品描述
	private String goodsdesc;
	//商品价格
	private int price;
	
	private GoodsType goodsTypees;
		
	public GoodsType getGoodsTypees() {
		return goodsTypees;
	}
	public void setGoodsTypees(GoodsType goodsTypees) {
		this.goodsTypees = goodsTypees;
	}
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
	
}
