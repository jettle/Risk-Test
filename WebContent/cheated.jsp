<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>受骗调查</title>
</head>
<%
	Object result = "";
	if(request.getAttribute("result") != null) result = request.getAttribute("result");
	else result = "搜索不到结果!";
%>
<body>
	<center>
		<h1>
			<font color="blue">个人受骗几率检测</font>
		</h1>
		<hr>
		<h3>
			根据数据显示，您受骗的几率为<font color="red"><%=result %></font>
		</h3>
		<p>温馨提示：建议最近一段时间尽量避免跟陌生人交流.
		</p>
	</center>
</body>
</html>