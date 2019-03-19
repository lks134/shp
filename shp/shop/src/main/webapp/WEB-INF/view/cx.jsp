<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html lang="en">
<head>
<meta charset="utf-8">

<title>查询商品</title>


</head>
<body>
	<div class="container">
		<div id="inner-hd">
		</div>



		<form action="findProductByName" method="post">



			<div id="inner-bd">
				<label>商品名称:</label>&nbsp;<input type="text" name="product_name" />
				<input type="submit" value="查询">

			</div>
		</form>

	</div>

	<div class="container">

		<div id="inner-bd">

			<div class="tab-wraper">
				<ul class="tab">
					<li class="current">详细信息</li>
					
				</ul>
			</div>


			<table class="grid">
				<thead>
					<tr>
						<th>商品ID</th>
						<th>商品名称</th>
						<th>商品价格</th>
						<th>商品数量</th>
					</tr>

				</thead>

				<tbody>
					<c:forEach items="${list}" var="product">
						<tr align="center">


							<td>${product.product_id}</td>
							<td>${product.product_name}</td>
							<td>${product.product_price}</td>
							<td>${product.product_count}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>

		</div>

		<div id="inner-ft"></div>
	</div>




	
</body>
</html>

