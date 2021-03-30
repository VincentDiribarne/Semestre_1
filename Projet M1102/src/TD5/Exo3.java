package TD5;

import java.io.*;
import java.util.StringTokenizer;


public class Exo3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String nomFich = "toto.txt";
		int i, n = 0;
		
		BufferedReader f = new BufferedReader (new FileReader (nomFich));
		
		while(f.ready()){
			StringTokenizer tok = new StringTokenizer (f.readLine(), "/");
			n = tok.countTokens();
			for (i = 0; i < n; i++){
				System.out.print(tok.nextToken());
				System.out.print(' ');
			}
			System.out.println();
		}
		f.close();
	}

}
