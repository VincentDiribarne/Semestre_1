package TD3;

import TD1.Clavier;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0, b = 0, c = 0;
		double notes[] = new double [30];
		
		System.out.println("Sur combien sont vos notes ?");
		c = Clavier.lireDouble();
		
		for (int i = 0; i <= 29; i++)
		{
			System.out.println("Ecrivez votre note");
			a = Clavier.lireDouble();
			
			while (a > c)
			{
				System.out.println("La note saisie n'est pas juste, recommencez");
				a = Clavier.lireDouble();
			}
			notes[i] = a;
			notes[i] = notes[i] + 2;
			
			if (notes[i] > c)
			{
				notes[i] = c;
			}
		b = notes[i];
		System.out.println("La note modifié (ajout de 2 points) est " +b);
		}
	}

}
