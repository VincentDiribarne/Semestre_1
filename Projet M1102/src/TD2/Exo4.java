package TD2;

import TD1.Clavier;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, f, n;
		a = 0;
		f = 0;
		n = 0;
		
		System.out.println("Combien de nombre voulez vous dans votre table de multiplication ?");
		n = Clavier.lireDouble();
		System.out.println("Quel nombre voulez vous multiplier ?");
		a = Clavier.lireDouble();
		System.out.println("Voici la table de multiplication de " +a);
		
		for(int i = 0; i < (n+1); i++)
		{
			f = a * i;
			System.out.println(+a+ " * " +i+ " = " +f);
		}
	}
}
