package com.tildev.spring31.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.context.annotation.Bean;

import com.tildev.spring31.domain.UserVo;

/**
 * @author tildev
 * @date 2019. 7. 28.
 */
public class UserDao {

	private ConnectionMaker connectionMaker;

	private Connection c;
	
	private UserVo user;
	
	public UserDao(ConnectionMaker connectionMaker) {
		this.connectionMaker = connectionMaker;
	}

	public void add(UserVo user) throws ClassNotFoundException, SQLException {
		Connection c = connectionMaker.makeConnection();

		PreparedStatement ps = c.prepareStatement("insert into users(user_id, user_name, user_password) values(?,?,?)");
		ps.setString(1, user.getUserId());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserPassword());

		ps.executeUpdate();
		c.close();
	}

	public UserVo get(String userId) throws ClassNotFoundException, SQLException {
		this.c = connectionMaker.makeConnection();

		PreparedStatement ps = c.prepareStatement("select * from users where user_id = ?");
		ps.setString(1, userId);

		ResultSet rs = ps.executeQuery();
		rs.next();

		this.user = new UserVo();
		this.user.setUserId(rs.getString("user_id"));
		this.user.setUserName(rs.getString("user_name"));
		this.user.setUserPassword(rs.getString("user_password"));

		rs.close();
		ps.close();
		c.close();

		return user;
	}

}
