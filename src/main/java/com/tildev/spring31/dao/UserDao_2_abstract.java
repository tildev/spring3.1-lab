package com.tildev.spring31.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tildev.spring31.domain.UserVo;

/**
 * @author tildev
 * @date 2019. 7. 28.
 */
public abstract class UserDao_2_abstract {

	public abstract Connection getConnection() throws ClassNotFoundException, SQLException;

	public class NUserDao extends UserDao_2_abstract {
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost/spring31db?serverTimezone=UTC&useSSL=false", "spring31", "spring31");

			return c;
		}
	}

	public class DUserDao extends UserDao_2_abstract {
		public Connection getConnection() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection(
					"jdbc:mysql://localhost/spring31db?serverTimezone=UTC&useSSL=false", "spring31", "spring31");

			return c;
		}
	}

	public void add(UserVo user) throws ClassNotFoundException, SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("insert into users(user_id, user_name, user_password) values(?,?,?)");
		ps.setString(1, user.getUserId());
		ps.setString(2, user.getUserName());
		ps.setString(3, user.getUserPassword());

		ps.executeUpdate();
		c.close();
	}

	public UserVo get(String userId) throws ClassNotFoundException, SQLException {
		Connection c = getConnection();

		PreparedStatement ps = c.prepareStatement("select * from users where user_id = ?");
		ps.setString(1, userId);

		ResultSet rs = ps.executeQuery();
		rs.next();

		UserVo user = new UserVo();
		user.setUserId(rs.getString("user_id"));
		user.setUserName(rs.getString("user_name"));
		user.setUserPassword(rs.getString("user_password"));

		rs.close();
		ps.close();
		c.close();

		return user;
	}
}
