package com.neusoft.bean;
/**
 * ��Ʒ (δ������Ʒ���͵��������)
 * @author admin
 *
 */
public class Goods {
	//��Ʒ���
	private int goodsid;
	//��Ʒ����
	private String goodsname;
	//��Ʒ����
	private String goodsdesc;
	//��Ʒ�۸�
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
