package web.response;

import org.apache.commons.io.IOUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/resp4")
public class ResponseDemo4 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //1.读取文件输入流
        FileInputStream fis = new FileInputStream("src/main/java/img/picture.jpeg");

        //2.获取response字节输出流
        ServletOutputStream os = response.getOutputStream();

        //3.输出
//        byte[] buff = new byte[1024];
//        int len = 0;
//        while((len = fis.read(buff)) != -1){
//            os.write(buff,0,len);
//        }

        IOUtils.copy(fis,os);

        //关闭流
        fis.close();
    }
}
