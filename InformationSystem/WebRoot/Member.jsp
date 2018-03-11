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
    
    <title>My JSP 'Member.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <style>
		li{float: left;list-style: none;margin-left: 75px;margin-right: 100px;}
		a{text-decoration: none;}
		#div1{color:white;
			  height: 34px;
			  background-color: #655d6b;
			  font-size: 30;font-weight: bold;
			  }
		#div2{
			height:90px;
			background:url("image/01.png") no-repeat;
		}
		h1{
			font-size: 60px;
		}		 
  </style>
  </head>
  
  <body>
  	<div>
	  	 <div id="div2" ><h1 align="center">晓薇在线课堂研究机构管理系统</h1></div>
	     <div id="div1">
	     	<ul>
	     		<li><s:form action=""><s:a href="First.jsp">首页</s:a></s:form></li>
	     		<li><s:form action=""><s:a href="Introduction.action">机构简介</s:a></s:form></li>
	     		<li><s:form action=""><s:a href="Member.action">成员组成</s:a></s:form></li>
	     		<li><s:form action=""><s:a href="News.action">新闻公告</s:a></s:form></li>
	     		<li><s:form action=""><s:a href="Achievement.action">成果展示</s:a></s:form></li>
	     		
	     	</ul>
	     </div> 
     </div>
  	<h1 align="center">欢迎了解晓薇在线课堂科研人员</h1>
     <table  border="0" align="center"   cellspacing="0"  class="font1"   ">
    <tr align="center">
	<s:iterator value="#session.memberlist" id="member">
		<td style="font-size: 35px;font-weight: bold;">
			<img src="<s:property value="#member.pic"/>">
			<br>
			<s:property value="#member.name"  />
		</td>
	</s:iterator>
	</tr>
</table>
  </body>
</html>
