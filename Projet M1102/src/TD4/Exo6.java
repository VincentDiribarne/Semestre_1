package TD4;

import TD1.Clavier;

public class Exo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 1, i = 0;
		String c;
		char u;
		
		System.out.println("Ecrivez une phrase");
		c = Clavier.lireLigne();
			for(i = 0; i < c.length(); i++){
				u = c.charAt(i);
				if (u == ' '){
					m = m + 1;
				}
			}
		System.out.println("Voici le nombre de mot de votre phrase : " +m);
	}

}
