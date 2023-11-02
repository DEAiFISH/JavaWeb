function save() {
    var password = document.getElementsByName("password");
    if (password[0].value === password[1].value) {
        alert("注册成功！");
    } else {
        alert("两次输入密码不相同！");
        event.preventDefault()
    }
}