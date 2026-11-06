package ennassiry.com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerUtil {

    public static void logError(String erreur) {

        // Ajouter le nouveau message à la fin du fichier
        try (BufferedWriter fichier = new BufferedWriter(
                new FileWriter("error.log", true))) {

            // Enregistrer la date, l'heure et le message d'erreur
            String ligne = "[" + LocalDateTime.now() + "] " + erreur;

            fichier.write(ligne);
            fichier.newLine();

        } catch (IOException ex) {

            System.err.println("Erreur pendant l'enregistrement du journal : "
                    + ex.getMessage());
        }
    }
}
