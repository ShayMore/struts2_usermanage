<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	// ����·��ʹ�÷���
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	System.out.println("path:"+path);
	System.out.println("basePath:"+basePath);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- ����·��ʹ�÷��� -->
<base href="<%=basePath%>"/>
<!-- ���Լ�д������ -->
<!-- <base href="http://localhost:8080/struts2_usermanage/"/> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>��¼</title>
</head>
<body>
<s:property value="#session.login"/>
<s:form action="login.action" method="post">
	<s:textfield name="username" label="�û���" maxlength="16"/><br/>
	<s:textfield name="password" label="����" minlength="6" maxlength="18"/>
	<s:submit value="��¼"/>&nbsp;<a href="register.jsp">���ע��</a>
</s:form>
<s:debug></s:debug>
</body>
</html>