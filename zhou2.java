package zhou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class zhou2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        String url ="jdbc:mysql://localhost:3306/zhou";
        String user = "root";
        String pwd = "zkh954311";
        Connection connection= DriverManager.getConnection(url,user,pwd);

        if (connection==null) {
            System.out.println("连接失败");
        } else {
            System.out.println("连接成功");

            Statement statement=connection.createStatement();

            String sql ="insert into zhou123 values(null,'杜甫',3200)";

            if (statement.executeUpdate(sql)>1) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
            connection.close();
        }
    }
}
