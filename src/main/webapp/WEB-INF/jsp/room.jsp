<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>庆元麻将</title>
    <script type="text/javascript">
        var websocket = null;

        //判断当前浏览器是否支持WebSocket
        if ('WebSocket' in window) {
            websocket = new WebSocket("ws://127.0.0.1:8080/webSocket");
        }
        else {
            alert('no webSocket');
        }

        //连接发生错误的回调方法
        websocket.onerror = function () {
            setMessageInnerHTML("error");
        };

        //连接成功建立的回调方法
        websocket.onopen = function (event) {
            setMessageInnerHTML("open");
        }

        //接收到消息的回调方法
        websocket.onmessage = function (event) {
            if (event.data == "begin") {

            }
        }

        //连接关闭的回调方法
        websocket.onclose = function () {
            setMessageInnerHTML("close");
        }

        //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
        window.onbeforeunload = function () {
            websocket.close();
        }

        //将消息显示在网页上
        function setMessageInnerHTML(innerHTML) {
            document.getElementById('message').innerHTML += innerHTML + '<br/>';
        }

        //关闭连接
        function closeWebSocket() {
            websocket.close();
        }

        //发送消息
        function send() {
            var message = document.getElementById('text').value;
            websocket.send(message);
        }

        function ready() {
            websocket.send("ready");
        }
    </script>
</head>
<body>
<div id="message"></div>
<h3 id="userName">${userName}</h3>
<button onclick="ready()">准备</button>
<script type="text/javascript">
    var userName = document.getElementById("userName").innerText;
    websocket.send("@," + userName);
</script>
</body>
</html>
