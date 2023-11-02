package web.requst;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class RequestDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        //String getMethod():获取请求方式 ： GET
        String method = req.getMethod();
        System.out.println("method = " + method);

        //String getContextPath():获取虚拟目录(项目访问路径):/
        String contextPath = req.getContextPath();
        System.out.println("contextPath = " + contextPath);

        //StringBuffer getRequestURL():获取URL(统一资源定位符):http://localhost:8080/req1
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("requestURL = " + requestURL);

        //String getRequestURI():获取URI(统一资源标识服)：/req1
        String requestURI = req.getRequestURI();
        System.out.println("requestURI = " + requestURI);

        //String getQueryString():获取请求参数(GET方式)：username=zhangshan
        String queryString = req.getQueryString();
        System.out.println("queryString = " + queryString);



        //---------
        //获取请求头：user-agent:浏览器版信息
        String header = req.getHeader("user-agent");
        System.out.println("header = " + header);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //获取post 请求体：请求参数

        //1.获取字符输入流
        BufferedReader reader = req.getReader();
        //2.读取数据
        String line = reader.readLine();
        System.out.println(line);


    }
}
