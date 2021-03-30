package TD4;

import TD1.Clavier;

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mot, al = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyzé";
		int a = 0, b = 0, x = 0;
		char c;
		
		System.out.println("Ecrivez un mot");
		mot = Clavier.lireLigne();
			for(int i = 0; i < mot.length(); i++){
				c = mot.charAt(i);
				b = al.indexOf(c);
				if (b == -1){
					x = 1;
				}
			}
			if (x == 1){
				System.out.println("Votre mot n'est pas bon, ou contient un espace, recommencez");
				mot = Clavier.lireLigne();
			}
			a = mot.length();
			System.out.println("Votre mot comporte " +a+ " lettres");
	}
}
