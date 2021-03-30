package TD3;

import TD1.Clavier;

public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double s = 0, h = 0;
		int b = 0;
		double somme[];
		
		System.out.println("Combien de valeurs voulez vous dans le tableau ?");
		b = Clavier.lireInt();
		while (b < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			b = Clavier.lireInt();	
		}
		somme = new double [b];
		
		for (int i = 0; i < b; i++){
			System.out.println("Ecrivez un nombre");
			h = Clavier.lireDouble();
			somme[i] = h;
		}
		for(int i = 0; i < b; i++){
			s = s + somme[i];
		}
		System.out.println("La somme de toutes les valeurs du tableau est de " +s);
	}

}
