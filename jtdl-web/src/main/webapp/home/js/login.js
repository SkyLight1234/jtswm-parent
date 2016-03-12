/**
 * Created by Administrator on 2016/1/12 0012.
 */
$(document).ready(function () {
    console.log(localStorage.getItem("account")+"  "+localStorage.getItem("password"));
    var $username=$("#username");
    var $password=$("#password");
    var $login=$("#login");
    var $remember=$("#remember");
    var $getVerification=$("#getVerification");
    var $getVerification1=$("#getVerification1");
    var $verification=$("#verification");
    var $new_password=$("#new_password");
    var $new_password1=$("#new_password1");
    var $forgot_password=$("#forgot_password");
    var $go_login=$("#go_login");
    var Verification="1234";
    $(".login-box:eq(0)").fadeIn("fast").addClass("lightSpeedIn");
    $("form input").not("#remember").focus(function () {
        $(this).addClass("shine_red");
    }).blur(function () {
        $(this).removeClass("shine_red");
    });
    var username=/^\d{5,16}$/;
    var password=/^[0-9a-zA-Z]{8,16}$/;
    $username.on("input",function () {
        if(username.test($username.val())){
            $(".fa-user").css("color","green");
        }else{
            $(".fa-user").css("color","red");
        }
    });
    $password.on("input",function () {
        if(password.test($password.val())){
            $(".fa-key").css("color","green");
        }else{
            $(".fa-key").css("color","red");
        }
    });
    $login.on("click", function () {
        var data_str={
            username:$username.val(),
            password:$password.val()
        }
        if(!username.test(data_str.username)||!password.test(data_str.password)){
            alert("账号或密码格式不正确！");
            //console.log(hex_md5(data_str.username));
            return false;
        }else{
            if($remember.prop("checked")){
                localStorage.setItem("account",data_str.username);
                localStorage.setItem("password",data_str.password);
            }
        }
    });
    $getVerification.on("click", function () {
        $(this).hide();
        $getVerification1.show();
        var times=10;
        Verification="1234";
        $getVerification1.addClass("shine_red");
        var countDown=setInterval(function () {
            times--;
            $getVerification1.children("i").text("验证码已发送，请到邮箱查收！"+times+"s");
            if(times<=0){
                clearInterval(countDown);
                $getVerification.children("i").html("重新获取验证码");
                $getVerification1.children("i").html("重新获取验证码");
                $getVerification1.hide();
                $getVerification.show();
            }
        },1000)
    });
    $verification.on("input",function () {
        var reg=new RegExp("验证码已发送，请到邮箱查收！");
        if(($verification.val()==Verification)&&reg.test($getVerification1.children("i").html())){
            $(".password").fadeIn("fast")
        }
    });
    $new_password.on("input",function () {
        if(password.test($new_password.val())){
            $(this).siblings("span").text("格式正确").css("color","#056515");
        }else{
            $(this).siblings("span").text("由8-16位数字字母组成").css("color","#ff6a59");
        }
    });
    $new_password1.on("input",function () {
        if(($new_password1.val()==$new_password.val())&&password.test($new_password1.val())){
            $(this).siblings("span").text("密码正确").css("color","#056515");
        }else{
            if(!password.test($new_password1.val())){
                $(this).siblings("span").text("由8-16位数字字母组成").css("color","#ff6a59");
            }else {
                $(this).siblings("span").text("两次输入的密码不一致").css("color","#ff6a59");
            }
        }
    });
    $forgot_password.on("click", function () {
        $(".login-box:eq(0)").fadeOut("500");
        setTimeout(function () {
            $(".login-box:eq(1)").fadeIn("fast").addClass("lightSpeedIn");
        },500)
    });
    $go_login.on("click", function () {
        $(".login-box:eq(1)").fadeOut("500");
        setTimeout(function () {
            $(".login-box:eq(0)").fadeIn("fast").addClass("lightSpeedIn");
        },500)
    })
});