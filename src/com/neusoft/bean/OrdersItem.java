package com.neusoft.bean;
/**
 * ������
 * Ŀ�ģ���ѡ�񵽵���Ʒ��װ�ɶ�����
 * ��Ϊһ�����������ж�������
 * �����ӾͲ���ȥ������Ʒ�������Ϣ
 * @author admin
 *
 */
public class OrdersItem {
	//������id
	private int ordersItemId;
	//����������
	private int ordersItemSum;
	//�붩���Ķ��һӳ��
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
