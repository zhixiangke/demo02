package com.lx.bean;

import java.sql.Date;

/**
 * @author 何工
 * @date 2019年4月1日 上午9:24:45
 * @Desc order 类型
 */
public class Order {

	// 订单id
	private int id;
	// 用户id
	private Integer userId;
	// 订单号
	private String number;
	// 订单创建时间
	private Date createtime;
	// 备注
	private String note;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", number=" + number + ", createtime=" + createtime
				+ ", note=" + note + "]";
	}
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int id, Integer userId, String number, Date createtime, String note) {
		super();
		this.id = id;
		this.userId = userId;
		this.number = number;
		this.createtime = createtime;
		this.note = note;
	}
	
	//添加新的属性 
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
