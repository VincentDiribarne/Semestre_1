package TD4;

import TD1.Clavier;

public class Exo14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0, b = 0;
		boolean x;
		
		System.out.println("Ecrivez un nombre");
		a = Clavier.lireDouble();
		System.out.println("Ecrivez un nombre");
		b = Clavier.lireDouble();
		x = InvouOpp(a,b);
		if (x == true){
			System.out.println("Votre resultat est Vrai");
		}
		else {
			System.out.println("Votre resultat est Faux");
		}
	}

	public static boolean InvouOpp(double a, double b){
		if ((a * b == 1) || (a + b == 0)){
			return (true);
		}
		else {
			return (false);
		}
	}
}
