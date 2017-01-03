package com.momostruts2.action;

import com.momostruts2.entity.User;
import com.momostruts2.service.impl.UserServiceImpl;
import com.momostruts2.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 登录C层
 * @author MoYalan
 *
 */
@SuppressWarnings("serial")
public class LoginAction extends ActionSupport 
//implements ModelDriven<User>
{
	
//	// ModelDriven 方式，必须 new，struts不自动创建； URL中用普通属性传值方式传递参数值
//	private User user  = new User();
	
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
		System.out.println("LoginAction : username " + username);
		System.out.println("LoginAction : password " + password);
		int i = userService.login(username, password);
		if(i == 0) {
			return INPUT;
		}
		return SUCCESS;
	}
	
//	@Override
//	public User getModel() {
//		return user;
//	}

}
