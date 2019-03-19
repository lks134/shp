<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="<%=basePath%>css/login.css">  
<title>Insert title here</title>
</head>
<body>
	<center>
	<div id="loginn">
	<h1 id="log">登录</h1>
	<form action="login" method="post">
		<div id="name">
			<label>用户名:</label>&nbsp;<input type="text" name="userName">
		</div>
		<div id="pass">
			<label>密&nbsp;&nbsp;&nbsp;码:</label>&nbsp;<input type="password" name="password">
		</div>
		<div id="que">
			<input type="submit" value="登录">
		</div> 
	</form>
	 没有注册？点击<a href="register"><strong>注册<strong></strong></a>
	</div>
</center>
</body>
</html>