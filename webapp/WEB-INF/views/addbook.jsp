<%--
  Created by IntelliJ IDEA.
  User: liuqiang
  Date: 2021/3/19
  Time: 8:49 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>      添加新书籍</small>
                </h1>
            </div>
        </div>

    </div>

    <form action="${pageContext.request.contextPath}/book/addbook" method="post">
        <div class="form-group">
            <label for="bkname">书籍名称:</label>
            <input type="text" class="form-control" id="bkname" name="bookName" >
        </div>
        <div class="form-group">
            <label for="bkcounts">书籍数量:</label>
            <input type="text" class="form-control" id="bkcounts" name="bookCounts">
        </div>
        <div class="form-group">
            <label for="detial">书籍简介:</label>
            <input type="text" class="form-control" id="detial" name="detail">
        </div>

        <button type="submit" class="btn btn-default">添加</button>
    </form>

</div>
</body>
</html>
