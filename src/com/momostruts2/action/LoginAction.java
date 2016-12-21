package com.momostruts2.action;

import com.momostruts2.service.impl.UserServiceImpl;
import com.momostruts2.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 登录C层
 * @author MoYalan
 *
 */
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	private UserService userService = new UserServiceImpl();
	
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
	
	public String execute() {
		System.out.println("成功进入loginaction");
		int i = userService.login(username, password);
		if(i == 0) {
			return INPUT;
		}
		return SUCCESS;
	}

}
