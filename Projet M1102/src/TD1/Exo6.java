package TD1;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x, y, z ;
		x = 0;
		y = 0;
		z = 0;
		
		System.out.println("Saisir la valeur pour x");
		x = Clavier.lireDouble();
		System.out.println("Saisir la valeur pour y");
		y = Clavier.lireDouble();
		System.out.println("Les valeurs saisies sont " +x+ " et " +y);
		
		z = x;
		x = y;
		y = z;
		System.out.println("Les valeurs ont été inversées, voici les nouvelles valeurs pour x : " +x+ " et y : " +y);
	}

}
