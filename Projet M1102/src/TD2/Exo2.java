package TD2;

import TD1.Clavier;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rep1, rep2;
		System.out.println("Quel est votre sexe ? (G/F) ?");
		rep1 = Clavier.lireString();
		while ((!rep1.equals("G"))&&(!rep1.equals("F")))
			{
				System.out.println("Repondez par G ou F, recommencez");
				rep1 = Clavier.lireString();
			}
			if (rep1.equals("F"))
			{
				System.out.println("Etes vous mariée ?");
				rep2 = Clavier.lireString();
					while ((!rep2.equals("O"))&&(!rep2.equals("N")))
					{
						System.out.println("Repondez par O ou N, recommencez");
						rep2 = Clavier.lireString();
					}
				if (rep2.equals("O"))
				{
					System.out.println("Bonjour Madame");
				}
				else 
				{
					System.out.println("Bonjour Mademoiselle");
				}
			}
			else
			{
				System.out.println("Bonjour Monsieur");
			}
	}

}
