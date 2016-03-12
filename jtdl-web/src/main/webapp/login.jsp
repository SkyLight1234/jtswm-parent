<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width,height=device-height,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="description" content="家庭事务管理"/>
    <meta name="keywords" content=""/>
    <meta name="author" content="zhushiping"/>
    <title>家庭事务管理-login</title>
    <link href="home/css/bootstrap.css" rel="stylesheet">
    <link href="home/css/font-awesome.css" rel="stylesheet">
    <link href="home/css/style.min.css" rel="stylesheet">
    <link href="home/css/myanimate.css" rel="stylesheet">
    <!--<link href="home/css/animate.css" rel="stylesheet">-->
    <style>
        .password{
            display: none;
        }
        @keyframes myanimate
        {
            from {left: 0px;}
            to {left: 100%;}
        }
        .header::before {
            content: "";
            position: absolute;
            width: 50px;
            height: 55px;
            top: 110px;
            left:0px;
            animation: myanimate 5s infinite;
            overflow: hidden;
            background: -moz-linear-gradient(left,rgba(230,232,234,0)0,rgba(230,232,234,.3)50%,rgba(230,232,234,0)100%);
            background: -webkit-gradient(linear,left top,right top,color-stop(0%,rgba(230,232,234,0)),color-stop(50%,rgba(230,232,234,.3)),color-stop(100%,rgba(230,232,234,0)));
            background: -webkit-linear-gradient(left,rgba(230,232,234,0)0,rgba(230,232,234,.3)50%,rgba(230,232,234,0)100%);
            background: -o-linear-gradient(left,rgba(230,232,234,0)0,rgba(230,232,234,.3)50%,rgba(230,232,234,0)100%);
            -webkit-transform: skewX(-25deg);
            -moz-transform: skewX(-25deg);
        }
    </style>
</head>
<body>
<div class="container-fluid content">
    <div class="row">
        <div id="content" class="col-sm-12 full">
            <div class="row">
                <div  class="login-box" style="display: none">

                    <div class="header">
                        登陆
                    </div>
                    <div class="text-center">
                        <li><a href="" class="fa fa-qq qq-bg"></a></li>
                        <li><a href="" class="fa fa-weixin weixin-bg"></a></li>
                        <li><a href="" class="fa fa-weibo weibo-bg"></a></li>
                    </div>

                    <div class="text-with-hr">
                        <span>or</span>
                    </div>

                    <form class="form-horizontal login" action="index.html" method="post">

                        <fieldset class="col-sm-12">
                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="text" class="form-control" id="username"
                                               placeholder="输入账号"/>
                                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                    </div>
                                </div>
                            </div>

                            <div class="form-group">
                                <div class="controls row">
                                    <div class="input-group col-sm-12">
                                        <input type="password" class="form-control" id="password"
                                               placeholder="输入密码"/>
                                        <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                    </div>
                                </div>
                            </div>

                            <div class="confirm">
                                <input type="checkbox" name="remember" id="remember"/>
                                <label for="remember">记住密码</label>
                            </div>

                            <div class="row">

                                <button type="submit" class="btn btn-lg btn-primary col-xs-12" id="login">登陆</button>

                            </div>

                        </fieldset>

                    </form>

                    <a id="forgot_password" class="pull-left" href="#">忘记密码?</a>
                    <a class="pull-right" href="register.html">注册!</a>

                    <div class="clearfix"></div>

                </div>
                <div  class="login-box" style="display: none">

                    <div class="header">
                        <span id="go_login" class="pull-left" style="position: relative;left: 0px;top: -9px;"><i class="fa fa-angle-left fa-2x"></i></span>
                        修改密码
                    </div>
                    <fieldset class="col-sm-12">

                        <div class="form-group">
                            <div class="controls row">
                                <div class="input-group col-sm-12">
                                    <input type="text" class="form-control" id="for_username"
                                           placeholder="输入账号"/>
                                    <span class="input-group-addon"><i class="fa fa-user"></i></span>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="controls row">
                                <div class="input-group col-sm-12">
                                    <input type="text" class="form-control" id="for_email"
                                           placeholder="输入关联邮箱"/>
                                    <span class="input-group-addon"><i class="fa fa-envelope-o"></i></span>
                                </div>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="controls row">
                                <div class="input-group col-sm-12">
                                    <input type="text" class="form-control" placeholder="输入验证码" id="verification"/>
                                    <span id="getVerification" style="cursor: pointer;" class="input-group-addon"><i style="font-style: normal">获取验证码</i></span>
                                    <span id="getVerification1" style="cursor: pointer;display: none" class="input-group-addon"><i style="font-style: normal">获取验证码</i></span>
                                </div>
                            </div>
                        </div>

                        <div class="form-group password">
                            <div class="controls row">
                                <div class="input-group col-sm-12">
                                    <input type="password" class="form-control" id="new_password"
                                           placeholder="输入新密码"/>
                                    <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                </div>
                            </div>
                        </div>

                        <div class="form-group password">
                            <div class="controls row">
                                <div class="input-group col-sm-12">
                                    <input type="password" class="form-control" id="new_password1"
                                           placeholder="重复密码"/>
                                    <span class="input-group-addon"><i class="fa fa-key"></i></span>
                                </div>
                            </div>
                        </div>

                        <div class="form-group password">
                            <div class="controls row">
                                <button type="button" class="btn btn-lg btn-primary col-xs-12" id="save">确认修改</button>
                            </div>
                        </div>
                    </fieldset>

                    <div class="clearfix"></div>

                </div>
            </div><!--/row-->

        </div>

    </div><!--/row-->

</div><!--/container-->
<script src="home/js/jquery-2.1.4.min.js"></script>
<script src="home/js/bootstrap.min.js"></script>
<script src="home/js/login.js"></script>
<script src="home/js/md5.js"></script>
</body>
</html>