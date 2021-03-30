package TD1;

public class Exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double L1, L2, s;
		L1 = 0;
		L2 = 0;
		s = 0;
	
		System.out.println("Donnez la longueur de votre pièce");
		L1 = Clavier.lireDouble();
		System.out.println("Donnez la largeur de votre pièce");
		L2 = Clavier.lireDouble();
		s = L2 * L1;
		System.out.println("La surface de votre pièce est de " +s+ " m²");
	}

}
