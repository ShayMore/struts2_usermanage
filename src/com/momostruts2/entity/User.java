package com.momostruts2.entity;

/**
 * 普通用户
 * @author MoYalan
 *
 */
public class User {
	
	private int id;				//编号
	private String username;	//用户名
	private String password;	//密码
	private String email;		//邮箱
	private String sex;			//性别 0女/1男
	private String nickname;	//昵称
	private String phone;		//手机号
	private String regtime;		//注册时间
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", sex=" + sex
				+ ", nickname=" + nickname + ", phone=" + phone + ", regtime="
				+ regtime + "]";
	}
}
