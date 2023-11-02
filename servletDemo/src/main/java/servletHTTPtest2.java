import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


/*
    1.精确匹配  @WebServlet(urlPatterns = "/user/select")
    2.目录匹配  @WebServlet(urlPatterns = "/user/*")
    3.扩展名匹配  @WebServlet(urlPatterns = "*.do")  不能以 / 开头
    4.任意匹配（不建议使用）  @WebServlet(urlPatterns = "/")
                @WebServlet(urlPatterns = "/*")   优先级高于 "/"
 */
@WebServlet(urlPatterns = "")
public class servletHTTPtest2 extends HttpServlet {

}
