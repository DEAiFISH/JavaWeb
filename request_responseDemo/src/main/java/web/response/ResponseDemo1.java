package web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 演示服务器内部转发和客户端重定向
 *
 * 内部转发：网址不会跳转
 * 客户端重定向：网址会跳转
 *
 *
 * 特点：
 *  重定向
 *      ·浏览器地址栏路径发生变化
 *      ·可以重定向到任意位置的资源 （服务器内部、外部均可）
 *      ·两次请求，不能在多个资源使用request共享数据
 */
@WebServlet("/resp1")
public class ResponseDemo1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Demo1...");

//        req.getRequestDispatcher("resp2").forward(req,resp);
        /**
         * 重定向
         */
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath + "resp2");
    }
}
