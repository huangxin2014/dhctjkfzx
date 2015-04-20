<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
<script type="text/javascript"
	src="<%=basePath%>js/jquery/jquery-1.8.3.min.js"></script>
<style type="text/css">
.all_container {
	background: url("<%=basePath%>img/login/dhc_login_0.png");
	width: 840px;/*宽840像素*/
	height: 525px;/*高525像素*/
	margin: 0 auto;/*居中*/
	position: relative; /*相对定位*/
}

.login_button {
	background: url("<%=basePath%>img/login/dhc_login_1.png") no-repeat;
	width: 210px;
	height: 29px;
	margin: 0 auto;
	Position: absolute;/*绝对定位*/
	top: 310px;
	right: 315px;
	cursor: pointer;/*手指图标*/
}

.login_email {
	Position: absolute;
	width: 168px;
	height: 31px;
	top: 204px;/*距离顶部*/
	right: 310px;/*距离右边*/
}

.login_password {
	Position: absolute;
	width: 168px;
	height: 31px;
	top: 257px;
	right: 310px;
}

.login_errorinfo {
	Position: absolute;
	width: 168px;
	height: 31px;
	top: 180px;
	right: 335px;
	text-align: center;/*居中*/
	color:red;/*字体颜色*/
	font-size: 12px;
}
</style>
<script type="text/javascript">
	$(function(){
		$("#btnId").click(function(){
		//	alert(1);
		});
	});
</script>
</head>
<body>
	<a href="<%=basePath%>userController/1/showUser.do">测试</a>
	<div class="all_container">
		<form action="<%=basePath%>userController/login.do" method="post">
			<span class="login_errorinfo">${errorinfo}</span>
			<input name="email" class="login_email" type="text"> 
			<input name="password" class="login_password" type="password">
			<input type="submit" class="login_button" id="btnId" value="">
		</form>
	</div>
</body>
</html>