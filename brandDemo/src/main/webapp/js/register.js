const changeImg1 = document.getElementById("changeImg1");
const changeImg2 = document.getElementById("changeImg2");

changeImg1.onclick = function () {
    document.getElementById("checkCodeImg").src = "/brandDemo/checkCodeServlet?" + new Date().getMilliseconds();
}
changeImg2.onclick = function () {
    document.getElementById("checkCodeImg").src = "/brandDemo/checkCodeServlet?" + new Date().getMilliseconds();
}