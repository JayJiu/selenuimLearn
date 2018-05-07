<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页</title>
<link rel="stylesheet"  href="css/login.css"/>
</head>
<body>
<div class="enter_bar" >
	<form action="" method="post">
		<div>
			<label for="user">用户名：</label>
			<input type="text" name="username" id="user" placeholder="请输入用户名">
		</div>
		<div>
			<label for="pwd">密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
			<input type="password" name="pwwd" id="pwd" placeholder="请输入密码">
		</div>
		<div>
			<input type="submit" value="登录" >
		</div>
		
		<div class="r_f">
			<a href="register.jsp" >注册</a>
			<a href="find_password.jsp" >忘记密码</a>
		</div>
	</form>
</div>

</body>
</html>