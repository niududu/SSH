package com.neusoft.bean;

import java.util.Set;

/**
 * ����
 * @author admin
 *
 */
public class Orders {
	//����id
	private int ordersId;
	//������
	private String ordersName;
	//������
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
