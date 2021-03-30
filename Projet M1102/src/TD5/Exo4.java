package TD5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import TD1.Clavier;

public class Exo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String nomFich = "Carnet d'adresse.txt";
		String nom = "", mail = "" , telephone ="";
		String num = "0123456789";
		int b = 0, min = 0, a = 0;
		
		PrintWriter f = new PrintWriter (new FileWriter(nomFich, true));
		System.out.println("Comment tu t'appelle ? (nom et prénom)");
		nom = Clavier.lireLigne();
		f.println(nom);
		System.out.println("Quelle est ton adresse mail ? (pour t'inscrire en maison de retraite)");
		mail = Clavier.lireLigne();
		f.println(mail);
		System.out.println("Quel est ton numero de telephone ?");
		telephone = Clavier.lireLigne();
		a = telephone.length();
		for(int i = 0; i < a; i++){
		b = telephone.charAt(i);
		min = num.indexOf(b);
		}
			if(min == -1){
			System.out.println("Vous vous etes trompé de nombre");
			}
			else{
				f.println(telephone);
				System.out.println(" ");
				System.out.println("Vos coordonnées ont été bien saisies");
			}
		f.println("");
		f.close();
	}

}
