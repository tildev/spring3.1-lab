package com.tildev.spirng31.dao;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tildev.spring31.dao.DaoFactory;
import com.tildev.spring31.dao.UserDao;

public class UserDaoTest_DaoFactory_VS_ApplcationContext {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		DaoFactory factory = new DaoFactory();
		UserDao dao1 = factory.userDao();
		UserDao dao2 = factory.userDao();
		
		System.out.println(dao1);
		System.out.println(dao2);
		
		//singleton registry
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao3 = context.getBean("userDao", UserDao.class);
		UserDao dao4 = context.getBean("userDao", UserDao.class);

		System.out.println(dao3);
		System.out.println(dao4);

	}
}
