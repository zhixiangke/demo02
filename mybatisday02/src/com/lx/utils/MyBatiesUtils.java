	package com.lx.utils;
/**
 * @author 何工
 * @date 2019年3月29日 下午3:18:06
 * @Desc
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatiesUtils {

	private static SqlSessionFactory sessionFactory;
	static {

		SqlSessionFactoryBuilder builer = new SqlSessionFactoryBuilder();
		try {
			 sessionFactory = builer.build(new FileInputStream("src/SqlMapConfig.xml"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 获取session
	 * @return
	 */
	public static SqlSessionFactory getFactory() {
		return sessionFactory;
	}
}
