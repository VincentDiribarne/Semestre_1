package TD4;

import TD1.Clavier;

public class Exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 0, c = 0, d = 0, e = 0;
		
		System.out.println("Donnez 5 nombres");
		a = Clavier.lireInt();
		b = Clavier.lireInt();
		c = Clavier.lireInt();
		d = Clavier.lireInt();
		e = Clavier.lireInt();
		somme1(a, b, c, d, e);
		
	}
	public static void somme1 (int a, int b, int c, int d, int e){
		int somme = 0;
		
		somme = a + b + c + d + e;
		System.out.println("Voici la somme de vos nombres est de " +somme);
	}

}
