package metier;

import javax.jws.WebService;
import service.ICalculatrice;

@WebService(
        endpointInterface = "service.ICalculatrice",
        serviceName = "CalculatriceService",
        portName = "CalculatricePort",
        targetNamespace = "http://service.calculatrice/"
)
public class Calculatrice implements ICalculatrice {

    @Override
    public double somme(double a, double b) {
        System.out.println("Appel de somme avec: " + a + " + " + b);
        double resultat = a + b;
        System.out.println("Résultat: " + resultat);
        return resultat;
    }

    @Override
    public double multiplication(double a, double b) {
        System.out.println("Appel de multiplication avec: " + a + " * " + b);
        double resultat = a * b;
        System.out.println("Résultat: " + resultat);
        return resultat;
    }

    @Override
    public double soustraction(double a, double b) {
        System.out.println("Appel de soustraction avec: " + a + " - " + b);
        double resultat = a - b;
        System.out.println("Résultat: " + resultat);
        return resultat;
    }

    @Override
    public double division(double a, double b) {
        System.out.println("Appel de division avec: " + a + " / " + b);

        if (b == 0) {
            System.out.println("Erreur: Division par zéro!");
            throw new IllegalArgumentException("Division par zéro interdite");
        }

        double resultat = a / b;
        System.out.println("Résultat: " + resultat);
        return resultat;
    }
}