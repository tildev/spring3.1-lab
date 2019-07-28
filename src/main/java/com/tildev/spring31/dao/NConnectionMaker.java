package com.tildev.spring31.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author tildev
 * @date 2019. 7. 28.
 */
public class NConnectionMaker implements ConnectionMaker {
	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/spring31db?serverTimezone=UTC&useSSL=false",
				"spring31", "spring31");

		return c;
	}
}