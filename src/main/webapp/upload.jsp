<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>文件上传页面</title>
</head>
<body>
<s:fielderror/>
<form action="uploadfile" method="post" enctype="multipart/form-data">
    文件标题：<input type="text" name="title"/><br/>
    选择文件：<input type="file" name="upload"/><br/>
    <input value="上传" type="submit"/>
</form>
</body>
</html>
