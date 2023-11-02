package web.requst;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class RequestDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        //GET请求逻辑
        System.out.println("GET...");

        //1.获取所有参数的Map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {
            //username:zhangsan lisi
            System.out.print(key + ":");

            //获取值
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println("----------------");

        //2.根据key获取参数值，数组
        String[] hobbies = req.getParameterValues("hobby");

        for (String hobby : hobbies) {
            System.out.println(hobby);

        }

        //根据key，获取单个值
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //POST请求逻辑
        System.out.println("POST...");

        //1.获取所有参数的Map集合
        Map<String, String[]> parameterMap = req.getParameterMap();
        for (String key : parameterMap.keySet()) {
            //username:zhangsan lisi
            System.out.print(key + ":");

            //获取值
            String[] values = parameterMap.get(key);
            for (String value : values) {
                System.out.print(value + " ");
            }

            System.out.println();
        }

        System.out.println("----------------");

        //2.根据key获取参数值，数组
        String[] hobbies = req.getParameterValues("hobby");

        for (String hobby : hobbies) {
            System.out.println(hobby);

        }

        //根据key，获取单个值
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
