package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
@WebServlet("/servletTest")
public class ServletTest extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = request.getParameter("user");
        String passwd = request.getParameter("passwd");

        PrintWriter writer = response.getWriter();

        writer.println("<html><body>");
        writer.println(user);
        writer.println(passwd);
        writer.println("</body></html>");


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        writer.println(request.getParameter("user"));
        writer.println(request.getParameter("passwd"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();

        writer.println(request.getParameter("user"));
        writer.println(request.getParameter("passwd"));
    }
}
