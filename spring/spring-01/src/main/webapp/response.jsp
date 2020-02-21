<%--
  Created by IntelliJ IDEA.
  User: xzz
  Date: 2019/10/19
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--引入js--%>
    <script src="js/jquery.min.js"></script>
    <script>
        /*页面加载，绑定单击事件*/
        $(function(){
            $(function(){
                $("#btn").click(function(){
                    // alert("hello btn");
                    // 发送ajax请求
                    $.ajax({
                        // 编写json格式，设置属性和值
                        url:"users/testAjax",
                        contentType:"application/json;charset=UTF-8",
                        data:'{"username":"hehe","password":"123","age":30}',
                        dataType:"json",
                        type:"post",
                        success:function(data){
                            // data服务器端响应的json的数据，进行解析
                            alert(data);
                            alert(data.username);
                            alert(data.password);
                            alert(data.age);
                        }
                    });

                });
            });
        });
    </script>
</head>
<body>


<%--ajax异步请求--%>
<button id="btn" value="点击，异步ajax请求">点击，异步ajax请求</button>
</body>
</html>
