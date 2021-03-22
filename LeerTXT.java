import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeerTXT {

    public String LeerTXTop() {
        String info = "";
        try {
            File texto = new File("ListadoProducto.txt");
            Scanner scanner = new Scanner(texto);
            while (scanner.hasNextLine()) {
                info = String.valueOf(scanner.hasNextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
        return info;
    }

}
