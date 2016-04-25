
<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form id="form1" action="../user/userinfo/binding1" method="post">
        <input type="text" placeholder="用户名" name="username">
        <input type="password" placeholder="密码" name="password">
        <input type="text" placeholder="用户id" name="UserId">
        <input type="submit" value="提交">
    </form>
    <form id="form2" action="../user/userinfo/binding2" method="post">
        <input type="text" placeholder="用户名" name="UserName">
        <input type="password" placeholder="密码" name="Password">
        <input type="text" placeholder="用户id" name="UserId">
        <input type="submit" value="提交">
    </form>
    <form id="form3" action="../user/getuser" method="post">
        <input type="text" placeholder="用户id" name="id">
        <input type="submit" value="提交">
    </form>
    <a href="../user/getuser">查看所有user</a>
</body>
</html>







