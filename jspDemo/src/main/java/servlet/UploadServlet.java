package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/11/21 18:35
 */
@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 10 * 1024 * 1024)
public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Part part = req.getPart("file1");
        if (part == null) {
            return;
        }
        String fileName = part.getSubmittedFileName();

//        String path = req.getServletContext().getRealPath("upload");
        String path = System.getProperty("user.dir") + "/" + "upload";    //System.getProperty("user.dir")获取当前模块的根目录

        File dir = new File(path);
        if (!dir.exists()) {
            dir.mkdir();
        }

        File file = new File(path + "/" + fileName);

        InputStream is = null;
        BufferedOutputStream bw = null;
        try {
            bw = new BufferedOutputStream(Files.newOutputStream(file.toPath()));
            is = part.getInputStream();
            int len;
            byte[] ch = new byte[1024];

            while ((len = is.read(ch)) != -1) {
                bw.write(ch, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
