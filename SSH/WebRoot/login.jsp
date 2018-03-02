<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
  <title>login.jsp</title>
  </head>

  <body>
    <s:form action="loginAction" method="post" theme="simple">
        用户名：<s:textfield name="account"/><br>
        密码：<s:password name="password"/><br>
        <s:submit value="登录"/><s:reset value="重置"/>
    </s:form>
  </body>
</html>