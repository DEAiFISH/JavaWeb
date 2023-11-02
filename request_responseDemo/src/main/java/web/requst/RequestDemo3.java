package web.requst;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * 中文乱码的解决方法
 */
@WebServlet("/req3")
public class RequestDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.解决乱码：POST.getReader()
//        request.setCharacterEncoding("UTF-8");//设置字符输入流编码

        //2.获取username
        String username = request.getParameter("username");
        System.out.println("解决前:username = " + username);

        //3.GET,获取参数的方式：getQueryString
        //乱码的原因：tomcat进行URL解码，默认的字符集ISO-8859-1
        //3.1 先对乱码数据进行解码：转换为字节数组
//        byte[] bytes = username.getBytes(StandardCharsets.ISO_8859_1);
        //3.2 字节数组解码
//        String s = new String(bytes, StandardCharsets.UTF_8);
        //也可解决post乱码
        String s = new String(username.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        System.out.println("解决后:username = " + s);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
