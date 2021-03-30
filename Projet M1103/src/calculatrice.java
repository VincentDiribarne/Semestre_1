import java.util.Scanner;
import pile.Pile;
import pile.PileParTableau;
import pile.PilePleineException;
import pile.PileVideException;

public class calculatrice {

    public static void affichage(Pile p, int a) {
        if (p.pileVide()){
            System.out.println("Votre resultat est : " +a);
        }
    }

    public static void main(String[] args){
        int a, b;
        Pile p = new PileParTableau(10);
        Scanner sc = new Scanner(System.in);

        try {
            while (sc.hasNext()) {
                String x = sc.next();
                if (x.equals("=")) {                        //Permet de stopper la boucle
                    break;
                }
                switch (x) {
                    case "+":
                        a = (int) p.depiler();
                        b = (int) p.depiler();
                        a = a + b;
                        affichage(p, a);
                        p.empiler(a);
                        break;
                    case "-":
                        a = (int) p.depiler();
                        b = (int) p.depiler();
                        a = b - a;
                        affichage(p, a);
                        p.empiler(a);

                        break;
                    case "*":
                        a = (int) p.depiler();
                        b = (int) p.depiler();
                        a = a * b;
                        affichage(p, a);
                        p.empiler(a);
                        break;
                    case "/":
                        a = (int) p.depiler();
                        b = (int) p.depiler();
                        a = b / a;
                        affichage(p, a);
                        p.empiler(a);
                        break;
                    default:
                        p.empiler(Integer.parseInt(x));
                }
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Vous avez mit une valeur non accepté par la calculatrice (une lettre, ou un espace manquant)");
        }
        catch (PileVideException e){
            System.out.println("Le resultat de la calculatrice ne peut être affiché, des données sont incompletes");
        }
        catch (PilePleineException e) {
            System.out.println("Le resultat de la calculatrice ne peut être affiché, des données sont incompletes");
        }

    }
}