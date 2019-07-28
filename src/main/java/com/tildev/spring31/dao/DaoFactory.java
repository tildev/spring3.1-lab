package com.tildev.spring31.dao;

/**
 * @author tildev
 * @date 2019. 7. 28.
 */
public class DaoFactory {
	public UserDao userDao() {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		return userDao;
	}
}
