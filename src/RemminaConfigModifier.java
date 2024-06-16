import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nejc
 */
/*Metoda popravi datoteko .local/share/remmina/test.remmina */
public class RemminaConfigModifier {
    public static void modifyRemminaConfig(String filePath,String newServer) {
        try {
            // Read all lines from the file
            Path path = Paths.get(filePath);
            String[] lines = Files.readAllLines(path).toArray(new String[0]);
            lines[21] = "server=" + newServer;
            Files.write(path, String.join(System.lineSeparator(), lines).getBytes());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
