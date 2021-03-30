package TDm3;

public class Exercice4 {

    public static void main(String[] args) {
        int nb1, nb2, temp = 0, res;
        System.out.print("Entrez un nombre : ");
        nb1 = Clavier.lireInt();
        System.out.print("Entrez un nombre : ");
        nb2 = Clavier.lireInt();

        res = diviseur(nb1, nb2);
        System.out.println("Le PGCD de " +nb1+ " et de " +nb2+ " est : " +res);
    }

    public static int diviseur(int nb1, int nb2) {
        int reponse;
        reponse = nb1 % nb2;

        if (reponse == 0) {
            return nb2;
        }
        else {
            return diviseur(nb2, reponse);
        }
    }

}
