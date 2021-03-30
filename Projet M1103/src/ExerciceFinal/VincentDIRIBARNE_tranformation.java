package ExerciceFinal;

import pile.*;
import file.*;
import java.util.*;

public class VincentDIRIBARNE_tranformation {

    public static void main (String[] args) throws FileVideException {

        File f = new FileParChainage();                    //Initialisation file
        Pile p = new PileParTableau(100);               //Initialisation tableau
        int x;
        System.out.print("Tapez 1 (Post Fixee vers Normale) ou 2 (Normale vers Post Fixee) : ");
        x = Clavier.lireInt();
        switch (x) {
            case 1 :
                tranformationPosttoNormale(f, p);
                break;

            case 2 :
                tranformationNormaletoPost(f, p);
                break;

            default:
                System.out.print("Tapez 1 (Post Fixée vers Normale) ou 2 (Normale vers Post Fixée)");
        }
    }
    public static void tranformationPosttoNormale(File f, Pile p) {
        String resultat, a, b, chaine;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Donnez une notation Post-Fixee : ");
            while (sc.hasNext()) {                          //Scanner pour trouver les valeurs
                String x = sc.next();
                if (x.equals("=")) {                        //Permet de stopper la boucle
                    break;
                }
                f.enfiler(x);
            }
            while (f.fileVide() != true) {                  //Marche tant que la file n'est pas vide
                chaine = (String) f.defiler();
                switch (chaine) {                           //Switch pour pouvoir reperer les caractères
                    case "+":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "+" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    case "-":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "-" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    case "*":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "*" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    case "/":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "/" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    default:
                        p.empiler(chaine);
                }
            }
            System.out.println("Le resultat est de :" +p.depiler()+"=");
        } catch (NumberFormatException e) {         //Exception Problème d'espace
            System.out.println("Vous avez mit une valeur non acceptée par la calculatrice (une lettre, ou un espace manquant)");
        } catch (PileVideException e) {             //Exception pour la pile Vide
            System.out.println("Erreur, des données sont incompletes");
        } catch (PilePleineException e) {           //Exception pour la pile Pleine
            System.out.println("Erreur, des données sont incompletes");
        } catch (FileVideException e) {             //Exception pour la file Vide
            System.out.println("Erreur, des données sont incompletes");
        }
    }

    public static void tranformationNormaletoPost(File f, Pile p) {
        String resultat, a, b, chaine;
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Donnez une notation Normale : ");
            while (sc.hasNext()) {                          //Scanner pour trouver les valeurs
                String x = sc.next();
                String replaced = x.replaceAll("()", "");
                if (x.equals("=")) {                        //Permet de stopper la boucle
                    break;
                }
                f.enfiler(x);
            }

            while (f.fileVide() != true) {                  //Marche tant que la file n'est pas vide
                chaine = (String) f.defiler();
                switch (chaine) {                           //Switch pour pouvoir reperer les caractères
                    case "+":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "+" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    case "-":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "-" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    case "*":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "*" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    case "/":
                        a = (String) p.depiler();
                        b = (String) p.depiler();
                        resultat = "(" + b + "/" + a + ")";
                        p.empiler(resultat);        //Empile le resultat pour pouvoir avoir un parenthèse déjà créée
                        break;

                    default:
                        p.empiler(chaine);
                }
            }
            System.out.println("Le resultat est de :" +p.depiler()+"=");
        } catch (NumberFormatException e) {         //Exception Problème d'espace
            System.out.println("Vous avez mit une valeur non acceptée par la calculatrice (une lettre, ou un espace manquant)");
        } catch (PileVideException e) {             //Exception pour la pile Vide
            System.out.println("Erreur, des données sont incompletes");
        } catch (PilePleineException e) {           //Exception pour la pile Pleine
            System.out.println("Erreur, des données sont incompletes");
        } catch (FileVideException e) {             //Exception pour la file Vide
            System.out.println("Erreur, des données sont incompletes");
        }
    }
}
