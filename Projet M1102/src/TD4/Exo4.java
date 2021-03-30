package TD4;

public class Exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 0, y = 0, z = 0;
		
		x = 2 * Math.random();
		y = 2 * Math.random() - 1;
		z = 0.3 * Math.random() + 1.35;
		System.out.println("Voici x " +x+ ", il est compris entre 0 et 2");
		System.out.println("Voici y " +y+ ", il est compris entre -1 et 1");
		System.out.println("Voici z " +z+ ", il est compris entre 1.35 et 1.65");
	}

}
