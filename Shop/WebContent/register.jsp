<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:useBean id="userBean" class="com.wxj.action.Register" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页</title>
</head>
<body>
<div>
	<form action="" method="post">
	<div>
		<label for="username">用户名：</label>
		<input type="text" name="username" id="username">
	</div>
	<div>
		<label for="phone">手机号：</label>
		<input type="text" name="phone" id="phone" placeholder="用于找回密码时验证">
	</div>
	<div>
		<label for="pwd">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
		<input type="password" name="password" id="pwd">
	</div>	
	<div>
		<input type="submit" value="提交">
	</div>
	</form>
</div>
</body>
</html>