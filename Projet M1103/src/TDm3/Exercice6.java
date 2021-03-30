package TDm3;

public class Exercice6 {
    public static void main(String[] args) {
        int a, b, res;
        System.out.print("Entrez un nombre : ");
        a = Clavier.lireInt();
        System.out.print("Entrez un nombre : ");
        b = Clavier.lireInt();

        res = somme2(a, b);
        System.out.println("La somme de " +a+ " + " +b+ " est de : " +res);
    }

    public static int somme2(int a, int b) {
        if (b == 0) {
            return a;
        }
        else {
            a = a + 1;
            b = b - 1;
            return somme2(a, b);
        }
    }
}
