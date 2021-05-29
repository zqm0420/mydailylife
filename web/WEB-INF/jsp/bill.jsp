<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <div class="page-header">
                    <h1>
                        <small>账单列表 —————— 显示所有账单</small>
                    </h1>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-md-4 column">
                <a class="btn btn-primary" href="${pageContext.request.contextPath}/bill/toAddBill">新增账单</a>
            </div>
        </div>

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
                        <c:forEach var="bill" items="${bills}">
                            <tr>
                                <td>${bill.id}</td>
                                <td>${bill.payDate}</td>
                                <td>${bill.sc.name}</td>
                                <td>${bill.money}</td>
                                <td>${bill.detail}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/bill/toUpdate?id=${bill.id}">修改</a>
                                    &nbsp; | &nbsp;
                                    <a href="${pageContext.request.contextPath}/bill/deleteBill?id=${bill.id}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
