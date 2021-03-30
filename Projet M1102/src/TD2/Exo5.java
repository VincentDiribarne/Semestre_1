package TD2;

import TD1.Clavier;

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prixP, nbPhoto, prixF, nbPhoto2;
		prixP = 0;
		nbPhoto = 0;
		prixF = 0;
		nbPhoto2 = 0;
		
		System.out.println("Combien voulez-vous de photocopie ?");
		nbPhoto = Clavier.lireDouble();
		
		if(nbPhoto <= 10)
		{
			prixP = 0.10;
			prixF = prixP * nbPhoto;
			System.out.println("Vous allez payer " +prixF+ " pour " +nbPhoto+ " photocopies");
		}
		if (nbPhoto > 10 && nbPhoto <= 30)
		{
			prixP = 0.09;
			nbPhoto2 = nbPhoto - 10;
			prixF = prixP * nbPhoto2 + 1;
			System.out.println("Vous allez payer " +prixF+ " pour " +nbPhoto+ " photocopies");
		}
		if (nbPhoto > 30)
		{
			prixP = 0.08;
			nbPhoto2 = nbPhoto - 30;
			prixF = prixP * nbPhoto2 + 2.8;
			System.out.println("Vous allez payer " +prixF+ " pour " +nbPhoto+ " photocopies");
		}
	}

}
