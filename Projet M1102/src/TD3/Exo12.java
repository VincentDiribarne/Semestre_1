package TD3;

import TD1.Clavier;

public class Exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tab[];
		double a = 0;
		int i = 0, b = 0, j = 0;
		
		System.out.println("Combien de valeur voulez-vous ?");
		b = Clavier.lireInt();
		while (b < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			b = Clavier.lireInt();
			}
		tab = new double [b];
		
		for (i = 0; i < b; i++){
			System.out.println("Ecrivez une valeur");
			tab[i] = Clavier.lireDouble();
		}
		for (i = 0; i < b; i++){
			for (j = 0; j < b; j++){
				if (tab[i] < tab[j]){
					a = tab[i];
					tab[i] = tab [j];
					tab[j] = a;
				}
			}
		}
		for(i = 0; i < b; i++){
            System.out.println("tab["+i+"] = "+tab[i]);
		}
	}

}
