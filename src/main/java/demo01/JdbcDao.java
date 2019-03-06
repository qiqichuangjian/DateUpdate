package demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @Acthor:孙琪; date:2019/3/6;
 */
public class JdbcDao {
    public static void main(String[] args) {
        String className = "com.mysql.cj.jdbc.Driver";
        //UTC是中国时区
        String url = "jdbc:mysql:///demo?serverTimezone=UTC";
        String user = "root";
        String password = "123456";
        try {
            Class.forName(className);
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println(con);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
