package TD1;

public class Exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double r, v;
		r = 0;
		v = 0;
		System.out.println("Donnez le rayon de la sph�re");
		r = Clavier.lireDouble();
		v = (4 * Math.PI * r * r * r) / 3;
		System.out.println("Le volume de la sph�re est de " +v+ " centim�tre cube");
	}

}
