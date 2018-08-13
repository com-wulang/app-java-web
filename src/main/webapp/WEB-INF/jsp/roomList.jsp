<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/createRoom" method="post">
    <h3>${userName}</h3>
    房间名称：<br>
    <input type="text" name="roomName">
    <input hidden type="text" name="userName" value="${userName}">
    <br><br>
    <input type="submit" value="创建房间">
</form>

<c:forEach var="item" items="${roomList}">
        <form action="/joinRoom" method="post">
            <input hidden type="text" name="roomName" value="${item}">
            <input hidden type="text" name="userName" value="${userName}">
            ${item}<input type="submit" value="加入房间">
        </form>
</c:forEach>

</body>
</html>
