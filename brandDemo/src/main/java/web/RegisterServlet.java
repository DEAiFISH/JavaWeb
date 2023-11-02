package web;

import bean.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
    private final UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf_8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //获取用户输入的验证码
        String checkCode = request.getParameter("checkCode");

        //从Session获取程序生成的验证码
        HttpSession session = request.getSession();
        String checkCodeGen = (String) session.getAttribute("checkCodeGen");

        User user = new User(username, password);

        //比对验证码是否相同
        if (!checkCodeGen.equalsIgnoreCase(checkCode)) {
            //不相同，不允许注册

            request.setAttribute("register_msg", "验证码错误");
            request.getRequestDispatcher("/register.jsp").forward(request, response);

            return;
        }

        boolean flag = userService.register(user);

        if (flag) {
            //注册成功,跳转到登录页面

            request.setAttribute("register_msg", "注册成功，请登录！");

            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            //注册失败跳转到注册页面

            request.setAttribute("register_msg", "用户名已存在");
            request.getRequestDispatcher("/register.jsp").forward(request, response);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
