<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <jsp:include page="head.jsp"></jsp:include> --%>
	<form action="addAccount" method="post">
		<div id=name>
			<label>用户名&nbsp;:</label>&nbsp;<input type="text" name="userName">
		</div>
		<div id="account">
			<label>银行卡号:</label>&nbsp;<input type="text" name="account_name">
		</div>
		<div id="account1">
			<label>支付密码:</label>&nbsp;<input type="account_password" name="account_password">
		</div>
		<div id="add">
			<input type="submit" value="添加">
		</div>
		
			
		
	</form>
	<form action="selectAccount" method="post">
		<label>用户名</label>&nbsp;<input type="text" name="userName">
		<input type="submit" value="查询">
		<div class="selectAll">
			<table>
				<thead>
					<th>id</th>
					<th>用户名</th>
					<th>银行卡号</th>
					<th>余额</th>
				</thead>
				<tbody>
					<tr>
						<td>${account_id}</td>
						<td>${userName}</td>
						<td>${account_name}</td>
						<td>${account_balance}</td>
						<td><a href="#" onclick="deleteaccount(${row.cust_id})">删除</a>
							<a href="#"  data-toggle="modal" data-target="#customerEditDialog" onclick="editAccount(${row.cust_id})">修改</a>
						</td>
						
					</tr>
				</tbody>
			</table>
		</div>
		<div id="customerEditDialog">
			<button type="button"  data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
			</button>
			<label for="edit_account_balance" >余额</label>
		</div>
		<div class="modal-footer">
			<button type="button"  data-dismiss="modal">关闭</button>
			<button type="button"  onclick="updateAccount()">保存修改</button>
		</div>
		
	</form>
</body>
<script type="text/javascript">
function editAccount(id) {
	$.ajax({
		type:"get",
		url:"<%=basePath%>account/edit.action",
		data:{"id":id},
		success:function(data) {  
			$("#account_id").val(data.account_id);
			$("#account_balance").val(data.account_balance);
			
		}
	});
}
function updateAccount() {
	$.post("<%=basePath%>account/update.action",$("#edit_account_form").serialize(),function(data){
		alert("余额更新成功");
		window.location.reload();
	});
}

function deleteAccount(id) {
	if(confirm('确实要删除该账号吗?')) {
		$.post("<%=basePath%>account/delete.action",{"id":id},function(data){
			alert("账号删除更新成功！");
			window.location.reload();
		});
	}
}
</script>
</html>