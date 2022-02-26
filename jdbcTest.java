package com.zhou.jdbc;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.concurrent.Callable;

public class jdbcTest {
    public static void main(String[] args) {

        ResourceBundle bundle=ResourceBundle.getBundle("resources/db");
        String driver =bundle.getString("driver");
        String url = bundle.getString("url");
        String user =bundle.getString("user");
        String password =bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            stmt =conn.createStatement();
            String SQL="select *from bank";
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String username = rs.getString("username");
                int money = rs.getInt("money");
                System.out.println(username + "," + money);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
             if (rs!=null) {
                 try {
                     rs.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             if (stmt!=null) {
                 try {
                     stmt.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
             if (conn!=null) {
                 try {
                     conn.close();
                 } catch (SQLException e) {
                     e.printStackTrace();
                 }
             }
        }
    }
}