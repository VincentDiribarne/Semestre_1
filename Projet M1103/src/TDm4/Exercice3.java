package TDm4;

public class Exercice3 {

	public static void main(String[] args) {
			int x = 100;
			while (x == 100) {
			x = (int)(Math.random() * 100);
			}

			int n = 0;
			int y;
			System.out.print("Nombre d'essai : ");
			int max = Clavier.lireInt();
			while(n != max) {
				System.out.print("Essai numero " +(n+1)+ " : ");
				y = Clavier.lireInt();
				if(x == y) {
					System.out.println("Bien joue, tu as reussi en "+(n+1)+" essais !");
					n = max;
				}
				else {
					if (y > x) {
						System.out.println("Trop grand");
					}
					else {
						System.out.println("Trop petit");
					}
					n++;
				}
			}

			if (n == max) {
				System.out.println(" ");
				System.out.println("Vous avez perdu");
			}
		
		
	}

}
