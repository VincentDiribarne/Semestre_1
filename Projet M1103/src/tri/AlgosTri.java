package tri;
import java.util.*;
public class AlgosTri {

    static int [] tableau;
    static int [] copieTab;
    static int n=1000;
    static boolean AFFICHAGE=true;

    public static void main(String[] args) {

        long start,stop;  //sert pour calculer le temps des tris

        tableau=new int[n];

        Random r=new Random();
        for(int i=0;i<=n-1;i++)
            tableau[i]=r.nextInt(1000);	//on remplit le tableau aléatoirement

        copieTab=(int[]) tableau.clone(); // on garde une copie pour pouvoir appliquer différentes méthodes de tri sur le même jeu de données

        if(AFFICHAGE) afficherTableau();
        System.out.println();

        start = System.nanoTime();
        triSelection(tableau, n);
        stop = System.nanoTime();

        if(AFFICHAGE) afficherTableau();


        System.out.println("Temps de tri par selection : " + (float) (stop - start)/1000000 +" ms\n");

        tableau=(int[]) copieTab.clone(); // on remet le tableau dans l'état initial

        start = System.nanoTime();
        triFusion(tableau,0,n-1);
        stop = System.nanoTime();

        if(AFFICHAGE) afficherTableau();

        System.out.println("Temps de tri fusion : " + (float) (stop - start)/1000000 +" ms\n");



    }

    public static void afficherTableau(){

        System.out.print("Tableau :");

        for(int i=0;i<=n-1;i++)
            System.out.print(" "+tableau[i]);

        System.out.println(".");

    }

    public static void triSelection(int tableau[], int n){
        int i, j, iMini, itemp;

        for (i = 0; i < n - 1; i++) {
            iMini = i;
            for (j = i + 1; j < n; j++){
                if (tableau[j] < tableau[iMini]) {
                    iMini = j;
                }
            }
            itemp = tableau[i];
            tableau[i] = tableau[iMini];
            tableau[iMini] = itemp;
        }
    }

    public static void triFusion(int []tab, int g, int d){
        int m;
        if (g < d) {
            m = (g + d) / 2;
            triFusion(tab, g, m);
            triFusion(tab, (m+1), d);
            fusionner(tab, g, m, d);
        }
    }

    public static void fusionner (int tab[], int g, int m, int d){
         int k = 0;
         int tab2[] = new int[(d-g)+1];
         int i = g, j = m + 1;
         while (i < m + 1 || j <= d) {
             if (i > m) {
                 tab2[k] = tab[j];
                 j++;
             }
             else if (j > d){
                 tab2[k] = tab[i];
                 i++;
             }
             else if (tab[j] > tab[i]) {
                 tab2[k] = tab[i];
                 i++;
             } else {
                 tab2[k] = tab[j];
                 j++;
             }
             k++;
         }
         k = 0;
         for(int a = g; a <= d; a++){
             tab[a] = tab2[k];
             k++;
         }
    }
}
