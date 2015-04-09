<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show Tutorial</title>
</head>
<body>
	<div>Show</div>
	<s:property value="exception" />
	<s:form method="POST" action="tutorial_update" namespace="/">
		
		<s:textfield name="id" label="ID" value="%{id}" />
		<s:textfield name="username" label="Username" value="%{username}" />
		<s:textfield name="lastName" label="Last Name" value="%{lastName}" />
		<s:textfield name="userId" label="User ID" value="%{userId}" />
		<s:textfield name="address" label="Address" value="%{address}" />
		<s:textfield name="add.number" label="Number" value="%{add.number}" />
		
		<s:submit value="Send"/>
	</s:form>
</body>
</html>