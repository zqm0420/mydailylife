<%--
  Created by IntelliJ IDEA.
  User: zqm
  Date: 2021/5/27
  Time: 9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>账单页</title>
    <%--  BootStrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">

        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>编号</th>
                            <th>日期</th>
                            <th>分类</th>
                            <th>金额</th>
                            <th>备注</th>
                        </tr>
                    </thead>
                    <%--书籍从数据库中查出来，从这个list中遍历出来：foreach--%>
                    <tbody>

                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
