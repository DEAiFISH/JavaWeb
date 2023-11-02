package web.response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/resp3")
public class ResponseDemo3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");

        //1.获取字符输出流
        PrintWriter writer = resp.getWriter();

        //content-type
//        resp.setHeader("content-type","text/html");

        writer.write("aaa<br>");
        writer.write("你好");
        writer.write("<br>");
        writer.write("<input type='text'>");
    }
}
