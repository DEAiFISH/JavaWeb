package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @description TODO
 *
 * @className ServletTest
 * @author DEAiFISH
 * @date 2023/9/28 08:54
 */
//@WebServlet("servletTest")
public class ServletTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应的内容类型
        resp.setContentType("text/html;charset=utf-8");
        //取得输出对象
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        //浏览器中显示“第二个Servlet类”
        out.println("第二个Servlet类");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
