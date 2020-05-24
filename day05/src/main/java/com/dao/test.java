package com.dao;

import com.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;


/**
 * @author Jonsen
 * @Description: TODO
 * @date 2019/8/20
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(test.class);
        Connection connetion = null;
        PreparedStatement pre = null;
        ResultSet resultSet = null;
        try {
            logger.info("----------start-------------");
            connetion = JDBCUtils.getConnetion();
            pre = JDBCUtils.getPre(connetion, "SELECT * FROM tb_user");
            resultSet = pre.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getString("user_name"));
            }
            int i = 1/0 ;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeSource(connetion,pre,resultSet);
        }

    }
}
