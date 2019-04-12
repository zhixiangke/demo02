package com.lx.mapper;

import java.util.List;

import com.lx.bean.Order;
import com.lx.bean.OrderUser;
import com.lx.bean.QueryVo;
import com.lx.bean.User;

/**
 * @author 何工
 * @date 2019年4月1日 上午9:11:18
 * @Desc   测试订单类
 */
public interface OrderMapper {
	
	public Order queryOrderById(int id);

	// 多表查询 
	
	// 一对一  
	
	// 多表查询    订单表 和   用户表 就是 一对一 
	
	//通过 继承 order  添加新的属性  到 orderUser 中 
	
	//可以 在  order 添加一个 User 属性  通过 resultmap 来配置 
	public List<OrderUser> queryOrderUser();
	
	// 一对多 
	// 一个 用户 可以有多个订单
	public List<User> queryUserOrder();
	
}
