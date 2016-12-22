package com.momostruts2.service.impl;

import java.util.List;

import com.momostruts2.dao.UserDao;
import com.momostruts2.dao.impl.UserDaoImpl;
import com.momostruts2.entity.User;
import com.momostruts2.service.UserService;

/**
 * 用户信息管理S层
 * @author MoYalan
 *
 */
public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();

	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int editUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int login(String username, String password) {
		System.out.println("进入ServiceImpl");
		int i = 0;
		int count = userDao.check(username);
		if(count > 0) {
			User user = userDao.getUser(username);
			if(user.getPassword().equals(password)) {
				i = 1;
				System.out.println("登录成功！");
			}
		} 
		return i;
	}

	@Override
	public List<User> getUsers(int currentpage, int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delUser(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
