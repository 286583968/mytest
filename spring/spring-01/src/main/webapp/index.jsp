<%--
  Created by IntelliJ IDEA.
  User: xzz
  Date: 2019/10/14
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <%--<h1><a href="hello">点我</a></h1>

    <h1><a href="user/requestMapping?username=hehe">开始跳转</a></h1>--%>


    <h1><a href="user/requestMapping?username=hehe&password=123">开始跳转</a></h1>


    <%--<form action="user/saveAccount" method="post">
        账户名:<input type="text" name="name"/><br>
        密码:<input type="text" name="password"/><br>
        账户金额:<input type="text" name="money"/><br>

        用户名:<input type="text" name="list[0].username"/><br>
        用户年纪:<input type="text" name="list[0].age"/><br>

        用户名:<input type="text" name="map['one'].username"/><br>
        用户年纪:<input type="text" name="map['one'].age"/><br>
        <input type="submit" value="提交"/>
    </form>--%>


    <form action="user/saveUser" method="post">
        用户名:<input type="text" name="username"/><br>
        年纪:<input type="text" name="age"/><br>
        生日:<input type="text" name="birthday"/><br>

        <input type="submit" value="提交"/>
    </form>


</body>
</html>
