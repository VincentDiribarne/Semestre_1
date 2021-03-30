package TD6;

import TD1.Clavier;
public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		double somme = 1, temp = 0;
		System.out.println("Combien de valeur voulez vous dans votre somme ?");
		a = Clavier.lireInt();
		while (a == 0){
			System.out.println("Vous vous etes trompé, recommencez");
			a = Clavier.lireInt();
		}
		for(int i = 1; i < a; i++){
			temp = (double) 1 / i;
			somme = somme + temp;
		}
		System.out.print(String.format("Voici la somme de vos valeurs %2.3f", somme));
	}

}
