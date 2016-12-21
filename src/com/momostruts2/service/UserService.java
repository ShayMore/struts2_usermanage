package com.momostruts2.service;

import java.util.List;

import com.momostruts2.entity.User;

/**
 * 用户管理接口
 * @author MoYalan
 *
 */
public interface UserService {
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public int register(User user);
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	public int login(String username, String password);

	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int editUser(User user);
	
	/**
	 * 分页查询用户列表
	 * @return
	 */
	public List<User> getUsers(int currentpage, int pagesize);
	
	/**
	 * 注销用户信息
	 * @return
	 */
	public int delUser(int id);
	
	/**
	 * 通过id获取单个用户信息
	 * @return
	 */
	public User getUser(int id);
	
}
