package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
拦截具体的资源：/index.jsp：只有访问index.jsp时才会被拦截。
目录拦截：/user/*：访门/user下的所有资源，都会被拦截
后缀名拦截：*.jsp：访问后级名为jsp的资源，都会被拦截
拦截所有：/*：访问所有资源，都会被拦截
 */
@WebFilter("/*")
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FilterDemo...放行前...");

        //放行前对request的数据进行处理

        //放行
        filterChain.doFilter(servletRequest, servletResponse);

        //放行后对response的数据进行处理

        System.out.println("FilterDemo...放行后...");

    }

    @Override
    public void destroy() {

    }
}
