<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
</head>
<body>
<s:property value="#session.login"/>
<s:form action="login.action" method="post">
	<s:textfield name="reg.username" label="用户名" maxlength="16"/><br/>
	<s:textfield name="reg.password" label="密码" minlength="6" maxlength="18"/>
	<s:submit value="登录"/>
</s:form>
</body>
</html>