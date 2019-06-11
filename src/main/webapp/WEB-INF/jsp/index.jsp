<%--
  Created by IntelliJ IDEA.
  User: 苏航
  Date: 2019/6/6
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>

<button><a href="/add">新增</a></button>
<table border="1px">
    <tr>
        <td>标识</td>
        <td>名称</td>
        <td>密码</td>
        <td>操作</td>
    </tr>
<c:forEach items="${users}" var="item">
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.password}</td>
        <td><a href="/modify?name=${item.name}">修改</a>
        <a href="#" onclick="deleteData('${item.name}')">删除</a>
        </td>
    </tr>
</c:forEach>
</table>

<script>
        function deleteData(name) {
            $.ajax({
                url: "/user/delete",
                data:{"name":name},
                success:function (data) {
                    if (data.delete===1){
                        window.location.href="/"
                    }
                }
            })
        }


</script>
</body>

</html>
