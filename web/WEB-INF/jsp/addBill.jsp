<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: zqm
  Date: 2021/5/27
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加账单</title>
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>新增账单</small>
                    </h1>
                </div>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/bill/addBill" method="post">
            <div class="form-group">
                <label>分类</label>
                <select class="form-control" name="sc.name">
                    <c:forEach var="category" items="${allCategory}">
                        <option value="${category}">${category}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="form-group">
                <label>金额</label>
                <input type="text" class="form-control" name="money" required>
            </div>
<%--            <div class="form-group">--%>
<%--                <label>日期</label>--%>
<%--                <input type="email" class="form-control">--%>
<%--            </div>--%>
            <div class="form-group">
                <label>备注</label>
                <input type="text" class="form-control" name="detail" required>
            </div>
            <button type="submit" class="btn btn-default">修改</button>
        </form>
    </div>
</body>
</html>
