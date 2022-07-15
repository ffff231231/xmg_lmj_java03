<%--
  Created by IntelliJ IDEA.
  User: MJ
  Date: 2020/9/4
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="test1">
        <input name="name">
        <input name="age">
        <div>
            足球<input type="checkbox" value="1" name="hobby">
        </div>
        <div>
            篮球<input type="checkbox" value="2" name="hobby">
        </div>
        <div>
            台球<input type="checkbox" value="3" name="hobby">
        </div>
        <button type="submit">提交</button>
    </form>

<div>
    <form action="test2" method="post" enctype="multipart/form-data">
        <input name="username">
        <input name="password">
        <button type="submit">提交</button>
    </form>
</div>

    <div>
        <form action="test3" method="post" enctype="multipart/form-data">
            <input type="text" name="username">
            <input type="file" name="photo">
            <button type="submit">提交</button>
        </form>
    </div>

    <div>
        <form action="test4" method="post" enctype="multipart/form-data">
            <input type="text" name="username">
            <input type="file" name="photos">
            <input type="file" name="photos">
            <button type="submit">提交</button>
        </form>
    </div>

    <div>
        日期处理:
        <form action="test5" method="post">
            <input type="date" name="birthday">
            <button type="submit">提交</button>
        </form>
    </div>
</body>
</html>
