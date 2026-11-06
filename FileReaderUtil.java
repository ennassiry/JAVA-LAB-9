package ennassiry.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil {

    public void readFileModern(String cheminFichier) {

        // Lecture du fichier avec fermeture automatique de la ressource
        try (BufferedReader lecteur = new BufferedReader(
                new FileReader(cheminFichier))) {

            String contenu;

            // Parcourir le fichier jusqu'à la dernière ligne
            while ((contenu = lecteur.readLine()) != null) {
                System.out.println(contenu);
            }

        } catch (IOException ex) {

            System.err.println("Problème lors de la lecture du fichier : "
                    + ex.getMessage());
        }
    }
}
