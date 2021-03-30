package TD1;

public class Exo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		a = 0;
		
		System.out.println("Donnez une valeur pour a");
		a = Clavier.lireInt();
		a = a*a;
		System.out.println("La valeur au carré du nombre donné est : " +a);
	}

}
