<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主界面</title>
</head>
<body>
<h3>
    当前用户：${sessionScope.USER_SESSION.username}
    <a href="${pageContext.request.contextPath}/bill/queryAll">查看所有账单</a>
</h3>
</body>
</html>
