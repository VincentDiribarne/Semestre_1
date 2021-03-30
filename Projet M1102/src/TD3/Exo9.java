package TD3;

import TD1.Clavier;

public class Exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a[];
		double valMax = 0, pos = 0;
		int i = 0, b = 0; 
		
		System.out.println("Combien de valeur voulez-vous ?");
		b = Clavier.lireInt();
		while (b < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			b = Clavier.lireInt();
			}
		a = new double [b];
		valMax = a[0];
		
		for (i = 0; i < b; i++){
			System.out.println("Ecrivez une valeur");
			a[i] = Clavier.lireDouble();
			
			if (valMax < a[i]){
				valMax = a[i];
				pos = i + 1;
			}
		}
		System.out.println("La valeur max donnée est : " +valMax+ " et elle occupe la position : " +pos);
	}

}
