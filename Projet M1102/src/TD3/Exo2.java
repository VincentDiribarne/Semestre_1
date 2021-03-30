package TD3;

import TD1.Clavier;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0;
		int notes[] = new int [15];
		
		System.out.println("Sur combien sont vos notes ?");
		b = Clavier.lireInt();
		
		for (int i = 0; i <= 14; i++)
		{
			System.out.println("Ecrivez votre note");
			a = Clavier.lireInt();
			
			while (a > b)
			{
				System.out.println("Votre valeur n'est pas juste, recommencez");
				a = Clavier.lireInt();
			}
			notes[i] = a;
			System.out.println("La valeur de la note en position " +i+ " est " +notes[i]);
		}
	}

}
