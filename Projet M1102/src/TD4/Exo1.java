package TD4;

import TD1.Clavier;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0, a = 0;
		
		System.out.println("Ecrivez un nombre");
		i = Clavier.lireInt();
		a = Math.floorMod(i, 2);
		
		if (a == 0){
			System.out.println("Ce nombre est pair");
		}
		else {
			System.out.println("Ce nombre est impair");
		}
	}

}
