package TD3;

import TD1.Clavier;

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tab1 [];
		double tab2 [];
		int i = 0, b = 0;
		
		System.out.println("Combien de valeur voulez-vous ?");
		b = Clavier.lireInt();
		while (b < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			b = Clavier.lireInt();
			}
		tab1 = new double [b];
		tab2 = new double [b];
		
		for(i = 0; i < b;  i++){
			System.out.println("Ecrivez un nombre");
			tab1[i] = Clavier.lireDouble();
			tab2[i] = tab1[i] + 1;
			System.out.println("Voici la nouvelle valeur " +tab2[i]);
		}
	}

}
