package ennassiry.com;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== LANCEMENT DU TP9 =====");

        // Vérification de la validation des informations utilisateur
        try {
            User nouvelUtilisateur = new User("", 150);

        } catch (InvalidUserException ex) {

            System.err.println("Erreur lors de l'ajout de l'utilisateur : " + ex.getMessage());

            LoggerUtil.logError("Problème utilisateur : " + ex.getMessage());
        }

        // Tentative d'ouverture d'un fichier qui n'existe pas
        FileReaderUtil gestionnaireFichier = new FileReaderUtil();
        gestionnaireFichier.readFileModern("document_test.txt");

        System.out.println("===== ARRÊT DU TP9 =====");
    }
}
