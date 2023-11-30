import bean.Book;

import java.sql.*;
import java.util.ArrayList;

/**
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/11/30 09:09
 */
public class ConnectTest {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;//查询
        ArrayList<Book> books;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql:localhost:3306/test?characterEncoding=utf-8", "root", "root");
            st = con.createStatement();
            rs = st.executeQuery("");
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
