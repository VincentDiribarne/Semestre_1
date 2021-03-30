package TD1;

public class Exo13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a1, b1, c1, d1, e1, f, a2, b2, c2, d2, e2;
		a1 = 0;
		b1 = 0;
		c1 = 0;
		d1 = 0;
		e1 = 0;
		f = 0;
		a2 = 0;
		b2 = 0;
		c2 = 0;
		d2 = 0;
		e2 = 0;
		System.out.println("Donnez une valeur");
		a1 = Clavier.lireDouble();
		System.out.println("Donnez une valeur");
		b1 = Clavier.lireDouble();
		System.out.println("Donnez une valeur");
		c1 = Clavier.lireDouble();
		System.out.println("Donnez une valeur");
		d1 = Clavier.lireDouble();
		System.out.println("Donnez une valeur");
		e1 = Clavier.lireDouble();
		
		a2 = a1;
		b2 = b1;
		c2 = c1;
		d2 = d1;
		e2 = e1;
		
		a1 = b1;
		b1 = a2;
		System.out.println("A est de : " +a1);
		System.out.println("B est de : " +b1);
		System.out.println("C est de : " +c1);
		System.out.println("D est de : " +d1);
		System.out.println("E est de : " +e1);
		System.out.println(" ");
		
		f = b1;
		b1 = c1;
		c1 = f;
		System.out.println("A est de : " +a1);
		System.out.println("B est de : " +b1);
		System.out.println("C est de : " +c1);
		System.out.println("D est de : " +d1);
		System.out.println("E est de : " +e1);
		System.out.println(" ");
		
		c1 = a1 + b1;
		System.out.println("A est de : " +a1);
		System.out.println("B est de : " +b1);
		System.out.println("C est de : " +c1);
		System.out.println("D est de : " +d1);
		System.out.println("E est de : " +e1);
		System.out.println(" ");
		
		e1 = c1;
		c1 = e2;
		System.out.println("A est de : " +a1);
		System.out.println("B est de : " +b1);
		System.out.println("C est de : " +c1);
		System.out.println("D est de : " +d1);
		System.out.println("E est de : " +e1);
		System.out.println(" ");
		
		a1 = a2;
		b1 = b2;
		c1 = c2;
		d1 = d2;
		e1 = e2;
		System.out.println("A est de : " +a1);
		System.out.println("B est de : " +b1);
		System.out.println("C est de : " +c1);
		System.out.println("D est de : " +d1);
		System.out.println("E est de : " +e1);
	}

}
