package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/10/24 08:44
 */
@WebFilter(urlPatterns = {"*.jsp"})
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        servletRequest.setCharacterEncoding("utf-8");

        System.out.println("firstFilter");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        String path = request.getContextPath();
        System.out.println(uri);
        System.out.println(path);

        //执行剩下的过滤器
        filterChain.doFilter(servletRequest, servletResponse);


    }
}
