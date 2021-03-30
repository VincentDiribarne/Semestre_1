package TD3;

import TD1.Clavier;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a[];
		int i = 0, b = 0, h = 0, c = 0, g = 0;
		
		System.out.println("Combien de valeurs voulez vous dans le tableau ?");
		b = Clavier.lireInt();
		while (b < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			b = Clavier.lireInt();
		}
		a = new double [b];
		
		for(i = 0; i < b; i++){
			System.out.println("Ecrivez un nombre");
			h = Clavier.lireInt();
			a[i] = h;
		}
		for(i = 0; i < b; i++){
			if(a[i] > 0){
				c = c + 1;
			}
			if (a[i] < 0){
				g = g + 1;
			}
		}
		System.out.println("Votre tableau comprend " +c+ " valeurs positives");
		System.out.println("Votre tableau comprend " +g+ " valeurs négatives");
	}

}
