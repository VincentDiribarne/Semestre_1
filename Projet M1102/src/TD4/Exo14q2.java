package TD4;

import TD1.Clavier;

public class Exo14q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double tab1[];
		int a = 0;
		boolean y;
		System.out.println("Combien de valeur");
		a = Clavier.lireInt();
		tab1 = new double [a];
		y = existeInvouOppConsecutif(tab1, a);
		if (y == false){
			System.out.println("Il n'existe pas de valeur inverse ou opposée consécutive");
		}
		else {
			System.out.println("Il existe des valeurs inverses ou opposées consécutives");
		}
	}
	public static boolean InvouOpp(double d, double f){
		if ((d * f == 1) || (d + f == 0)){
			return (true);
		}
		else {
			return (false);
		}
	}
	public static boolean existeInvouOppConsecutif (double tab1[], int a){
	
		int e = 0;
		for (int j = 0; j < a; j++){
			System.out.println("Ecrivez une valeur");
			tab1[j] = Clavier.lireDouble();
		}
		for (int i = 0; i < a - 1; i++){
			if (InvouOpp(tab1[i], tab1[i+1]) == true){
			e = 1;				
			}
		}
		if (e == 1){
			return true;
		}
		else {
			return false;
		}
		
			
	}

}
