
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nejc
 */
public class fillTable extends okno1 {

    public static void checkIP(JTable table) {
        String fileName = "USERS.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            boolean ping;
            while ((line = br.readLine()) != null) {
                String[] attributes = line.split(" ");
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(new Object[]{attributes[0], attributes[1], attributes[2], attributes[3]});
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
