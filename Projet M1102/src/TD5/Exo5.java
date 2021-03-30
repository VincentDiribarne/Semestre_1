package TD5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import TD1.Clavier;

public class Exo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String nomFich = "toto.txt";
		String nomFich1 = "tutu.txt";
		String nomFich2 = "tata.txt";
		String texte = "";
		
		PrintWriter f = new PrintWriter (new FileWriter (nomFich2));
		System.out.println("Mettez ce que vous voulez");
		texte = Clavier.lireLigne();
		f.println(texte);
		f.close();
		
		BufferedReader f1 = new BufferedReader (new FileReader (nomFich));
		BufferedReader f2 = new BufferedReader (new FileReader (nomFich2));
		PrintWriter c = new PrintWriter (new FileWriter (nomFich1));
		while (f1.ready()){
			c.println(f1.readLine());
		}
		f1.close();
		while(f2.ready()){
			c.println("");
			c.println(f2.readLine());
		}
		f2.close();
		c.close();
	}
}
