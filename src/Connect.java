
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nejc
 */
public class Connect {

    public static void Connect(String ip) {
        String filePath = ".local/share/remmina/test.remmina";
        try {
            RemminaConfigModifier.modifyRemminaConfig(filePath,ip);
            Runtime.getRuntime().exec("remmina -c " + filePath);
        } catch (IOException ex) {
            System.out.println("ERROR");
        }
    }
}
