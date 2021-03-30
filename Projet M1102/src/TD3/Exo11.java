package TD3;

import TD1.Clavier;

public class Exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c;
		int i = 0, max = 0;
		double val[];
		
		System.out.println("Combien de valeur voulez-vous ?");
		max = Clavier.lireInt();
		while (max < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			max = Clavier.lireInt();
			}
		val = new double [max];
		while(i < max){
			System.out.println("Ecrivez un nombre");
			val[i] = Clavier.lireDouble();
			i = i + 1;
		}
		i = 1;
		c = 1;
		while (i < max){
			if ((val[(i - 1)] + 1) != val [i+1]){
				c = 0;
			}
			max = 0;
		}
		if (c == 1){
				System.out.println("C'est consécutif");
			}
		else if (c == 0){
				System.out.println("C'est non consécutif");
			}
	}
}
