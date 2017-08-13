package com.neusoft.bean;

import java.util.Set;

/**
 * 订单
 * @author admin
 *
 */
public class Orders {
	//订单id
	private int ordersId;
	//订单名
	private String ordersName;
	//订单项
	private Set<OrdersItem> ordersItems;
	
	public int getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(int ordersId) {
		this.ordersId = ordersId;
	}
	public String getOrdersName() {
		return ordersName;
	}
	public void setOrdersName(String ordersName) {
		this.ordersName = ordersName;
	}
	public Set<OrdersItem> getOrdersItems() {
		return ordersItems;
	}
	public void setOrdersItems(Set<OrdersItem> ordersItems) {
		this.ordersItems = ordersItems;
	}
	
}
