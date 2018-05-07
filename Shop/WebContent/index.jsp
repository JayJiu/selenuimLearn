<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>首页</title>
<link rel="stylesheet" type="text/css" href="css/index.css" />
</head>


<!--  头部操作栏 -->
<div id="top"> 
	<div class="left">
		<ul>
				<li><a href="login.jsp" >登录</a></li>
				<li><a href="register.jsp" >注册</a></li>
		</ul>
	</div>
	<div class="right">
			<ul>
				<li><a href="shoppingCart.jsp" >购物车</a></li>
				<li><a href="collector.jsp" >收藏夹</a></li>
			</ul>
		
	</div>
</div>

<!-- 搜索区 -->
<div id="search" >
<form action="test_action.jsp" method="post" >

	<div class="search_bar"  style="">		
		<input type="text" name="search_name"/>
	</div>
	
	<div class="search_button">
		<input type="submit" value="搜索">
	</div>

	<!--  
	 <div class="search_bar">		
		<input type="text" name="search_name"/>
		<input type="submit" value="搜索">
	</div>
	-->
</form>
</div>


	

<body>

</body>
</html>