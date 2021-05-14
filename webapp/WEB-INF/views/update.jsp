<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liuqiang
  Date: 2021/3/19
  Time: 9:27 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>      修改书籍信息</small>
                </h1>
            </div>
        </div>

    </div>

    <form action="${pageContext.request.contextPath}/book/updatebook" method="post">
        <input type="hidden" name="bookID" value="${books.bookID}">
        <div class="form-group">
            <label for="bkname">书籍名称:</label>
            <input type="text" class="form-control" id="bkname" name="bookName" value="${books.bookName}" required>
        </div>
        <div class="form-group">
            <label for="bkcounts">书籍数量:</label>
            <input type="text" class="form-control" id="bkcounts" name="bookCounts" value="${books.bookCounts}" required>
        </div>
        <div class="form-group">
            <label for="detial">书籍简介:</label>
            <input type="text" class="form-control" id="detial" name="detail" value="${books.detail}" required>
        </div>

        <button type="submit" class="btn btn-default">修改</button>
    </form>

</div>
</body>
</html>
