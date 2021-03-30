package TD1;

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n, r;
		n = 0;
		r = 0;
		
		System.out.println("Donnez une valeur pour n");
		n = Clavier.lireInt();
		r = n + 5;
		r = r * n;
		r = r + 14;
		System.out.println("La valeur pour r est de : " +r);
	}

}
