package com.zhou.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcTest2 {
    public static void main(String[] args) {
        Connection conn =null;
        PreparedStatement ps =null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhou","root","zkh954311");
            //插入
            /*String sql ="insert into bank(username,money) values (?,?)";
            ps =conn.prepareStatement(sql);
            ps.setString(1,"李白");
            ps.setInt(2,10000);*/

            //更新
            /*String sql="update bank set username= ?,money= ? where id=5";
            ps =conn.prepareStatement(sql);
            ps.setString(1,"王维");
            ps.setInt(2,11000);*/

            //删除
           /* String sql="delete from bank where id=?";
            ps =conn.prepareStatement(sql);
            ps.setInt(1,5);*/



            int count = ps.executeUpdate();
            System.out.println(count);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (ps!= null) {
                try {
                    ps.close();
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
