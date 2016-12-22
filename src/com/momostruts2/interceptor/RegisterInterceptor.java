package com.momostruts2.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.momostruts2.action.RegisterAction;
import com.momostruts2.entity.User;
import com.momostruts2.util.StringTool;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 注册拦截器
 * @author MoYalan
 *
 */
@SuppressWarnings("serial")
public class RegisterInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("进入到[注册]拦截器 RegisterInterceptor");
		Object object = ai.getAction();
		if(object != null) {
			HttpServletRequest request = ServletActionContext.getRequest();
			HttpSession session = request.getSession();
			RegisterAction regAction = (RegisterAction)object;
			User user = regAction.getReg();
			String username = user.getUsername();
			String password = user.getPassword();
			String email = user.getEmail();
			String nickname = user.getNickname();
			String phone = user.getPhone();
			String sex = user.getSex();
			
			System.out.println("LoginInterceptor : username " + username);
			System.out.println("LoginInterceptor : password " + password);
			System.out.println("LoginInterceptor : email " + email);
			System.out.println("LoginInterceptor : nickname " + nickname);
			System.out.println("LoginInterceptor : phone " + phone);
			System.out.println("LoginInterceptor : sex " + sex);
			
			if(StringTool.isEmpty(username)) {
				System.out.println("用户名为空");
				session.setAttribute("register", "用户名不能为空！");
				return Action.INPUT;
			}
			if(StringTool.isEmpty(password)) {
				System.out.println("密码为空");
				session.setAttribute("register", "密码不能为空！");
				return Action.INPUT;
			}
			if(StringTool.isEmpty(phone)) {
				System.out.println("手机号为空");
				session.setAttribute("register", "手机号不能为空！");
				return Action.INPUT;
			}
			if(StringTool.isEmpty(sex)) {
				System.out.println("性别为空");
				session.setAttribute("register", "性别不能为空！");
				return Action.INPUT;
			}
		}
		return ai.invoke();
	}
	
}
