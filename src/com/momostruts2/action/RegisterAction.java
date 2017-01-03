package com.momostruts2.action;

import com.momostruts2.entity.User;
import com.momostruts2.service.UserService;
import com.momostruts2.service.impl.UserServiceImpl;
import com.momostruts2.util.StringTool;
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
		
//		System.out.println("我进入到了validate方法");
		if(StringTool.isNotEmpty(reg.getUsername())) {
			if(StringTool.isNotEmpty(password2)) {
				int i = userService.check(reg.getUsername());
				if(i > 0) {
					addFieldError("err", "用戶名已经存在！");
					return ERROR;
				} else if(!reg.getPassword().equals(password2)) {
					addActionError("两次输入密码不一致！");
				}
			} else {
				addActionError("密码不能为空！");
			}
		} else {
			System.out.println("username="+reg.getUsername());
			addFieldError("err","用户名不能为空！");
			addFieldError("err", "用户名不能为Null");
			addFieldError("err", "我就是一个可爱的小姑娘");
			addFieldError("haha", "Godie");
//			addActionError("啦啦~");
			return ERROR;
		}
	
		
		int i = userService.register(reg);
		if(i == 0) {
			return INPUT;
		}
		return SUCCESS;
	}
	
	public void validate() {
//		System.out.println("我进入到了validate方法");
//		if(StringTool.isNotEmpty(reg.getUsername())) {
//			if(StringTool.isNotEmpty(password2)) {
//				int i = userService.check(reg.getUsername());
//				if(i > 0) {
//					addFieldError("err", "用戶名已经存在！");
//				} else if(!reg.getPassword().equals(password2)) {
//					addActionError("两次输入密码不一致！");
//				}
//			} else {
//				addActionError("密码不能为空！");
//			}
//		} else {
//			addActionError("用户名不能为空！");
//		}
	}
}
