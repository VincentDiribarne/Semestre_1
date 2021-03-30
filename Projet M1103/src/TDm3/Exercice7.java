package TDm3;

public class Exercice7 {
    public static void main(String[] args) {
        int a, b, res = 0;
        System.out.print("Entrez un nombre : ");
        a = Clavier.lireInt();
        System.out.print("Entrez un nombre : ");
        b = Clavier.lireInt();

        res = multiplication(a, b, res);
        System.out.println("La multiplication de " +a+ " * " +b+ " est de : " +res);
    }

    public static int multiplication(int a, int b, int res) {
        if (b == 0 || a == 0) {
            return res;
        }
        else {
            res = res + b;
            a = a - 1;
            return multiplication(a, b, res);
        }
    }
}
