<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: EMPEROR
  Date: 2019/8/26
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<center>
    <s:fielderror/>
    <s:form action="register" method="POST">
        <s:textfield label="姓名" name="user.name"></s:textfield>
        <s:textfield label="密码" name="user.password"></s:textfield>
        <s:textfield label="年龄" name="user.age"></s:textfield>
        <s:textfield label="生日" name="user.birthday"></s:textfield>
        <s:submit value="submit"></s:submit>
    </s:form>
</center>


</body>
</html>
