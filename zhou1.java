package zhou;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class zhou1<connection> {
    public void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");


        //连接参数
        String url = "jdbc:mysql://localhost:3306/zhou";
        String user = "root";
        String password = "zkh954311";

        //连接对象
        Connection connection = DriverManager.getConnection(url, user, password);

        //获取执行者
        Statement statement = connection.createStatement();

        //判断连接条件
        if (connection == null) {
            System.out.println("连接失败");
        } else {
            System.out.println("连接成功");

            //删除数据
            String sql = "delete from 01 where id=3 ";
            if (statement.executeUpdate(sql) >= 1) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
            connection close;
        }
    }
}