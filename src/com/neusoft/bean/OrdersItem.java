package com.neusoft.bean;
/**
 * 订单项
 * 目的：把选择到的商品封装成订单项
 * 因为一个订单可以有多个订单项，
 * 这样子就不用去处理商品的相关信息
 * @author admin
 *
 */
public class OrdersItem {
	//订单项id
	private int ordersItemId;
	//订单项数量
	private int ordersItemSum;
	//与订单的多对一映射
	private Orders orderses;
	public int getOrdersItemId() {
		return ordersItemId;
	}
	public void setOrdersItemId(int ordersItemId) {
		this.ordersItemId = ordersItemId;
	}
	public int getOrdersItemSum() {
		return ordersItemSum;
	}
	public void setOrdersItemSum(int ordersItemSum) {
		this.ordersItemSum = ordersItemSum;
	}
	public Orders getOrderses() {
		return orderses;
	}
	public void setOrderses(Orders orderses) {
		this.orderses = orderses;
	}
	
}
