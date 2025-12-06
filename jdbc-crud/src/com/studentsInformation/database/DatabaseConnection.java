package com.studentsInformation.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static String dbURL = System.getenv("dbURL");
    private static String username = System.getenv("username");
    private static String password = System.getenv("password");

    private DatabaseConnection(){};

    public static Connection getConnection() throws SQLException{
      Connection connection = null;
      connection = DriverManager.getConnection(dbURL, username, password);
      return connection;
    }


}
