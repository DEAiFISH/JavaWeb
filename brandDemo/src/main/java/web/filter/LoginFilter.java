package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * 登录验证的过滤器
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;

        //判断访问资源路径是否和登录相关
        String[] urls = {"login.jsp", "/img/", "/css/", "/register.jap", "/registerServlet"};
        //获取当前访问的资源路径
        String url = req.getRequestURI();

        //循环判断
        for (String u : urls) {
            if (url.contains(u)) {
                //找到了

                //放行
                chain.doFilter(request, response);

                return;
            }
        }


        //1.判断session中是否有User
        HttpSession session = req.getSession();
        Object user = session.getAttribute("user");

        //2.判断user是否为null
        if (user != null) {
            //登录过

            //放行
            chain.doFilter(request, response);
        } else {
            //没有登录，储存提示信息

            req.setAttribute("login_msg", "您尚未登录！");
            req.getRequestDispatcher("/login.jsp").forward(request, response);
        }


    }

    public void destroy() {
    }
}
