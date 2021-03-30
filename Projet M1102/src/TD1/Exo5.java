package TD1;

public class Exo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		System.out.println("Donnez une valeur pour a");
		a = Clavier.lireInt();
		System.out.println("Donnez une valeur pour b");
		b = Clavier.lireInt();
		System.out.println("Donnez une valeur pour c");
		c = Clavier.lireInt();
		c = a + b;
		c = b - c;
		
		System.out.println("La valeur de a est : "+a);
		System.out.println("La valeur de b est : "+b);
		System.out.println("La valeur de c est : "+c);
	}
}
