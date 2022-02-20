package zhou;


import java.sql.*;

public class zhou3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String user ="root";
            String pwd ="zkh954311";
            String url ="root";
            try {
                Connection connection = DriverManager.getConnection(url,user,pwd);
                Statement statement =connection.createStatement();
                String sql ="SELECT * FROM bank";
                ResultSet resultset =  statement.executeQuery(sql);
                while (resultset.next()) {
                    System.out.print( resultset.getString("username") + "   ");
                    System.out.println( resultset.getString("money"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException  e) {
            e.printStackTrace();
        }
    }
}
