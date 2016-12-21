package com.momostruts2.dao;

import java.util.List;

import com.momostruts2.entity.User;

public interface UserDao {
	
	/**
	 * 新增用户
	 * @param user
	 * @return
	 */
	public int saveUser(User user) ;
	
	/**
	 * 根据id查询用户信息
	 * @param id
	 * @return
	 */
	public User getUser(int id);
	
	/**
	 * 编辑用户信息
	 * @param user
	 * @return
	 */
	public int editUser(User user);
	
	/**
	 * 获取用户总数
	 * @return
	 */
	public int getUserAmount();
	
	/**
	 * 分页获取用户列表
	 * @param id
	 * @return
	 */
	public List<User> getUserList(int currentpage, int pagesize);
	
	/**
	 * 通过用户名获取单个用户信息
	 * @return
	 */
	public User getUser(String username);

	/**
	 * 通过用户名检测用户是否存在
	 * @param username
	 * @return
	 */
	public int check(String username);
}
