package TDm3;

public class Exercice1 {

    public static void main(String[] args) {
        int x;
        System.out.print("Entrez un nombre : ");
        x = Clavier.lireInt();
        pair(x);
        int c = pair(x);
        if (c == 0) {
            System.out.println("Le resultat est pair");
        }
        else {
            System.out.println("Le resultat est impair");
        }
    }

    public static int pair(int x) {

        while (x > 0) {
            x = x - 2;
            pair(x);
        }
        return x;
    }
}
