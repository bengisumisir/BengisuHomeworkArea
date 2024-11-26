package org.example;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBIExample {

 // Create the table with only the 'name' column
 public static void createTable() {
 Jdbi jdbi = DatabaseConnection.getJdbi();
 jdbi.useHandle(handle -> {
 handle.execute("CREATE TABLE IF NOT EXISTS personel (" +
 "id INT AUTO_INCREMENT PRIMARY KEY, " +
 "name VARCHAR(50))");  // Only name column
 });
 System.out.println("Table created successfully.");
 }

 // Insert a person with a name
 public static void insertPersonel(String name) {
 Jdbi jdbi = DatabaseConnection.getJdbi();
 jdbi.useHandle(handle -> {
 handle.execute("INSERT INTO personel (name) VALUES (?)", name);  // Insert only name
 });
 System.out.println("Person added successfully.");
 }

 // Select all personel (only name will be displayed)
 public static void selectPersonel() {
 Jdbi jdbi = DatabaseConnection.getJdbi();
 jdbi.useHandle(handle -> {
 handle.createQuery("SELECT * FROM personel")
 .map((rs, ctx) -> String.format("ID: %d, Name: %s",
 rs.getInt("id"), rs.getString("name")))  // Only display ID and name
 .forEach(System.out::println);
 });
 }

 // Update the person's name by id
 public static void updatePersonel(int id, String newName) {
 Jdbi jdbi = DatabaseConnection.getJdbi();
 jdbi.useHandle(handle -> {
 handle.execute("UPDATE personel SET name = ? WHERE id = ?", newName, id);  // Update only name
 });
 System.out.println("Person updated successfully.");
 }

 // Delete a person by id
 public static void deletePersonel(int id) {
 Jdbi jdbi = DatabaseConnection.getJdbi();
 jdbi.useHandle(handle -> {
 handle.execute("DELETE FROM personel WHERE id = ?", id);  // Delete by id
 });
 System.out.println("Person deleted successfully.");
 }
 }