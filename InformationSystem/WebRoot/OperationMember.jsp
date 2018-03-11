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
    
    <title>My JSP 'OperationMember.jsp' starting page</title>
    
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
  <legend>欢迎管理员对成员组成进行增删改查</legend>
  <table align="center">
  		<tr>
  			<td> <s:form action="operationmember"  >
   <table>
   		<tr>
   			<td>
   				<table border="1"  cellspacing=1 class="font1" align="center">
  					<tr>
  						<td colspan="3"><s:textfield name="member.id" label="成员Id" /></td>
  					</tr> 
					<tr>
						<td colspan="3"><s:textfield name="member.name" label="成员名字" /></td>
					</tr>
					<tr>
						<td colspan="3"><s:textfield name="member.pic" label="成员图片" /></td>
					</tr>
					<tr>
						<s:form theme="simple">
							<table>
								<tr>
									<td><s:submit value="成员追加" method="addMember"></s:submit></td>
								<td><s:submit value="成员删除" method="deleteMember"></s:submit></td>
								<td><s:submit value="成员修改" method="updateMember"></s:submit></td>
								</tr>
							</table>
						</s:form>		
					</tr>
				</table>
  			</td>
  			<td>
  				<s:form>
<table   border="1" align="center" width="570" cellspacing="0"  class="font1" style="width: 569px; " >
	<tr >
	 <th>序号</th><th>名字</th><th>图片地址</th>
	</tr>
	<s:iterator value="#session.memberlist" id="member">
	<tr align="center">
	<td><s:property value="#member.id"/></td>
	<td><s:property value="#member.name"/></td>
	<td><s:property value="#member.pic"/></td>	 	
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
