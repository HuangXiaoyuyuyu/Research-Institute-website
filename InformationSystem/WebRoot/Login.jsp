<%@ page language="java" import="java.util.*,org.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style type="text/css">
  		body{ 
  			height:1080px;
  			background: url("image/13.jpg") no-repeat; 
  		}
  		#div1{
  			padding-top: 150px;
  		}
  		h1{ font-size: 60px; }
  </style>
  </head>
  
  <body>
  			<div id="div1">
  			<h1 align="center">欢迎登录晓薇在线课堂科研网站</h1>	
  			<s:form action="First">
  			<table align="center"> 			 		 
  				<tr>
  					<s:textfield label="姓名" name="login.name" cssStyle="width:200px;height:30px;font-size:30px;" />
  				</tr>
  				<tr>
  					<s:password label="密码" name="login.password" cssStyle="width:200px;height:30px;font-size:30px;" />
  				</tr>
  				<tr>
  					<td align="center">
  						<s:submit value="提交"  style="  width: 80px;
    height: 30px;
    font-size: 18px;
    font-family: 微软雅黑;
    letter-spacing: 8px;
    padding-left: 12px;
    border-radius: 5px;"/>
    </td>
  				</tr>
  			</table>    
     </s:form>
     </div>
  </body>
</html>
