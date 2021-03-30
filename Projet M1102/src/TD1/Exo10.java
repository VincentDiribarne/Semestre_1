package TD1;

public class Exo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double prixHT, taux, prixTTC, nbArticle;
		prixHT = 0;
		taux = 0;
		prixTTC = 0;
		nbArticle = 0;
		
		System.out.println("Donnez une valeur pour le taux");
		taux = Clavier.lireDouble();
		System.out.println("Donnez le nombre d'article");
		nbArticle = Clavier.lireDouble();
		System.out.println("Donnez le prix hors taxe");
		prixHT = Clavier.lireDouble();
		System.out.println("Vous avez saisi une valeur de " +taux+  " pour le taux, " +nbArticle+ " pour le nombre d'Article, " +prixHT+ " pour le prix Hors taxe");
		prixTTC = (prixHT + prixHT * taux)+nbArticle;
		System.out.println("donc votre prix TTC pour vos articles est de : " +prixTTC);
	}

}
