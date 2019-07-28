package com.tildev.spirng31.dao;

import java.sql.SQLException;

import com.tildev.spring31.dao.DaoFactory;
import com.tildev.spring31.dao.UserDao;
import com.tildev.spring31.domain.UserVo;

public class UserDaoTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UserDao dao = new DaoFactory().userDao();

		UserVo user = new UserVo();

		user.setUserId("idG");
		user.setUserName("nameG");
		user.setUserPassword("passwordG");

		dao.add(user);

		System.out.println(user.getUserId() + " 등록 성공!");

		UserVo user2 = dao.get(user.getUserId());

		System.out.println(user2.getUserName());
		System.out.println(user2.getUserPassword());
		System.out.println(user2.getUserId() + " 조회 성공!");

	}
}
