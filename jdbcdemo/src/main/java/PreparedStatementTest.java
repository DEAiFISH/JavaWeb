import bean.Book;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

/*
 * @description TODO
 *
 * @author DEAiFISH
 * @date 2023/12/7 08:59
 */
public class PreparedStatementTest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bid = req.getParameter("bid");
        String bName = req.getParameter("bName");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        PreparedStatement preparedStatement1 = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:localhost:3306/test?characterEncoding=utf-8", "root", "root");
            preparedStatement = connection.prepareStatement("insert into xx values (?,?)");
            preparedStatement.setString(1,bid);
            preparedStatement.setString(2,bName);
            preparedStatement.executeUpdate();

            preparedStatement1 = connection.prepareStatement("select * from xx");
            resultSet = preparedStatement1.executeQuery();
            ArrayList<Object> objects = new ArrayList<>();
            while(resultSet.next()){
                objects.add(new Book(resultSet.getInt(1) + "",resultSet.getString(2)));
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (preparedStatement1 != null) {
                    preparedStatement1.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }
}
