package TDm3;

public class Exercice2 {

    public static void main(String[] args) {
        double x, c = 1, y = 0;
        System.out.print("Entrez un nombre : ");
        x = Clavier.lireInt();
        factorielle(x, c);
        double reponse = factorielle(x, c);
        System.out.println("Le resultat est : " +reponse);
    }

    public static double factorielle(double x, double c) {
        while (x > 0) {
            c = x * c;
            x--;
            factorielle(x, c);
        }
        return c;
    }
}
