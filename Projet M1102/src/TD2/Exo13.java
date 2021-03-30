package TD2;

import TD1.Clavier;

public class Exo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s, b, p1, p2;
		s = 0;
		b = 0;
		p1 = 0;
		p2 = 0;
		
		System.out.println("Combien d'argent avez vous ? (Entre 0 et 50)");
		s = Clavier.lireInt();
		
		while (s<0 || s>50)
		{
			System.out.println("Vous avez entrer une mauvaise valeur, recommencez");
			s = Clavier.lireInt();
		}
		if ((s > 0) && (s <= 50))
		{
			b = s / 5;
			s = Math.floorMod(s, 5);
			p1 = s / 2;
			p2 = Math.floorMod(s, 2);
		}
		System.out.println("Vous avez " +b+ " billet(s) de 5 euros, " +p1+ " de pièce(s) de 2 euros et " +p2+ " de pièce(s) de 1 euros");
	}

}
