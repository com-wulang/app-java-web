<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/loginValidation" method="post">
    <h3>${userName}</h3>
    用户名：<br>
    <input type="text" name="userName">
    <br><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
