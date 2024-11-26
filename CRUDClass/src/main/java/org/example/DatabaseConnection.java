package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/personel_db";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(url, username, password);
    }
}
