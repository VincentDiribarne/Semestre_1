package TD4;

import TD1.Clavier;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 0, a = 0, b =0, c = 0;
		
		System.out.println("Donnez une valeur pour a, b et c");
		a = Clavier.lireDouble();
		b = Clavier.lireDouble();
		c = Clavier.lireDouble();
		
		d = (b * b) - (4 * a * c);
		if (d > 0) {
			x0(a, b, c, d);
		}
		if (d == 0){
			x1(a, b, c, d);
		}
		if (d < 0){
			System.out.println("Il existe aucune solutions ou elle n'est pas dans les reels");
		}
	}
	public static void x0(double a, double b, double c, double d) {
		
		double x1 = 0, x2 = 0;
		x1 = ((- b + Math.sqrt(d)) / 2 * a);
		x2 = ((- b - Math.sqrt(d)) / 2 * a);
		System.out.println("Il y a deux solution x1 = " +x1+ " et x2 = " +x2);
	}
	public static void x1(double a, double b, double c, double d) {
		
		double x0;
		x0 = - b / 2 * a;
		System.out.println("Il y a une solution x0 = " +x0);
	}
}

