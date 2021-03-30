package TD3;

import TD1.Clavier;

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 0, n = 0, h = 0, i = 0;
		double a[];
		
		System.out.println("Combien de valeurs voulez vous dans le tableau ?");
		n = Clavier.lireInt();
		while (n < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			n = Clavier.lireInt();
		}
		a = new double [n];
				
		for (i = 0; i < n; i++){
			System.out.println("Ecrivez un nombre");
			h = Clavier.lireInt();
			a[i] = h;			
		}
		System.out.println("Combien de chiffre voulez-vous en partant de la fin ?");
		b = Clavier.lireInt();
		if (b > n){
			for (i = 0; i < n; i++){
				System.out.println("Voici la valeur en position " +i+ " est " +a[i]);
			}
		}
		for (i = 0; i < b; i++){
			System.out.println("Voici la valeur en position " +(n - (i + 1))+ " est " +a[n - (i + 1)]);
		}
	}
}
