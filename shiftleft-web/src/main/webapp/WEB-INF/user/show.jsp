<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

		<s:textfield key="id" id="id" label="ID" />
		<s:textfield key="username" id="username" label="Username" />
		<s:textfield key="lastName" id="lastname" label="Last name" />
		<s:textfield key="userId" id="userid" label="User ID" />
		<s:textfield key="address" id="address" label="Address" />
		<s:textfield key="add.number" id="add_number" label="Address Number" />

		<s:submit value="Send" />
	</s:form>
</body>
</html>