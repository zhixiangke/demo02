package com.lx.bean;
/**
 * @author 何工
 * @date 2019年4月1日 上午11:40:41
 * @Desc 通过 继承 order 方式 扩展 OrderUser 
 */
public class OrderUser extends Order {

	//添加user 的属性 
	
	private String username;
	private String address;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrderUser [username=" + username + ", address=" + address + "]" +super.toString();
	}

	
	
	

}
