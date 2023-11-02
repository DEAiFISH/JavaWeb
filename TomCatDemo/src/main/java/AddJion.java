
import bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import static JDBCUtils.Utils.closeResource;
import static JDBCUtils.Utils.getConnection;


@WebServlet("/add")
public class AddJion extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String account = req.getParameter("account");
        String password = req.getParameter("password");

        System.out.println("....");

        System.out.println("account=" + account);
        System.out.println("password=" + password);


        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = getConnection();
            String sql = "insert into join_Test(join_account, join_password)VALUES(?,?); ";
            ps = conn.prepareStatement(sql);

            ps.setObject(1,account);
            ps.setObject(2,password);
            ps.execute();

            User user = new User(account,password);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            closeResource(conn,ps);
        }



    }
}
