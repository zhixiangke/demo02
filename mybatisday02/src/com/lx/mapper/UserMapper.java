package com.lx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.lx.bean.ListVo;
import com.lx.bean.QueryVo;
import com.lx.bean.User;

/**
 * @author 何工
 * @date 2019年4月1日 上午9:11:18
 * @Desc
 */
public interface UserMapper {

	/**
	 * 通过 包装类查询 user
	 * 
	 * @param vo
	 * @return
	 */
	public User queryUserById(QueryVo vo);

	/**
	 * 测试 动态sql
	 * 
	 * @param u
	 * @return
	 */
	public List<User> queryUserBySexAndName(User u);
	
	/**
	 *  list 查询 操作 
	 * @param listVo
	 * @return
	 */
	public List<User> queryUserByIds(ListVo listVo);

	// 查询 的 注解 sql  
	// 注解开发  不需要  mapper 文件
	
	// 注解开发  参数的设置 返回值  的配置 不灵活   官方建议使用 mapper文件开发 
	@Select("select * from user where id = #{id}")
	User findById(@Param("id") int id);

}
