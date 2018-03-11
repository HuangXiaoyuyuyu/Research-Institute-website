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
    
    <title>My JSP 'OperationNews.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	 <meta content=”text/html;charset=utf-8″ />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		body{ background: url("image/15.jpg"); }
	</style>
  </head>
  
  <body>
   <form>
  <fieldset>
  <legend>欢迎管理员对新闻进行增删改查</legend>
  <table align="center">
  		<tr>
  			<td> <s:form action="operation"  >
   <table>
   		<tr>
   			<td>
   				<table border="1"  cellspacing=1 class="font1" align="center">
  					<tr>
  						<td colspan="3"><s:textfield name="news.id" label="新闻Id" /></td>
  					</tr> 
					<tr>
						<td colspan="3"><s:textfield name="news.title" label="新闻标题" /></td>
					</tr>
					<tr>
						<td colspan="3"><s:textfield name="news.content" label="新闻内容" /></td>
					</tr>
					<tr>
						<td colspan="3"><s:textfield name="news.time" label="发布时间"></s:textfield></td>
					</tr>
					<tr>
						<s:form theme="simple">
							<table>
								<tr>
									<td><s:submit value="新闻追加" method="addNews"></s:submit></td>
								<td><s:submit value="新闻删除" method="deleteNews"></s:submit></td>
								<td><s:submit value="新闻修改" method="updateNews"></s:submit></td>
								</tr>
							</table>
						</s:form>		
					</tr>
				</table>
  			</td>
  			<td>
  				<s:form>
<table   border="1" align="center" width="570" cellspacing="0"  class="font1" style="width: 700px; " >
	<tr >
	 <th>序号</th><th>标题</th><th>内容</th><th>时间 </th>
	</tr>
	<s:iterator value="#session.newslist" id="news">
	<tr align="center">
	<td><s:property value="#news.id"/></td>
	<td><s:property value="#news.title"/></td>
	<td><textarea rows="" cols="32" ><s:property value="#news.content"/></textarea></td>
	<td><s:property value="#news.time"/></td>		 	
	</tr>
	</s:iterator>
</table>
</s:form> 
  			</td>
   		</tr>
   </table>
</s:form></td>
  			 
  		</tr>		
  </table>
  </fieldset>
  </form>
  <h2 align="center"><a href="Managment.jsp">点击回到管理首页</a></h2>
  </body>
</html>
