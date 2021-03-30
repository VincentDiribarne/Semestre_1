package TD2;

import TD1.Clavier;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double conso, prixUni, prixF, prixConso;
		conso = 0;
		prixUni = 0;
		prixF = 0;
		
		System.out.println("Quel est votre consommation d'eau");
		conso = Clavier.lireDouble();
			if (conso <= 50)   
			{
				prixUni = 2;
			}
			else if (conso > 50 && conso <= 100)
			{
				prixUni = 3;
			}
			else if (conso > 100 && conso <= 200)
			{
				prixUni = 5;
			}
			else if (conso > 200 && conso <= 500)
			{
				prixUni = 6;
			}
			else if (conso > 500)
			{
				prixUni = 10;
			}
		prixConso = prixUni * conso;
		prixF = prixUni * conso + 10;
		System.out.println("Le prix de votre consommation sans l'abonnement (10 euros) est de : " +prixConso);
		System.out.println("Voici le prix avec l'abonnement : " +prixF);		
	}
}
