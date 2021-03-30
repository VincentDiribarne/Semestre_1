package TD2;

import TD1.Clavier;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, b;
		a = 0;
		b = 0;
		
		System.out.println("Ecrivez un premier nombre");
		a = Clavier.lireDouble();
		System.out.println("Ecrivez un deuxieme nombre");
		b = Clavier.lireDouble();
		
		if(a != b)
		{
			if(a < 0)
			{
				if (b < 0)
				{
					System.out.println("Le produit est positif");
				}
				else
				{
					System.out.println("Le resultat est négatif");
				}
			}
			else if (b < 0)
			{
				System.out.println("Le resultat est négatif");
			}
			else
			{
				System.out.println("Le resultat est positif");
			}
		}
		else 
		{
			System.out.println("Le resultat est positif");
		}
	}
}
