package TD4;

import TD1.Clavier;

public class Exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y;
		System.out.println("Donnez une valeur");
		x = Clavier.lireDouble();
		y = absolu(x);
		System.out.println("Voici la valeur absolu de la valeur donnée " +y);
	}
	public static double absolu (double x){
		if (x >= 0){
			return x;
		}
		else{
			return x*(-1);
		}
	}

}
