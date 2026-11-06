package ennassiry.com;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DÉBUT DU PROGRAMME TP9 ===");

        // Test de la création d'un utilisateur invalide
        try {
            User user = new User("", 150);
        } catch (InvalidUserException e) {
            System.err.println("Échec de création utilisateur : " + e.getMessage());
            LoggerUtil.logError(e.getMessage());
        }

        // Test de lecture de fichier inexistant
        FileReaderUtil readerUtil = new FileReaderUtil();
        readerUtil.readFileModern("inexistant.txt");

        System.out.println("=== FIN DU PROGRAMME TP9 ===");
    }
}