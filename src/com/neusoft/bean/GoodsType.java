package com.neusoft.bean;

import java.util.Set;

/**
 * 商品类别
 * @author admin
 *
 */
public class GoodsType {
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
	
	
}
