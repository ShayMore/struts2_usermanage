package com.momostruts2.entity;

/**
 * 管理员
 * @author MoYalan
 *
 */
public class Manager {
	
	private int id;//编号
	private String username;//用户名
	private String password;//密码
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Manager [id=" + id + ", username=" + username + ", password="
				+ password + "]";
	}

}
