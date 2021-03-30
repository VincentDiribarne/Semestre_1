package TD2;

import TD1.Clavier;

public class Exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int chiffre;
		
		System.out.println("Ecrivez un chiffre compris entre 1 et 9");
		chiffre = Clavier.lireInt();
		
		while(chiffre > 9)
		{
			System.out.println("Entrez un chiffre allant de 0 à 9, recommencez");
			chiffre = Clavier.lireInt();
		}
		while(chiffre <= 0)
		{
			System.out.println("Entrez un chiffre allant de 0 à 9, recommencez");
			chiffre = Clavier.lireInt();
		}
		switch (chiffre)
		{
			case 1 :
				System.out.println("Un");
				break;
			case 2 :
				System.out.println("Deux");
				break;
			case 3 :
				System.out.println("Trois");
				break;
			case 4 :
				System.out.println("Quatre");
				break;
			case 5 :
				System.out.println("cinq");
				break;
			case 6 : 
				System.out.println("Six");
				break;
			case 7 :
				System.out.println("Sept");
				break;
			case 8 :
				System.out.println("Huit");
				break;
			case 9 :
				System.out.println("Neuf");
				break;
			case 0 :
				System.out.println("Zero");
				break;
			default :
		}
 	}

}
