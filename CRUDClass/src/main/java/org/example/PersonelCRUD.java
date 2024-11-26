package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonelCRUD {

    public static void insertPersonel(String name, String surname, int age) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String query = "INSERT INTO personel (name, surname, age) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, surname);
        preparedStatement.setInt(3, age);
        preparedStatement.executeUpdate();
        connection.close();
    }

    public static void selectPersonel() throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String query = "SELECT * FROM personel";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Surname: " + resultSet.getString("surname"));
            System.out.println("Age: " + resultSet.getInt("age"));
        }
        connection.close();
    }

    public static void updatePersonel(int id, String newName) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String query = "UPDATE personel SET name = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, newName); // Yeni adı ayarla
        preparedStatement.setInt(2, id); // Hangi id'deki personelin güncelleneceğini belirt
        int rowsUpdated = preparedStatement.executeUpdate(); // Güncellemeyi yap
        if (rowsUpdated > 0) {
            System.out.println("Person with ID " + id + " updated successfully.");
        } else {
            System.out.println("No person found with ID " + id);
        }
        connection.close();
    }

    public static void deletePersonel(int id) throws SQLException {
        Connection connection = DatabaseConnection.getConnection();
        String query = "DELETE FROM personel WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();
        connection.close();
    }
}
