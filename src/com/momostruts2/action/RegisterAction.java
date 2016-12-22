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
	
	private User reg;
	private String password2;
	private UserService userService = new UserServiceImpl();
	
	public User getReg() {
		return reg;
	}
	public void setReg(User reg) {
		this.reg = reg;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String execute() {
		int i = userService.register(reg);
		if(i == 0) {
			return INPUT;
		}
		return SUCCESS;
	}
}
