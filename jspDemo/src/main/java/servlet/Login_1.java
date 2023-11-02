package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @description TODO
 *
 * @className Login_1
 * @author DEAiFISH
 * @date 2023/10/10 09:10
 */
@WebServlet("/login_1")
public class Login_1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        if ("zhangsan".equals(userName) && "123".equals(password)) {
            req.getRequestDispatcher("servlet/loginSuccess.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("servlet/login.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
