package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Create Table
            JDBIExample.createTable();

            // Insert Records
            JDBIExample.insertPersonel("John Doe");
            JDBIExample.insertPersonel("Alice Smith");

            // Select Records
            System.out.println("Current Personel List:");
            JDBIExample.selectPersonel();

            // Update Record
            JDBIExample.updatePersonel(1, "Updated Ali");
            System.out.println("After Update:");
            JDBIExample.selectPersonel();

            // Delete Record
            JDBIExample.deletePersonel(2);
            System.out.println("After Deletion:");
            JDBIExample.selectPersonel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
