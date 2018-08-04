<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>点菜宝贝，后台管理系统</title>
    <meta name="keywords" content="点菜宝贝，后台管理系统">
    <meta name="description" content="点菜宝贝，后台管理系统">
    <link rel="stylesheet" href="js/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/frame.css">
    <link rel="stylesheet" href="css/base.css">
    <link rel="stylesheet" href="css/merchant.css">
    <link rel="stylesheet" href="css/addClass.css">
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
    <a href="login.jsp"><img class="login-logo" src="img/logo.png"></a>
    <a class="login-change" href="login.jsp">PC客户端 <span>&nbsp; | &nbsp;</span> 手机客户端</a>
    <div class="login-title default"></div>
   <div class="login-name">管理员登录</div>
    <div class="login-form-area">
         <br>
         <br>
        <form action="<%=basePath %>login.sw" method="post">
        <div class="login-input">
   
            <label for="">账&nbsp;&nbsp;&nbsp;号：</label>
            <input class="ob-form login-form-user" name="users"   type="text">
        </div>
        <br>
        <br>
        <br>
        <div class="login-input">
            <label for="">密&nbsp;&nbsp;&nbsp;码：</label>
            <input class="ob-form login-form-user" name ="pwd" type="password">
        </div>
      
        <input type="submit" class="btn order-food-menu-btn login-btn " value="登录" >
     
        
        </form>

    </div>
    <div class="login-footer clearfix">Copyright © 2018 德邦物流 Debang.com  All Rights Reserved. <img class="ybs" style="cursor: pointer;" src="img/login_jj.jpg" width="57" height="42" alt=""></div>
</body>
<script src="plugin/jquery/jquery.js"></script>
<script>
    $('.login-register').click(function () {
        var _this = $(this);
        $(this).addClass('active');
        setTimeout(function () {
            _this.removeClass('active');
        },100);
    });
    $(".login-btn").click(function(event) {
        /* Act on the event */
        location.href="index.jsp";
    });
     $(".ybs").click(function(event) {
        /* Act on the event */
        location.href="login.jsp";
    });
</script>
</html>
