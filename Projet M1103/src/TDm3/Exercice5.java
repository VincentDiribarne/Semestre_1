package TDm3;

public class Exercice5 {

    public static void main(String[] args) {
        int a = 1, b, res, i = 2;
        System.out.print("Entrez un nombre : ");
        b = Clavier.lireInt();

        res = somme(a, i, b);
        System.out.println("La somme de " +a+ " a " +b+ " est : " +res);
    }

    public static int somme(int a, int i, int b) {
        int reponse;
        reponse = a + i;
        i++;
        if (i > b) {
            return reponse;
        }
        else {
            return somme(reponse, i, b);
        }
    }
}
