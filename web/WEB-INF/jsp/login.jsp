<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span8">

        </div>
        <div class="span4">
            <form action="${pageContext.request.contextPath}/user/login" method="post" class="form-horizontal">
                <div class="control-group">
                    <label class="control-label" for="inputUsername">用户名</label>
                    <div class="controls">
                        <input id="inputUsername" type="text" name="username"/>${msg}
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputPassword">密码</label>
                    <div class="controls">
                        <input id="inputPassword" type="password" name="password"/>
                    </div>
                </div>
                <div class="control-group">
                    <div class="controls">
                        <label class="checkbox"><input type="checkbox" />Remember me</label>
                        <button type="submit" class="btn">登录</button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<%--${msg}--%>
<%--<form action="${pageContext.request.contextPath}/user/login" method="post">--%>
<%--    用户名：<input type="text" name="username"/>--%>
<%--    密码：<input type="password" name="password"/>--%>
<%--    <input type="submit" value="登录"/>--%>
<%--    <input type="reset" value="重置"/>--%>
<%--</form>--%>
</body>
</html>
