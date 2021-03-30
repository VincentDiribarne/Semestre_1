package TD4;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, a = 0;
		
		for (i = 1; i <= 20; i++){
			a = Math.floorMod(i, 2);
			if (a == 0){
				System.out.println(+i+ " est pair");
			}
		}
	}

}
