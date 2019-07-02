package com.chen.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author chenyam
 * @title: DruidUntils
 * @projectName JavaWeb
 * @description: druid连接池工具类
 * @date 2019/6/25 17:09
 */
public class DruidUntils {
    private static String driverName;
    private static String url;
    private static String userName;
    private static String password;
    private static DataSource source;

    static {
        Properties properties = new Properties();
        //读取该类的路径
        InputStream inputStream = DruidUntils.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(inputStream);
            source = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = source.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
