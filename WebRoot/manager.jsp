<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>后台首页</title>

  </head>
  
  <frameset rows="15%,*">
  	<frame src="${pageContext.request.contextPath }/manager/head.jsp" name="head"/>
  	<frameset cols="15%,*">
  		<frame src="${pageContext.request.contextPath }/manager/left.jsp" name="left"/>
  		<frame src="${pageContext.request.contextPath }/manager/right.jsp" name="right"/>
  	</frameset>
  </frameset>
  
</html>
