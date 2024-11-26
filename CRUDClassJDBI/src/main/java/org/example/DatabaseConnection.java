package org.example;

import org.jdbi.v3.core.Jdbi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7747578";
    private static final String USER = "sql7747578";
    private static final String PASSWORD = "GJfnAklKfV";

    public static Jdbi getJdbi() {
        return Jdbi.create(URL, USER, PASSWORD);
    }
}

