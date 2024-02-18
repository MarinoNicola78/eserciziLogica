package fileUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

    public void print(String filename) {

        // try with resource -> messo tra parentesi evita di fare close delle risorse aperte nel TRY
        try (BufferedReader in = new BufferedReader(new FileReader(filename));
        ) {
            String line;
            int countLine = 1;
            while ((line = in.readLine()) != null) {
                System.out.printf("\n%4d %s", countLine++, line);
            }

        } catch (IOException e) {
            System.out.println("risorsa non trovata!!");
        }
    }


}
