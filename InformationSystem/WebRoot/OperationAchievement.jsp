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
    
    <title>My JSP 'OperationAchievement.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
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
  <legend>欢迎管理员对科研成果进行增删改查</legend>
  <table align="center">
  		<tr>
  			<td> <s:form action="operationAchievement"  >
   <table>
   		<tr>
   			<td>
   				<table border="1"  cellspacing=1 class="font1" align="center">
  					<tr>
  						<td colspan="3"><s:textfield name="achievement.id" label="成果Id" /></td>
  					</tr> 
					<tr>
						<td colspan="3"><s:textfield name="achievement.title" label="成果标题" /></td>
					</tr>
					<tr>
						<td colspan="3"><s:textfield name="achievement.content" label="成果内容" /></td>
					</tr>
					<tr>
						<td colspan="3"><s:textfield name="achievement.time" label="发布时间"></s:textfield></td>
					</tr>
					<tr>
						<s:form theme="simple">
							<table>
								<tr>
									<td><s:submit value="成果追加" method="addAchievement"></s:submit></td>
								<td><s:submit value="成果删除" method="deleteAchievement"></s:submit></td>
								<td><s:submit value="成果修改" method="updateAchievement"></s:submit></td>
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
	<s:iterator value="#session.list" id="achievement">
	<tr align="center">
	<td><s:property value="#achievement.id"/></td>
	<td><s:property value="#achievement.title"/></td>
	<td><textarea rows="" cols="34" ><s:property value="#achievement.content"/></textarea></td>
	<td><s:property value="#achievement.time"/></td>		 	
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
