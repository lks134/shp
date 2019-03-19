<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="<%=basePath%>css/product.css">  
<title>购物商城</title>
</head>
<body>
	<div id="head1">
		<h1 >购物商城</h1>
	</div>
	>
	
	<div id="my">
	  <ul>
		<li class="acc"><a href="account">我的账户</a></li>
		<li class="or"><a href="order">我的订单</a></li>
		<li class="sh"><a href="shopcar.action">我的购物车</a></li>
		</ul>
	</div>
	
	
	<div id="row">
		
		<div id="select-product">
			<form action="${pageContext.request.contextPath }/selectproduct" method="post">
				<div id="form-group">
					<label for="product_Name">商品名称:</label> 
					<input type="text" class="form-control" id="product_Name" value="${productName }" name="productName">
					<button type="submit" class="btn btn-primary">搜索</button>
				</div>
				</form>
 		 </div>
		<table>
		<div id="show">商品信息列表</div>
			<thead>
				<tr>
					<th>商品id</th>
					<th>商品名称</th>
					<th>商品价格</th>
					<th>商品数量</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${page.rows}" var="row">
					<tr>
						<td>${row.product_id}</td>
						<td>${row.product_name}</td>
						<td>${row.product_price}</td>
						<td>${row.product_count}</td>
						<td>
						<a href="#" onclick="deleteProduct(${row.product_id})">删除</a> 
						</td>
					</tr>				
				</c:forEach>
			</tbody>
		</table>
	</div>
	<!-- jQuery -->
	<script src="<%=basePath%>js/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath%>js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath%>js/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<%=basePath%>js/sb-admin-2.js"></script>
	<script type="text/javascript">
	<%-- function deleteProduct(id) {
			$.ajax({
				type:"post",
				url:"<%=basePath%>deleteProduct.action",
				data:("product_id":id),
				success:function(data){
					alert("删除成功")
					}
				})
		} --%>
		 function deleteProduct(id) {
			if(confirm('确实要删除该客户吗?')) {		
				$.post("<%=basePath%>deleteProduct.action",{"product_id":id},function(data){
					alert("删除成功！");
					window.location.reload();
				});
			} 
		} 
	</script>
	
</body>
</html>