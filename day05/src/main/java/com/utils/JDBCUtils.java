package com.utils;

import java.sql.*;

/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/8/20
 * @Version 1.0
 */
public class JDBCUtils {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnetion() {

        Connection root = null;
        try {
            root = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssmdemo", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return root;
    }

    public static PreparedStatement getPre(Connection con, String sql) {

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = con.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return preparedStatement;
    }

    /**
     * 关闭链接资源
     *
     * @param con
     * @param pre
     * @param resultSet
     */
    public static void closeSource(Connection con, PreparedStatement pre, ResultSet resultSet) {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (pre != null) {
                pre.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
