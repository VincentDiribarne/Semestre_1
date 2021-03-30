package TD5;

import java.io.*;

public class Exo2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String nomFich = "toto.txt";
		
		BufferedReader f = new BufferedReader (new FileReader(nomFich));
		while (f.ready()) {
			System.out.println(f.readLine());
		}
		f.close();
	}

}
