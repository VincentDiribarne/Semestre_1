package TD2;

import TD1.Clavier;

public class Exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, s, p, n2;
		double m;
		n = 0;
		s = 0;
		p = 1;
		n2 = 0;
		m = 0;
		
		System.out.println("Entrez le nombre de valeur");
		n2 = Clavier.lireInt();
		
		for (int i = 1; i <= n2; i++)
		{
			System.out.println("Entrez une valeur");
			n = Clavier.lireInt();
			s = s + n;
			p = p * n;
		}
		m = s / n2;
		System.out.println("La somme est " +s+ ", produit : " +p+ ", moyenne : " +m);	
	}

}
