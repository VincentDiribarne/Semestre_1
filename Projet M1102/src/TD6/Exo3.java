package TD6;

import TD1.Clavier;

public class Exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 1, b = 0;
			
		while (a != 0){
			System.out.print("Entrez votre valeur (si vous utlisez 0, cela arrete le programme : ");
			a = Clavier.lireDouble();
				if(a == 0){
					System.out.println("Vous avez arrete votre programme !");
				}
				else{
					b = Math.sqrt(a);
					System.out.println(String.format("Voici la racine carrée de votre nombre : %2.4f", b));
				}
		}
	}

}
