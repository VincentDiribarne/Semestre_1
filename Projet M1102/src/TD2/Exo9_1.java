package TD2;

import TD1.Clavier;

public class Exo9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double i, n, e;
		i = 0;
		n = 0;
		e = 0;
		
		System.out.println("Entrez une valeur pour n");
		n = Clavier.lireDouble();
		
		while (i <= n)
		{
			e = e + i;
			i = i + 1;
		}
		System.out.println("La somme des nombres allant de 1 à " +n+ " est " +e);
		
		//Boucle pour
		
		n = 0;
		e = 0;
		
		System.out.println("Entrez une valeur pour n");
		n = Clavier.lireDouble();
		
		for (int i1 = 0; i1 <= n; i1++)
		{
			e = e + i1;
		}
		System.out.println("La somme des nombres allant de 1 à " +n+ " est " +e);
	}
}
