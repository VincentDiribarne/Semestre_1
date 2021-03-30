package TD4;

import TD1.Clavier;

public class Exo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0, b = 0, c = 0, max = 0;
		
		System.out.println("Ecrivez un nombre");
		a = Clavier.lireDouble();
		System.out.println("Ecrivez un nombre");
		b = Clavier.lireDouble();
		System.out.println("Ecrivez un nombre");
		c = Clavier.lireDouble();
		
		max = max(a,b,c);
		System.out.println("Le nombre maximum des trois nombres donnés est " +max);
	}

	public static double max (double a, double b, double c){
		double temp = 0, max = 0; 
		if(a < b){
			temp = a;
			a = b;
			b = temp;
		}
		if (b < c){
			temp = b;
			b = c;
			c = temp;
		}
		if (a < b){
			temp = a;
			a = b;
			b = temp;
		}
		max = a;
		return max;
	}
}
