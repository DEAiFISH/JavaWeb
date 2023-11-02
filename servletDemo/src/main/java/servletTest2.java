import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/test2",loadOnStartup = 1)
public class servletTest2 implements Servlet {

    /**
     * 初始化方法：
     * 1.调用时机：默认情况下，Servelet被第一次访问时，调用
     *  loadOnStartup: 修改调用时机
     * 2.调用次数：1次
     */
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init...被创建");
    }

    /**
     * 提供服务
     * 1.调用时机：每一次Servlet被访问时，调用
     * 2.调用次数：多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet Hello World");
    }

    /**
     * 销毁方法
     * 1.调用时机：内存释放或者服务器关闭的时候，Servlet对象会被销毁，调用
     * 2.调用次数：1次
     */
    public void destroy() {
        System.out.println("destroy...被关闭");
    }

    public ServletConfig getServletConfig() {
        return null;
    }


    public String getServletInfo() {
        return null;
    }
}
