<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: liuqiang
  Date: 2021/3/18
  Time: 4:22 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍展示</title>
<%--    bootsctrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
       <div class="row clearfix">
           <div class="col-md-12 column">
               <div class="page-header">
                   <h1>
                       <small>      显示所有书籍</small>
                   </h1>
               </div>
           </div>
           <div class="row">
               <div class="col-md-4 column">
                   <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toaddbook">insert</a>
                   <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allbook">all</a>
               </div>
               <div class="col-md-8 column">
                   <form  class="form-inline" action="${pageContext.request.contextPath}/book/querybook " method="post"
                          style="float:right">
                       <span style="color: red" ;font-weight:bold>${erro}</span>
                       <input type="text" class="form-control" name="queryBookName" placeholder="请输入查询书籍名称">
                       <input type="submit" class="btn btn-primary" value="query">
                   </form>
               </div>
           </div>
       </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                   <tr>
                       <th>书籍编号</th>
                       <th>书籍名称</th>
                       <th>书籍数量</th>
                       <th>书籍详情</th>
                       <th>操作</th>
                   </tr>
                </thead>
                <tbody>
                    <c:forEach var="book" items="${list}">
                        <tr>
                            <td>${book.bookID}</td>
                            <td>${book.bookName}</td>
                            <td>${book.bookCounts}</td>
                            <td>${book.detail}</td>
                            <td>

                                <a href="${pageContext.request.contextPath}/book/toupdatebook?id=${book.bookID}">修改</a>
                                &nbsp;|&nbsp;
                                <a href="${pageContext.request.contextPath}/book/deletebook/${book.bookID}">删除</a>
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
