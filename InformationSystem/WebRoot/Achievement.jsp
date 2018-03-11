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
    
    <title>My JSP 'Achievement.jsp' starting page</title>
    
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
		#div3{ 
		   height: 720px;
		   background:url("image/12.jpg") no-repeat  ;
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
  	 <div id="div3" >
  	 	 <table  border="1" align="center" width="570" cellspacing="0"  class="font1" style="width: 569px; ">
    <tr>
    	<th colspan="3" align="center">欢迎浏览苏州科技大学科研成果</th>
    </tr>
     
	<tr align="center">
	 <th>序号</th><th>title</th><th>查看具体成果</th> 
	</tr>
	<s:iterator value="#session.list" id="achievement">
	<tr align="center">
	<td><s:property value="#achievement.id"/></td>
	<td><s:property value="#achievement.title"/></td> 
	<td>
		<s:form  action="AchievementResult.action">
		<input type="hidden" name="achievement.id" value="<s:property value="#achievement.id"/>"/>
			<td><s:submit value="查看"  style="  width: 80px;
    height: 30px;
    font-size: 18px;
    font-family: 微软雅黑;
    letter-spacing: 8px;
    padding-left: 12px;
    border-radius: 5px;"/></td>
		</s:form>
	</td>
	</tr>
	</s:iterator>
</table>
  	 </div>
  </body>
</html>
