package com.momostruts2.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.momostruts2.action.LoginAction;
import com.momostruts2.util.StringTool;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

@SuppressWarnings("serial")
public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("进入到登录拦截器 LoginInterceptor");
		Object object = ai.getAction();
		if(object != null) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			LoginAction loginAction = (LoginAction)object;
			String username = loginAction.getUsername();
			String password = loginAction.getPassword();
			if(StringTool.isEmpty(username)) {
				System.out.println("用户名为空");
				session.setAttribute("login", "用户名不能为空！");
				return Action.INPUT;
			}
			if(StringTool.isEmpty(password)) {
				System.out.println("密码为空");
				session.setAttribute("login", "密码不能为空！");
				return Action.INPUT;
			}
		}
		return ai.invoke();
	}

}
