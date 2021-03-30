package TDm4;

public class Exercice2 {

	public static void main(String[] args) {
		int un = 2011, c, n;
		System.out.print("Entrez un nombre (0 = recursive et autre nombre = iterative) : ");
		c = Clavier.lireInt();
		n = 0;
		if (c == 0) {
			int x = suiteSyracuse (n,un);
			System.out.println("La suite de Syracuse atteint 1 pour un n = " +x);
		}
		else {
			while(un != 1) {
				if ((un % 2) == 0) {
					un = un/2;
				}
				else {
					un = 3*un + 1;
				}
				n = n+1;
				System.out.println(un);
			}
			System.out.println("La suite de Syracuse atteint 1 pour un n = "+n);
		}
	}

	public static int suiteSyracuse (int n, int un) {
		if (un != 1) {
			if ((un % 2) == 0) {
				un = un/2;
				System.out.println(un);
				return suiteSyracuse ((n+1),un);
			}
			else {
				un = 3*un + 1;
				System.out.println(un);
				return suiteSyracuse ((n+1),un);
			}
		}
		return n;
	}
}
