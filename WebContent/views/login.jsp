<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	// 绝对路径使用方法
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	System.out.println("path:"+path);
	System.out.println("basePath:"+basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- 绝对路径使用方法 -->
<base href="<%=basePath%>"/>
<!-- 用自己写的链接 -->
<!-- <base href="http://localhost:8080/struts2_usermanage/"/> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录</title>
</head>
<body>
<s:property value="#session.login"/>
<s:form action="login.action" method="post">
	<s:textfield name="username" label="用户名" maxlength="16"/><br/>
	<s:textfield name="password" label="密码" minlength="6" maxlength="18"/>
	<s:submit value="登录"/>&nbsp;<a href="register.jsp">点击注册</a>
</s:form>
</body>
</html>