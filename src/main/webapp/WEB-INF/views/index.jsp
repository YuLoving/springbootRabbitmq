<!DOCTYPE html>
<!-- thymeleaf 提示功能 -->
<html xmlns:th="http://www.thymeleaf.org">

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page contentType="text/html;charset=utf-8"%>

<head lang="en">
    <meta charset="UTF-8"></meta>
    <title>hello</title>
    <!-- 引入BootStrap -->
    <link rel="stylesheet" href="../bootstrap3/css/bootstrap-theme.min.css" />
    <link rel="stylesheet" href="../bootstrap3/css/bootstrap.min.css" />
    <script type="text/javascript" src="../bootstrap3/js/jquery-1.11.2.min.js"></script>
    <script type="text/javascript" src="../bootstrap3/js/bootstrap.min.js"></script>
</head>
<style type="text/css">
    body {
        padding: 10px
    }
</style>
<body>
<!-- 提示 -->
<h3 th:text="${info}"></h3>
<div>
    <!-- 后面添加参数起到清除缓存作用 -->
    <img alt="验证码" onclick="this.src='/defaultKaptcha?d='+new Date()*1" src="/defaultKaptcha" />
</div>
<form action="imgvrifyControllerDefaultKaptcha" >
    <input type="text" name="tryCode" />
    <input type="submit" value="提交" class="btn btn-success"></input>
</form>
</body>
</html>
