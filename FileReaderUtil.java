package ennassiry.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderUtil {

    public void readFileModern(String filePath) {
        // La ressource déclarée entre parenthèses est automatiquement fermée
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Erreur d'E/S avec le fichier : " + e.getMessage());
        }
    }
}