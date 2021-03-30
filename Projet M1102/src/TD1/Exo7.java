package TD1;

public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c, s, p;
		a = 0;
		b = 0;
		c = 0;
		s = 0;
		p = 0;
		
		System.out.println("Donnez une valeur pour a");
		a = Clavier.lireInt();
		System.out.println("Donnez une valeur pour b");
		b = Clavier.lireInt();
		System.out.println("Donnez une valeur pour a");
		c = Clavier.lireInt();
		
		System.out.println("Les valeurs saisies sont : " +a+ ", " +b+ ", " +c);
		s = a + b + c;
		p = a * b * c;
		System.out.println("La somme des nombres est : " +s);
		System.out.println("Le produit des nombres est : " +p);
	}

}
