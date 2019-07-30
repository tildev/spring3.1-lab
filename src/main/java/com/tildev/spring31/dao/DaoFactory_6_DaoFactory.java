package com.tildev.spring31.dao;

/**
 * @author tildev
 * @date 2019. 7. 28.
 */
public class DaoFactory_6_DaoFactory {
	public UserDao_6_DaoFactory userDao() {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao_6_DaoFactory userDao = new UserDao_6_DaoFactory(connectionMaker);
		return userDao;
	}
}
