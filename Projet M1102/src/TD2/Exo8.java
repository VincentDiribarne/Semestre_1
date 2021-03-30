package TD2;

public class Exo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n, i;
		i = 0;
		n = 0;
		
		while (i <= 3)
		{
			for(int j = 0; j <= i; j++)
			{
				n = n + 1;
			}
		i = i + 1;
		}
		System.out.println("Voici le nombre n : " +n);
	}

}
