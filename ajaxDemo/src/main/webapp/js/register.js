//1. 给用户名输入框绑定 失去焦点事件
document.getElementById("username").onblur = function () {
    //2. 发送ajax请求
    // 获取用户名的值
    var username = this.value;

    //2.1. 创建核心对象
    var xhttp;
    if (window.XMLHttpRequest) {
        xhttp = new XMLHttpRequest();
    } else {
        // code for IE6, IE5
        xhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    //2.2. 发送请求
    xhttp.open("GET", "http://localhost:8080/ajaxDemo_war/ajaxServlet?username=" + username);
    xhttp.send();

    //2.3. 获取响应
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            //alert(this.responseText);
            //判断
            if (this.responseText == "true") {
                //用户名存在，显示提示信息
                document.getElementById("username_err").style.display = '';
            } else {
                //用户名不存在 ，清除提示信息
                document.getElementById("username_err").style.display = 'none';
            }
        }
    };

}