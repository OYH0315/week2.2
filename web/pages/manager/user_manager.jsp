<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %><!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理</title>
	<%@include file="/pages/common/header.jsp"%>
	<script type="text/javascript">
			$(function () {
$("a.deleteclass").click(function () {
return confirm("你确定要删除【"+$(this).parent().parent().find("td:first").text()+"】");
})
			})

	</script>
</head>
<body>
	
	<div id="header">
			<span class="wel_word">用户管理系统</span>
			<div>
				<a href="index.jsp">返回首页</a>
			</div>
	</div>
	
	<div id="main">
		<table>
			<tr>
				<td>用户名称</td>
				<td>用户id</td>
				<td>用户邮箱</td>
				<td colspan="2">操作</td>
			</tr>		
			<c:forEach items="${requestScope.userlist}" var="down">
				<tr>
					<td>${down.username}</td>
					<td>${down.id}</td>
					<td>${down.email}</td>
					<td><a href="manager/bookservlet?action=getbook&id=${book.id}&metohd=update&pageNo=${requestScope.page.pageNo}">修改</a></td>
					<td><a href="manager/bookservlet?action=delete&id=${book.id}&pageNo=${requestScope.page.pageNo}" class="deleteclass">删除</a></td>
				</tr>

			</c:forEach>

			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="pages/manager/book_edit.jsp?metohd=add&pageNo=${requestScope.page.pageTotal}">添加用户</a></td>
			</tr>	
		</table>

	</div>
	
	<div id="bottom">
		<span>
			李智恩下载器.Copyright &copy;2015
		</span>
	</div>
</body>
</html>