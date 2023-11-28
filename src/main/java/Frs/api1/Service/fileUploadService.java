package Frs.api1.Service;

import org.springframework.stereotype.Service;

@Service


public class FileUploadService {

    // Méthode pour enregistrer le fichier et les données associées en base de données ou ailleurs
    public void saveFile(String firstName, String lastName, byte[] fileData) {
        // Ici, vous pourriez implémenter la logique pour enregistrer le fichier et les données
        // dans la base de données, stocker le fichier sur le système de fichiers, etc.

        // À titre d'exemple, imprimez simplement les données pour le moment
        System.out.println("Saving file for: " + firstName + " " + lastName);
        System.out.println("File size: " + fileData.length + " bytes");

        // Ajoutez ici la logique pour enregistrer le fichier dans la base de données ou
        // tout autre traitement nécessaire.
    }
}
