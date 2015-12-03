<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=path %>/muserController/updateUser.do" method="POST">
			<input type="hidden" name="id" value="${user.id }">
			<table>
				<tr>
					<td>
						name: 
					</td>
					<td>
						<input type="text" name="name" value="${user.name }">
					</td>
				</tr>
				<tr>
					<td>
						age:
					</td>
					<td>
						<input type="text" name="age" value="${user.age }">
					</td>
				</tr>
				<tr>
					<td>
						address:
					</td>
					<td>
						<input type="text" name="address" value="${user.address }">
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Update">
					</td>
					<td>
						<input type="reset" value="Reset">
					</td>
				</tr>
			</table>
		</form>
</body>
</html>