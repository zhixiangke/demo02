package com.lx.demo01;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.lx.bean.OrderUser;
import com.lx.bean.QueryVo;
import com.lx.bean.User;
import com.lx.mapper.OrderMapper;
import com.lx.mapper.UserMapper;
import com.lx.utils.MyBatiesUtils;

/**
 * @author 何工
 * @date 2019年4月1日 上午9:17:38
 * @Desc
 */
public class TestOrder {

	@Test
	public void demo01() {

		// 加载 sqlmapconfig 文件

		// sqlsessionFactory

		SqlSessionFactory sqlSessionFactory = MyBatiesUtils.getFactory();
		// sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 拿到 mapper 代理对象
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);

		// 打印查出来的结果
		System.out.println(orderMapper.queryOrderById(3));

	}

	//一对一的 查询 
	@Test
	public void demo02() {

		// 加载 sqlmapconfig 文件

		// sqlsessionFactory

		SqlSessionFactory sqlSessionFactory = MyBatiesUtils.getFactory();
		// sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 拿到 mapper 代理对象
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<OrderUser> list = orderMapper.queryOrderUser();
		list.forEach(System.out::println);
	}
	
	// 一对多的操作    关联查询 
	@Test
	public void demo03() {
		
		SqlSessionFactory sqlSessionFactory = MyBatiesUtils.getFactory();
		// sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		// 拿到 mapper 代理对象
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		
		List<User> list = orderMapper.queryUserOrder();
		
		list.forEach(System.out::println);
	}
}
