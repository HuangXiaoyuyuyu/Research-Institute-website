<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Managment.jsp' starting page</title>
    
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
			padding-top: 100px;
		}
		h1{ font-size: 50px; } 
	</style>
  </head>
  
  <body>
  	<div id="div1">
    <table align="center">
  	<h1 align="center">欢迎管理员对晓薇在线课堂在线科研进行定期更新和维护</h1>
  	<tr>
  			<td>
  				 <s:form action="Introduction1" ><s:submit value="机构简介管理" style="  width: 260px;
    height: 180px;
    font-size: 30px;
    font-family: 微软雅黑;
    letter-spacing: 8px;
    padding-left: 12px;
    border-radius: 5px;"></s:submit></s:form>
  			</td>
  			<td>
  				 <s:form action="Member1" ><s:submit value="成员组成管理" style="  width:220 px;
    height: 180px;
    font-size: 30px;
    font-family: 微软雅黑;
    letter-spacing: 8px;
    padding-left: 12px;
    border-radius: 5px;"></s:submit></s:form>
  			</td>
  			<td>
  				 <s:form action="News1" ><s:submit value="新闻发布管理" style="  width: 260px;
    height: 180px;
    font-size: 30px;
    font-family: 微软雅黑;
    letter-spacing: 8px;
    padding-left: 12px;
    border-radius: 5px;"></s:submit></s:form>
  			</td>
  			<td>
  				 <s:form action="Achievement1" ><s:submit value="成果展示管理" style="  width:220 px;
    height: 180px;
    font-size: 30px;
    font-family: 微软雅黑;
    letter-spacing: 8px;
    padding-left: 12px;
    border-radius: 5px;"></s:submit></s:form>
  			</td>
  			<td>
  				 <s:form action="First.jsp" ><s:submit value="前台查看" style="  width: 260px;
    height: 180px;
    font-size: 30px;
    font-family: 微软雅黑;
    letter-spacing: 8px;
    padding-left: 12px;
    border-radius: 5px;"></s:submit></s:form>
  			</td>
  		</tr>
  	</table>
  	</div>
  </body>
</html>
