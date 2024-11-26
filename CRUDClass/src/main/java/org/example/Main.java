package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Insert personel
            PersonelCRUD.insertPersonel("John", "Doe", 51);
            PersonelCRUD.insertPersonel("Marry", "Lou", 33);

            // Select personel
            System.out.println("Current Personel List:");
            PersonelCRUD.selectPersonel();

            // Update a personel:
            PersonelCRUD.updatePersonel(13, "Jimmy");
            System.out.println("After Update:");
            PersonelCRUD.selectPersonel();

            // Delete a personel
            PersonelCRUD.deletePersonel(14);
            System.out.println("Personel List After Deletion:");
            PersonelCRUD.selectPersonel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
