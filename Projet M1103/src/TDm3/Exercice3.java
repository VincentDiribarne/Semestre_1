package TDm3;

public class Exercice3 {

    public static void main(String[] args) {
        int i = 0, x;
        System.out.print("Entrez un nombre : ");
        x = Clavier.lireInt();
        Object tab[] = new Object[x];
        for (int j = 0; j < tab.length; j++) {
            tab[j] = j+1;
        }
        inversion(tab, i, x);
        for (int j=0; j<x;j++){
            System.out.println(tab[j]);
        }
    }

    public static void inversion (Object tab[], int i, int x){
        Object s;
        if(x <= i) {

        }
        else {
            s = tab[i];
            tab[i] = tab[x-1];
            tab[x-1] = s;
            i++; x--;
            inversion(tab, i, x);
        }
    }
}
