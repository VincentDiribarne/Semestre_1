package TD4;

import TD1.Clavier;

public class Exo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c, phraseCode = "", al = "ABCDEFGHIJKLMNOPQRSTUVWXYZ", al2 = "abcdefghijklmnopqrstuvwxyz";
		int i, min;
		char b, d, d2;
		
		System.out.println("Ecrivez une phrase à encodé");
		c = Clavier.lireLigne();
			for(i = 0; i < c.length(); i++){
				b = c.charAt(i);
				min = al.indexOf(b);
				if (min == -1){
					al2 = al.toLowerCase();
					if (b == ' '){
						phraseCode = phraseCode + ' ';
					}
						else {
							for (int i2 = 0; i2 < al2.length(); i2++){
								d = al2.charAt(i2);
									if (b == d){
										if (i2 == al2.length()-1){
											phraseCode = phraseCode +al2.charAt(0);
										}
										else {
											phraseCode = phraseCode +al2.charAt(i2+1);
										}
									}
								}
							}
					}
				if (b == ' '){
					phraseCode = phraseCode + ' ';
				}
				else{
					for (int i2 = 0; i2 <al.length(); i2++){
						d2 = al.charAt(i2);
						if (b == d2){
							if (i2 == al.length()-1){
								phraseCode = phraseCode + al.charAt(0);
							}
							else {
								phraseCode = phraseCode + al.charAt(i2+1);
							}
						}
					}
				}
			}
			System.out.println(phraseCode);
			
		}
	
	}

