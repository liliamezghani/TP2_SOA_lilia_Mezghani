package serveur;

import javax.xml.ws.Endpoint;
import metier.Calculatrice;

public class ServeurJWS {

    public static void main(String[] args) {
        // URL de publication du service
        String url = "http://localhost:8080/calculatrice";

        // Création et publication du service
        Calculatrice calculatrice = new Calculatrice();
        Endpoint endpoint = Endpoint.publish(url, calculatrice);

        System.out.println("=== SERVICE WEB CALCULATRICE ===");
        System.out.println("Service publié avec succès !");
        System.out.println("URL du service : " + url);
        System.out.println("WSDL disponible : " + url + "?wsdl");
        System.out.println("Le service est en cours d'exécution...");

        // Garder le serveur actif
        try {
            System.out.println("Appuyez sur Entrée pour arrêter le service...");
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Arrêt propre du service
            endpoint.stop();
            System.out.println("Service arrêté.");
        }
    }
}