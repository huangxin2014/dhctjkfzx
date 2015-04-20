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
<script type="text/javascript">
$(function(){
	$("#news_href").click(function(){
		$.post("newsController/show.do",{},function(dataresult){
			if (dataresult.success == "true") {
				
				for ( var i = 0; i < dataresult.data.length; i++) {
					$("#aysn_table").append(
							"<tr><td>"+ dataresult.data.newstitle +"</td></tr>");
				}
			}
		},'json');
		 
	});
	
});
</script>
<style type="text/css">
.all_container {
	background-color: #BBFFEE;
	width: 1040px;
	height: 680px;
	margin: 0 auto;
}

.user_key {
	float: right;/*右浮动*/
}

.blank_div{
	height: 20px;
}

.nav{
	width: 1040px;
	height: 35px;
}

.nav ul {
	width: 990px; /*设置元素宽度为1040px*/
	border: 1px solid #000; /*设置一个颜色为#000，宽度为1px的边框*/
	margin: 0px auto 0px auto; /*也可以简写为margin:0 auto*/
	list-style-type: none;
}

.nav ul li {
	float: left; /*让li元素左浮动*/
}

.nav ul li a {
	width: 108px; /*设置元素宽为80px*/
	height: 28px; /*设置高度为28px*/
	line-height: 28px; /*设置行距为28px，让文字在每行的中间位置*/
	background: red; /*设置元素的背景为红色*/
	color: #FFF; /*文字颜色是白色*/
	margin: 5px 25px;
	font-size: 16px; /*用12号字*/
	display: block;
	/*这个比较关键，因为a本身就是联级元素，本身不具有宽高，用这个把它变成块级元素，这样前面设置的宽和高就能起作用了*/
	text-align: center; /*让文本居中*/
	text-decoration: none; /*去掉下划线*/
}
</style>
</head>
<body>
	<div class="all_container">
		<span class="user_key">你好，${USER.name}&nbsp;&nbsp;</span>
		<div class="blank_div"></div>
		<div class="nav">
			<ul>
				<li><a id="news_href">新闻</a></li>
				<li><a id="attendance_href">签到</a></li>
				<li><a id="duty_href">值日</a></li>
				<li><a id="interaction_href">互动</a></li>
				<li><a id="technology_href">技术</a></li>
				<li><a id="me_href">关于我</a></li>
			</ul>
		</div>
		<div class="aysn_div">
			<table id="aysn_table">
			
			</table>
		</div>
	</div>
</body>
</html>