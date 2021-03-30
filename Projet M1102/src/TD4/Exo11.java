package TD4;

import TD1.Clavier;

public class Exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 0, b = 0, c = 0;
		System.out.println("Ecrivez 3 nombres");
		a = Clavier.lireDouble();
		b = Clavier.lireDouble();
		c = Clavier.lireDouble();
		
		permut(a, b, c);	
	}
	
	public static void permut (double a, double b, double c){
		
		double temp = 0;
		
		if (a < b){
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c){
			temp = b;
			b = c;
			c = temp;
		}
		if (a > b){
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("Voici les valeurs triés par ordre croissant sont " +a+ " < " +b+ " < " +c);
	}
}
