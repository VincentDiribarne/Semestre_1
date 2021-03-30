package TD4;

import TD1.Clavier;

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n2 = 0, e = 0, f = 0, x = 0;
		String al = "ABCDEFGHIJKLMNOPQRSTUVWXZabcdefghijklmnopqrstuvwxz ", voy = "aeiouy", c;
			
		System.out.println("Ecrivez un mot / phrase");
		c = Clavier.lireLigne();
		for(int i = 0; i < c.length(); i++){
			e = c.charAt(i);
			f = al.indexOf(e);
			if ( f == -1){
				x = 1;
				if (x == 1){
				System.out.println("Votre mot / phrase n'est pas bon, recommencez");
				System.out.println("Faites attention les caractères spéciaux ne sont pas acceptés dans le programme");
				c = Clavier.lireLigne();
				}
			}
			else {
				n2 = voyelle(c, al, voy);
			}
	
		}
		System.out.println("Il y a " +n2+ " voyelles dans le mot / phrase");
	}
	public static int voyelle(String c, String al, String voy){
		int n = 0, m = 0;
		char d = 0;
			for (int i2 = 0; i2 < c.length(); i2++){
				d = c.charAt(i2);
				m = voy.indexOf(d);
				if(m != -1){
					n = n + 1;
				}
			}
			return n;
		}

}
