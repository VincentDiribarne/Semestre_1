package TD5;

import java.io.*;
import TD1.Clavier;

public class Exo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String nomFich ="toto.txt";
		int n = 1;
		
		PrintWriter f = new PrintWriter (new FileWriter(nomFich));
		while(n != 0){
			System.out.println("Saisissez des valeurs");
			n =  Clavier.lireInt();
			f.println(+n+ " a/pour/carre/" +n*n);
		}
		f.close();
	}

}
