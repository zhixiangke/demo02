package com.lx.bean;
/**
 * @author 何工
 * @date 2019年3月29日 上午9:51:36
 * @Desc
 */

import java.util.List;

public class User {
	private int id;
	private String username;// 用户姓名
	private String sex;// 性别
	private String address;// 地址
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username, String sex, String address) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.address = address;
	}

	public User(String username, String sex, String address) {
		this.username = username;
		this.sex = sex;
		this.address = address;
	}
	

	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", address=" + address + ", orders="
				+ orders + "]";
	}

	//user 中 有多个订单   使用list 属性 添加订单
	private List<Order> orders;
	
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
