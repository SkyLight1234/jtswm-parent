/**
 * Created by Administrator on 2016/1/12 0012.
 */
$(document).ready(function () {
    var $agree=$("#agree");
    var $register=$("#register");
    var $account=$("#account");
    var $Email=$("#Email");
    var $password=$("#password");
    var $password1=$("#password1");
    var $getVerification=$("#getVerification");
    var $getVerification1=$("#getVerification1");
    var $verification=$("#verification");
    var Verification="";
    $(".login-box:eq(0)").fadeIn("fast").addClass("lightSpeedIn");
    $("form input").not("#agree").focus(function () {
        $(this).addClass("shine_red").val("");
        $(this).siblings(".prompt").fadeIn(1000).html("请输入信息").css("color","#ff6a59");
    }).blur(function () {
        $(this).removeClass("shine_red");
        $(this).siblings(".prompt").fadeOut(1000);
    });
    var username=/^\d{5,16}$/;
    var password=/^[0-9a-zA-Z]{8,16}$/;
    var email=/\w[-\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\.)+[A-Za-z]{2,14}/;
    $agree.on("change", function () {
        if($agree.prop("checked")){
            $register.prop("disabled",false);
        }else{
            $register.prop("disabled",true);
        }
    });
    $account.on("input",function () {
        if(username.test($account.val())){
            $(this).siblings(".prompt").html("格式正确").css("color","#056515");
        }else{
            $(this).siblings(".prompt").html("由5-16位数字组成").css("color","#ff6a59");
        }
    });
    $Email.on("input",function () {
        if(email.test($Email.val())){
            $(this).siblings(".prompt").html("格式正确").css("color","#056515");
        }else{
            $(this).siblings(".prompt").html("请输入正确的邮箱").css("color","#ff6a59");
        }
    });
    $password.on("input",function () {
        if(password.test($password.val())){
            $(this).siblings(".prompt").html("格式正确").css("color","#056515");
        }else{
            $(this).siblings(".prompt").html("由8-16位数字字母组成").css("color","#ff6a59");
        }
    });
    $password1.on("input",function () {
        if(($password1.val()==$password.val())&&password.test($password1.val())){
            $(this).siblings(".prompt").html("密码正确").css("color","#056515");
        }else{
            if(!password.test($password1.val())){
                $(this).siblings(".prompt").html("由8-16位数字字母组成").css("color","#ff6a59");
            }else {
                $(this).siblings(".prompt").html("两次输入的密码不一致").css("color","#ff6a59");
            }
        }
    });
    $getVerification.on("click", function () {
        $(this).hide();
        $getVerification1.show();
        var times=10;
        Verification="1234";
        $getVerification1.addClass("shine_red");
        $.ajax({
            type : "POST",
            url :  localUrl+'/system/User!sendValicateCode',
            dataType : 'jsonp',
            data : {
                'email':"1032960260@qq.com",
                'validateCode':"258789"
            },
            success : function(data) {
                console.log(JSON.stringify(data));
            },
            error : function( textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
        //var countDown=setInterval(function () {
        //    times--;
        //    $getVerification1.children("i").text("验证码已发送，请到邮箱查收！"+times+"s");
        //    if(times<=0){
        //        clearInterval(countDown);
        //        $getVerification.children("i").html("重新获取验证码");
        //        $getVerification1.children("i").html("重新获取验证码");
        //        $getVerification1.hide();
        //        $getVerification.show();
        //    }
        //},1000)
    });
    $register.on("click", function () {
        var value;
        if(($verification.val()==Verification)&&($verification.val()!="")){
            $(".prompt").each(function (i) {
                if($(this).css("color")!="rgb(5, 101, 21)"){
                    alert("请输入正确的"+$(this).attr("title"));
                    $(this).siblings("input").onfocus;
                    value=0;
                    return false;
                }
            });
            if(value==0){
                return false;
            }
        }else{
            alert("验证码不正确");
            return false;
        }
    })
});