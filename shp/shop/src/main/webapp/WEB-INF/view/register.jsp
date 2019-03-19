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
 <!-- <script type="text/javascript" src="js/jquery.js"></script>  -->

 <link rel="stylesheet" href="<%=basePath%>css/register.css">  
 
</head>
<body>
	
	<center>
	<div id="regist">
	<form action="register" method="post">
					<div class="reg_title">填写你注册的信息</div>
					<div class="row1">
						<label>用户名:</label>&nbsp; <input type="text" name="userName" >
					</div>
					<div class="row2">
						<label>密&nbsp;&nbsp;&nbsp;码:</label>&nbsp; <input type="password"
							name="password">
					</div>
					<div class="row3">
						<label>地&nbsp;&nbsp;&nbsp;址:</label>&nbsp; <input type="text"
							name="address">
					</div>
					<div class="row4">
						<label>邮&nbsp;&nbsp;&nbsp;箱:</label>&nbsp;<input type="text"
							name="email">
					</div>
					<div class="row5">
						<label>电话号码:</label>&nbsp;<input type="text"
							name="phone">
					</div>
					<div class="row6">
						<input type="submit" value="注册">
					</div>
				</form>
				</div>
				</center>
			
	<!-- <table cellspacing=1 cellpadding=3 align=center class=tableBorder2>
	<tr>
	<form action="register"method="post">
		用户名:<input  type="text" name="userName"><br>
		 密码:  <input type="password" name="password"><br>
		 地址:  <input type="text" name="address"><br>
		 邮箱:  <input type="text" name="email"><br>
	     电话号码: <input type="text" name="phone"><br>
		<input type="submit" value="确定" style="color:#BC8F8F"> <br> 
	</form>
	</table> -->

</body>
<!-- <script type="text/javascript">
	$("#username").blur(function){
			$.ajax({
				type:"post",
				url:"register",
				data:$("#l").serialize(),
				success:function(msg){
					if(msg=="ok"){
						window.loction.href="login.jsp"
						}else{
							alert("该用户已存在")
							}
					}
				})
		}
</script> -->
</html>