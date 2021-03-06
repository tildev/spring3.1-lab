package com.tildev.spirng31.dao;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tildev.spring31.dao.DaoFactory;
import com.tildev.spring31.dao.UserDao;
import com.tildev.spring31.domain.UserVo;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao = context.getBean("userDao", UserDao.class);

		UserVo user = new UserVo();

		user.setUserId("idH");
		user.setUserName("nameH");
		user.setUserPassword("passwordH");

		dao.add(user);

		System.out.println(user.getUserId() + " 등록 성공!");

		UserVo user2 = dao.get(user.getUserId());

		System.out.println(user2.getUserName());
		System.out.println(user2.getUserPassword());
		System.out.println(user2.getUserId() + " 조회 성공!");

	}
}
