package TDm4;

public class Exercice1 {

	public static void main(String[] args) {
		int m, n, x;
		System.out.print("Entrez un nombre (inferieur ou egal a 4) : "); 		//Au dela de 4, cela fait une erreur de StackOverflow
		m = Clavier.lireInt();
		while (m > 4) {
			System.out.print("Recommencez, entrez un nombre : ");
			m = Clavier.lireInt();
		}
		n = 0;
		x = AckermannPeter(m , n);
		System.out.println(x);
	}

	public static int AckermannPeter (int m, int n) {
		if (m == 0) {
			return (n+1);
		}
		else if (m > 0 && n == 0) {
			return AckermannPeter((m-1) , 1);
		}
		else { 
			return AckermannPeter((m-1), AckermannPeter(m ,(n-1)));
		}	
	}



}
