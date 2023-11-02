package web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/aServlet")
public class AServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //发送Cookie

        //1.创建Cookie
        Cookie cookie = new Cookie("username", "张三");

        /*
        1. 正数：将 Cookie写入浏览器所在电脑的硬盘，持久化存储。到时间自动删除
        2. 负数：默认值，cookie在当前浏览器内存中，当浏览器关闭，则 Cookie被销毁
        3. 零：删除对应 Cookie
        */
        //设置存活时间
        cookie.setMaxAge(60 * 60 * 24);/*1天*/

        //2.发送Cookie.response
        response.addCookie(cookie);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
