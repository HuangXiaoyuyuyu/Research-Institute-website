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
    
    <title>My JSP 'OperationIntroduction.jsp' starting page</title>
    
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
  <legend>欢迎管理员对机构简介进行增删改查</legend>
  <table align="center">
  		<tr>
  			<td> <s:form action="operationintroduction"  >
   <table>
   		<tr>
   			<td>
   				<table border="1"  cellspacing=1 class="font1" align="center">
  					<tr>
  						<td colspan="3"><s:textfield name="introduction.id" label="简介Id" /></td>
  					</tr> 
					<tr>
						<td colspan="3"><s:textfield name="introduction.content" label="简介内容" /></td>
					</tr>
					<tr>
						<s:form theme="simple">
							<table>
								<tr>
									<td><s:submit value="简介追加" method="addIntroduction"></s:submit></td>
								<td><s:submit value="简介删除" method="deleteIntroduction"></s:submit></td>
								<td><s:submit value="简介修改" method="updateIntroduction"></s:submit></td>
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
	 <th>序号</th><th>简介内容</th>
	</tr>
	<s:iterator value="#session.introductionsession" id="introduction">
	<tr align="center">
	<td><s:property value="#introduction.id"/></td>
	<td><textarea rows="" cols="30" ><s:property value="#introduction.content"/></textarea></td> 		 	
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
