package TD2;

import TD1.Clavier;

public class Exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a, min, max;
		a = 0;
		min = 0;
		max = 0;
	
		System.out.println("Donnez une valeur pour a, elle peut etre négative");
		a = Clavier.lireDouble();
		max = a;
		min = a;
		
		for (int n = 0; n <= 48; n++)
		{
			System.out.println("Donnez une valeur pour a, elle peut etre négative");
			a = Clavier.lireDouble();
			
			if (a > max)
			{
				max = a;
			}
			if (a < min)
			{
				min = a;
			}
		}
		System.out.println("La valeur minimale est de : " +min);
		System.out.println("La valeur maximale est de : " +max);	
	}
	

}
