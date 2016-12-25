<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册</title>
</head>
<body>
<s:form action="register.action" method="post">
	<s:textfield name="reg.username" label="用户名" maxlength="16"/><br/>
	<s:textfield name="reg.password" label="密码" minlength="6" maxlength="18"/><br/>
	<s:textfield name="password2" label="确认密码" minlength="6" maxlength="18"/><br/>
	<s:textfield name="reg.email" label="邮箱" maxlength="50"/><br/>
	<s:select name="reg.sex" label="性别" key="1" value="男" list="#{'1':'男','0':'女','2':'保密'}" 
					listKey="key" listValue="value"/><br/>
	<s:textfield label="昵称" name="reg.nickname" maxlength="16"/><br/>
	<s:textfield label="手机" name="reg.phone" maxlength="11"/><br/>
	<s:submit value="注册"/>
	<s:actionerror/>
	<s:fielderror/>
</s:form>
</body>
</html>