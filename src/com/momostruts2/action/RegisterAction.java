package com.momostruts2.action;

import com.momostruts2.entity.User;
import com.momostruts2.service.UserService;
import com.momostruts2.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 注册C层
 * @author MoYalan
 *
 */
@SuppressWarnings("serial")
public class RegisterAction extends ActionSupport {
	
	private User user;
	private String password2;
	private UserService userService = new UserServiceImpl();
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String execute() {
		int i = userService.register(user);
		if(i == 0) {
			return INPUT;
		}
		return SUCCESS;
	}
}
