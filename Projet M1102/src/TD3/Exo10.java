package TD3;

import TD1.Clavier;

public class Exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double notes[];
		double h = 0, m = 0, nb = 0, o = 0;
		int i = 0, b = 0, u = 0;
		
		System.out.println("Combien de valeur voulez-vous ?");
		b = Clavier.lireInt();
		while (b < 0){
			System.out.println("Votre valeur ne peut pas etre négative, recommencez");
			b = Clavier.lireInt();
			}
		notes = new double [b];
		System.out.println("Sur combien sont vos notes ?");
		o = Clavier.lireDouble();
		
		for(i = 0; i < b; i++){
			System.out.println("Ecrivez votre note");
			h = Clavier.lireDouble();
			while (h > o){
				System.out.println("La note saisie ne peut pas être superieure à " +o+ " recommencez ! ");
				h = Clavier.lireDouble();
			}
			notes[i] = h;
			nb = nb + notes[i];
		}
		m = nb / b;
		for (i = 0; i < b; i++){
			if (m >= notes[i]){
				u = u + 1;
			}
		}
		System.out.println("Voici le nombre de valeur superieure à la moyenne de classe : " +u);
	}
}
