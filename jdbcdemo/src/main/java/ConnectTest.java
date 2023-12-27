import bean.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/11/30 09:09
 */
public class ConnectTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        {
            Connection con = null;
            Statement st = null;
            ResultSet rs = null;//查询
            ArrayList<Book> books;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql:localhost:3306/test", "root", "root");
                st = con.createStatement();
                rs = st.executeQuery("");   //查询
                st.executeUpdate("");  //更新

                books = new ArrayList<>();
                while(rs.next()){
                    Book book = new Book();
                    book.setId(rs.getString("BID"));
                    book.setName(rs.getString("B_NAME"));
                    book.setPrice(Float.parseFloat(rs.getString("B_PRICE")));
                    books.add(book);
                }

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } finally {
                if (rs != null) {
                    try {
                        rs.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (st != null) {
                    try {
                        st.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


            request.setAttribute("book",books);
            request.getRequestDispatcher("xxx.jsp").forward(request,response);

        }
    }

    @lombok.SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql:localhost:3306/test", "root", "root");
        PreparedStatement ps = con.prepareStatement("insert into t_user values(?,?)");
        ps.setString(1,"12");
        ps.setInt(2,1);
        ps.executeUpdate();

        PreparedStatement ps1 = con.prepareStatement("select * from t_user");
        ResultSet result = ps1.executeQuery();
        while(result.next()){
            result.getString(1);
            result.getInt(2);

        }

        Statement s =  con.createStatement();
        s.executeUpdate("insert into t_user values (" + name + "," + id + ")");
        ResultSet rs =  s.executeQuery("select * from t_user");
    }
}
