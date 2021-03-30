package TDm4;

	public class Exercice4 {

	public static void main(String[] args) {
		double poids, x, c;
		System.out.print("Entrez un nombre (1 = recursive terminale, 2 = iterative et autre nombre = r�cursive simple) : ");
		c = Clavier.lireInt();

		System.out.print("Rentrez le poids de la plus grande poup�e : ");
		poids = Clavier.lireDouble();
		double total = poids;

		if (c == 1) {
			x = poup�esrecursiveterminale(poids, total);
			System.out.println("Le poids total est de "+x+" grammes");
		}

		else if (c == 2) {
			while ( poids > 100 ) {
				poids = poids/2;
				total = total + poids;
			}
			System.out.println("Le poids total est de "+total+" grammes");
		}

		else {
			x = poup�esrecursive(poids);
			System.out.println("Le poids total est de "+x+" grammes");
		}
	}

	public static double poup�esrecursiveterminale (double p, double t) {
		if (p <= 100) {
			return t;
		}
		else {
			p = p / 2;
			t = t + p;
			return poup�esrecursiveterminale(p, t);
		}
	}
	
	public static double poup�esrecursive (double p) {
		if (p <= 100) {
			return p;
		}
		else {
			return p + poup�esrecursive(p / 2);
		}
	}
}
