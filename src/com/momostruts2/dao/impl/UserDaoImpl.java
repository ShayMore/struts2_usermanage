package com.momostruts2.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.momostruts2.dao.UserDao;
import com.momostruts2.entity.User;
import com.momostruts2.util.DatabaseConn;

/**
 * 用户信息管理
 * @author MoYalan
 *
 */
public class UserDaoImpl implements UserDao {
	
	private DatabaseConn dbc = new DatabaseConn();
	
	public int saveUser(User user) {
		String sql = "INSERT INTO user(username,password,email,sex,nickname,phone,regtime) "
				+ "VALUES(?,?,?,?,?,?,NOW())";
		PreparedStatement psmt = null;
		int i = 0;
		try {
			
			psmt = dbc.getConn().prepareStatement(sql);
			psmt.setString(1, user.getUsername());
			psmt.setString(2, user.getPassword());
			psmt.setString(3, user.getEmail());
			psmt.setString(4, user.getSex());
			psmt.setString(5, user.getNickname());
			psmt.setString(6, user.getPhone());
			i = psmt.executeUpdate();
			psmt.close();
		} catch (Exception e) {
			System.out.println("[添加用户]异常");
			e.printStackTrace();
		}		
		return i;
	}
	
	public User getUser(int id){
		User user = null;
		String sql = "SELECT id,username,password,email,nickname,phone,regtime,"
				+ "CASE sex WHEN '0' THEN '女' WHEN '1' THEN '男' END AS sex FROM user WHERE id=?";
		PreparedStatement psmt = null;
		try {
			psmt = dbc.getConn().prepareStatement(sql);
			psmt.setInt(1, id);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setId(id);
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setNickname(rs.getString("nickname"));
				user.setPhone(rs.getString("phone"));
				user.setSex(rs.getString("sex"));
				user.setRegtime(rs.getString("regtime"));
			}
			rs.close();
			psmt.close();
		} catch (Exception e) {
			System.out.println("[根据id查询用户]异常");
			e.printStackTrace();
		}
		return user;
	}
	
	public int editUser(User user) {
		String sql = "UPDATE user username=?,password=?,email=?,sex=?,nickname=?,phone=? WHERE id=?";
		PreparedStatement psmt = null;
		int i = 0;
		try {
			
			psmt = dbc.getConn().prepareStatement(sql);
			psmt.setString(1, user.getUsername());
			psmt.setString(2, user.getPassword());
			psmt.setString(3, user.getEmail());
			psmt.setString(4, user.getSex());
			psmt.setString(5, user.getNickname());
			psmt.setString(6, user.getPhone());
			psmt.setInt(7, user.getId());
			i = psmt.executeUpdate();
			psmt.close();
		} catch (Exception e) {
			System.out.println("[添加用户]异常");
			e.printStackTrace();
		}		
		return i;
	}
	
	public int getUserAmount(){
		String sql = "SELECT COUNT(*) FROM user";
		PreparedStatement psmt = null;
		int i = 0;
		try {
			psmt = dbc.getConn().prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				i = rs.getInt(1);
			}
			rs.close();
			psmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}
	
	public List<User> getUserList(int currentpage, int pagesize){
		String sql = "SELECT id,username,password,email,nickname,phone,regtime,"
				+ "CASE sex WHEN '0' THEN '女' WHEN '1' THEN '男' END AS sex FROM user WHERE id=?";
		PreparedStatement psmt = null;
		List<User> usList = new ArrayList<User>();
		try {
			psmt = dbc.getConn().prepareStatement(sql);
			psmt.setInt(1, (currentpage-1) * pagesize);
			psmt.setInt(1, pagesize);
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setNickname(rs.getString("nickname"));
				user.setPhone(rs.getString("phone"));
				user.setSex(rs.getString("sex"));
				user.setRegtime(rs.getString("regtime"));
				usList.add(user);
			}
			rs.close();
			psmt.close();
		} catch (Exception e) {
			System.out.println("[根据id查询用户]异常");
			e.printStackTrace();
		}
		return usList;
	}

	public User getUser(String username) {
		User user = null;
		String sql = "SELECT id,username,password,email,nickname,phone,regtime,"
				+ "CASE sex WHEN '0' THEN '女' WHEN '1' THEN '男' END AS sex FROM user WHERE username=?";
		PreparedStatement psmt = null;
		try {
			psmt = dbc.getConn().prepareStatement(sql);
			psmt.setString(1, username);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				user.setNickname(rs.getString("nickname"));
				user.setPhone(rs.getString("phone"));
				user.setSex(rs.getString("sex"));
				user.setRegtime(rs.getString("regtime"));
			}
			rs.close();
			psmt.close();
		} catch (Exception e) {
			System.out.println("[根据id查询用户]异常");
			e.printStackTrace();
		}
		return user;
	}

	public int check(String username) {
		String sql = "SELECT COUNT(*) FROM user WHERE username=?";
		PreparedStatement psmt = null;
		int i = 0;
		try {
			psmt = dbc.getConn().prepareStatement(sql);
			psmt.setString(1, username);
			ResultSet rs = psmt.executeQuery();
			if(rs.next()) {
				i = rs.getInt(1);
			}
			System.out.println("进入UserDao check i = " + i);
			rs.close();
			psmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
