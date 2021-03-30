package TD4;

import TD1.Clavier;

public class Exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0, b = 0, max = 0;
		
		System.out.println("Ecrivez un nombre");
		a = Clavier.lireDouble();
		System.out.println("Ecrivez un nombre");
		b = Clavier.lireDouble();
		max = max(a,b);
		System.out.println("Le nombre maximum des deux nombres donnés est " +max);
	}
	public static double max (double a, double b){
		double  max = 0;
		if(a > b){
			max = a;
			return max;
		}
		else {
			max = b;
			return max;
		}
	}
}
