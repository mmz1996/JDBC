import java.sql.*;

/**
 * @Classname JdbcTest
 * @Description TODO
 * @Date 2020/4/30 8:15
 * @Created by mmz
 */
public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8","root","password");
            String sql = "select * from account where name = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"mmz");
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("id")+" "+resultSet.getString("name"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }
    }
}
