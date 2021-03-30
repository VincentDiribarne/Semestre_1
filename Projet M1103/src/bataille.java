import file.File;
import file.FileParChainage;
import file.FileVideException;

import java.util.Random;

public class bataille {

    public static void main(String[] args) throws FileVideException {

        File j1 = new FileParChainage();
        File j2 = new FileParChainage();
        File pli = new FileParChainage();
        System.out.println("File j1 : ");
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int n = r.nextInt(10);
            j1.enfiler(n + 1);
            System.out.print(" " + j1.defiler());
        }
        System.out.println(" ");
        System.out.println("File j2 : ");
        for (int j = 0; j < 5; j++) {
            int n1 = r.nextInt(10);
            j2.enfiler(n1 + 1);
            System.out.print(" " + j2.defiler());
        }

        while (j1.fileVide() == true || j2.fileVide() == true) {
            if (j1.defiler() == j2.defiler()) {

            }
            else {
                int a = (int) j1.defiler();
                int b = (int) j2.defiler();
                if (a < b) {
                    j2.enfiler(a);
                    j2.enfiler(b);
                }
                else {
                    j1.enfiler(a);
                    j1.enfiler(b);
                }
            }
        }

        if(j2.fileVide() == true) {
            System.out.println("Bravo à Joueur 1");
        }

        if(j1.fileVide() == true) {
            System.out.println("Bravo à Joueur 2");
        }



    }
}
