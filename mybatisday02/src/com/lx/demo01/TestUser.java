package com.lx.demo01;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import com.lx.bean.ListVo;
import com.lx.bean.QueryVo;
import com.lx.bean.User;
import com.lx.mapper.UserMapper;
import com.lx.utils.MyBatiesUtils;

/**
 * @author 何工
 * @date 2019年4月1日 上午9:17:38
 * @Desc
 */
public class TestUser {

	@Test // 测试包装类查询
	public void demo01() {

		// 加载 sqlmapconfig 文件

		// sqlsessionFactory

		SqlSessionFactory sqlSessionFactory = MyBatiesUtils.getFactory();
		// sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 拿到 mapper 代理对象
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		// 组装包装类
		QueryVo vo = new QueryVo();
		User u = new User();
		u.setId(2);
		vo.setUser(u);
		// 打印查出来的结果
		System.out.println(userMapper.queryUserById(vo));

	}

	@Test
	public void demo02() {
		SqlSessionFactory sqlSessionFactory = MyBatiesUtils.getFactory();
		// sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 拿到 mapper 代理对象
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

		User u = new User();

//		if (u.getUsername() == null || u.getUsername() == "") {
//			u.setUsername("默认...");
//		}
		u.setSex("1");
//		u.setUsername("张");
		List<User> list = userMapper.queryUserBySexAndName(u);

		list.forEach(System.out::println);
	}

	/**
	 * 测试 list 的 foreach 动态标签
	 */
	@Test
	public void demo03() {
		SqlSessionFactory sqlSessionFactory = MyBatiesUtils.getFactory();
		// sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 拿到 mapper 代理对象
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		ListVo listvo = new ListVo();
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(10);
		listvo.setIds(list);
		List<User> users = userMapper.queryUserByIds(listvo);
		users.forEach(e->System.out.println(e));
	}
	
	/**
	 * 测试 注解 开发
	 */
	@Test
	public void demo04() {
		SqlSessionFactory sqlSessionFactory = MyBatiesUtils.getFactory();
		// sqlsession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		// 拿到 mapper 代理对象
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		
		User u = userMapper.findById(2);
		System.out.println(u);
		
	}
}
