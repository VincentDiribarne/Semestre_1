package GestionVoitureGaragiste;
import java.io.*;

public class GestionVoituresGaragiste {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	try {
		int sw;
		double prix, moyenne;
		String nomFich = "Gestion Voiture.txt"; 										//Nom du fichier txt utilisé
		System.out.println("Bienvenue dans le programme de Gestion de Voitures pour Garagiste !");
		do {
			menu(); 																	//Procedure affiche le menu
			sw = Clavier.lireInt();
			switch (sw) {																//Choix entre 0 et 7
				case 1:
					ajoutVoit(nomFich); 												//Procedure pour ajouter une voiture
					break;
				case 2:
					prix = prixVoit(nomFich);											//Fonction pour afficher le prix d'une voiture
					System.out.println(String.format("Le prix est %2.2f euros", prix));	//Donne le prix avec deux nombres apres la virgule
					break;
				case 3:
					moyenne = prixMoy(nomFich);											//Fonction pour afficher la moyenne
					if (moyenne != 0){
						System.out.println(String.format("La moyenne est de %2.2f euros", moyenne)); //Donne le prix avec deux nombres apres la virgule
					}
					else{
						System.out.println("Modele inexistant");
					}
					break;
				case 4:
					prixMinprixMax(nomFich);						//Procedure pour afficher un vehicule en fonction de PrixMin, Max
					System.out.println(" ");
					break;
				case 5:
					affVoit(nomFich);													//Procedure afficher toutes les voitures
					break;
				case 6:
					modifPrix(nomFich);													//Procedure modifier le prix
					break;
				case 7:
					suppVoit(nomFich);													//Procedure supprimer le prix
					break;
				case 0:
					System.out.println(" ");
					System.out.println("Merci d'avoir utiliser ce programme !");		//Fin du programme
					break;
				default:
					System.out.println("Le nombre donne ne permet pas d'acceder a la suite du programme");
									//Si l'utilisateur saisit une autre valeur que 0 a 7, alors le programme recommence
			}
		} while (sw != 0);
	}
		catch (NumberFormatException e){										//Tranforme le message d'erreur
			System.out.println(" ");
			System.out.println("Saisir un chiffre compris entre 0 et 7");
		}
	}


	private static void menu() { 													//Procedure menu
		System.out.println(" ");
		System.out.println("1 : Ajouter une voiture dans un fichier");
		System.out.println("2 : Afficher le prix d'une voiture");
		System.out.println("3 : Afficher le prix moyen d'un modele");
		System.out.println("4 : Affiche les voitures dont le prix est compris entre deux valeurs PrixMin et PrixMax");
		System.out.println("5 : Afficher toutes les voitures");
		System.out.println("6 : Modifier le prix d'une voiture");
		System.out.println("7 : Supprimer une voiture");
		System.out.println("0 : Quitter le programme");
		System.out.print("Votre reponse SVP :");
	}

	private static void ajoutVoit(String nomFich) throws IOException {					//Procedure Ajout Voiture

		PrintWriter f = new PrintWriter(new FileWriter(nomFich, true));

		String r = question("Constructeur", 30, 1);						//Appel fonction question
		int e = compteEspace(30, r.length());										//Appel fonction compteEspace
		f.print(r + " ");
		for (int i = 0; i < e; i++) {
			f.print(" ");
		}

		String r2 = question("Modele", 20, 1);								//Appel fonction question
		int e2 = compteEspace(20, r2.length());									//Appel fonction compteEspace
		f.print(r2 + " ");
		for (int i = 0; i < e2; i++) {
			f.print(" ");
		}

		String r3 = question("Type", 10, 1);								//Appel fonction question
		int e3 = compteEspace(10, r3.length());									//Appel fonction compteEspace
		f.print(r3 + " ");
		for (int i = 0; i < e3; i++) {
			f.print(" ");
		}

		String r4 = question("Immatriculation", 12, 3);					//Appel fonction question
		int e4 = compteEspace(12, r4.length());									//Appel fonction compteEspace
		f.print(r4 + " ");
		for (int i = 0; i < e4; i++) {
			f.print(" ");
		}

		String r5 = question("Annee", 4, 2);								//Appel fonction question
		int e5 = compteEspace(4, r5.length());										//Appel fonction compteEspace
		f.print(r5 + " ");
		for (int i = 0; i < e5; i++) {
			f.print(" ");
		}

		String r6 = question("Prix", 10, 2);								//Appel fonction question
		int e6 = compteEspace(10, r6.length());									//Appel fonction compteEspace
		f.print(r6 + " ");
		for (int i = 0; i < e6; i++) {
			f.print(" ");
		}

		String r7 = question("Carburant", 10, 1);							//Appel fonction question
		f.print(r7);

		System.out.println("Vos reponses ont bien ete enregistrees");

		f.println(" ");																	//Ecrire dans le fichier
		f.flush();
		f.close();
	}

	private static String question(String q, int max, int vald) throws IOException {	//Fonction String question
		String nomFich = "Gestion Voiture.txt";
		int b, e, e1 = 0;
		boolean ok = false;
		String reponse = " ";

		while (!ok) {
			System.out.print(q + " : ");                                    //Demande q pour pour poser la question
			reponse = Clavier.lireLigne();
			b = reponse.length();
			if (max < b) {
				System.out.println(q + " a depasse le nombre de caractere maximum (" + max + "), recommencez !");
				continue;
			}

			if (vald == 1) {                                        //Verification caractere interdit dans les reponses au question
				String al = "AZERTYUIOPMLKJHGFDSQWXCVBNazertyuiopmlkjhgfdsqwxcvbn012345789";
				for (int i = 0; i < b; i++) {
					e = reponse.charAt(i);
					e1 = al.indexOf(e);
				}
			}

			if (vald == 2) {                                        //Verification caractere interdit dans les reponses au question
				String chiffre = "0123456789";
				for (int i = 0; i < b; i++) {
					e = reponse.charAt(i);
					e1 = chiffre.indexOf(e);
				}
			}

			if (vald == 3) {                                        //Verification caractere interdit dans les reponses au question
				String al1 = "AZERTYUIOPMLKJHGFDSQWXCVBN0123456789";
				reponse = reponse.toUpperCase();
				for (int i = 0; i < b; i++) {
					e = reponse.charAt(i);
					e1 = al1.indexOf(e);
				}
			}
			if (e1 == -1) {                                            //Si IndexOf donne -1 alors c'est faux
				System.out.println("Vous avez utilise des caracteres interdits pendant votre saisie, recommencez !");
				continue;
			}
			ok = true;
		}
		return reponse;												//Retour de reponse pour que le programme puisse l'utiliser
	}

	private static int compteEspace(int max, int b) {				//Fonction int qui compte les espaces manquant pour les reponses

		return max - b;
	}

	private static double prixVoit(String nomFich) throws IOException {			//Fonction double PrixVoit
		double prix2, min = 0;
		String prix;
		BufferedReader f = new BufferedReader(new FileReader(nomFich));


		String r = question("Modele", 20, 1);						//Appel Fonction question
		String r2 = question("Annee", 4, 2);						//Appel Fonction question


		while (f.ready()) { 									//Si f n'est pas vide et tant que la ligne suivant est pas nulle
			String val = f.readLine();							// Lire la ligne

			if (val.contains(r) && val.contains(r2)) { 			//Recherche le modele et l'année dans le programme
					prix = val.substring(81, 91);				// Si il trouve le modele et l'annee, il note le prix
					prix2 = remplacement(prix); 				//Appel fonction Remplacement
					if (min == 0) {
						min = prix2;
					}
					if (min > prix2) {							//Donne le prix minimum
						min = prix2;
					}
			}
		}

		if (min == 0) { 										//Si il n'y a pas de correspondance
			System.out.println(" ");
			System.out.println("Le fichier n'a trouve aucune correspondance");
		}

		f.close();
		return min;												//Retour du prix minimum
	}

	private static double prixMoy(String nomFich) throws IOException { 		//Fonction double PrixMoyen
		String prix, line = " ";
		double moy, prixmax = 0, prix2, n = 1;
		BufferedReader f = new BufferedReader(new FileReader(nomFich));

		String r = question("Modele", 20, 1);					//Appel fonction Question

		while (f.ready()) {
			line = f.readLine();
			if (line.contains(r)) {
				prix = line.substring(81, 91);
				prix2 = remplacement(prix);									//Appel fonction Remplacement
				prixmax = prixmax + prix2;									//Addition des prix correspondants au modele
				n++;
			}
		}
		moy = prixmax / n;													//Calcul Moyenne

		f.close();
		return (double) (moy); 												//Retour de la moyenne en le castant en double
	}

	private static void prixMinprixMax(String nomFich) throws IOException {		//Procedure PrixMin, Max
		String line, reponse = " ", modele;

		String r = question("Valeur Minimale", 10, 2);					//Appel fonction Question
		int min = remplacement(r);										//Appel fonction Remplacement

		String r2 = question("Valeur Maximale", 10, 2);					//Appel fonction Question
		int max = remplacement(r2);										//Appel fonction Remplacement

		if (max < min) {												//Donne la valeur maximale
			int temp = min;
			min = max;
			max = temp;
		}
		System.out.println(" ");

		BufferedReader f = new BufferedReader(new FileReader(nomFich));
		System.out.println("Les vehicules compris entre " +min+ " et " +max+ " euros sont :");
		while ((line = f.readLine()) != null) {							//lire la ligne tant que different de null
			reponse = line.substring(81, 91);							//Recherche entre 81 et 91 les prix
			int converti3 = remplacement(reponse);						//Appel fonction remplacement
			if ((min <= converti3) && (max > converti3)) {				//Si la reponse est comprises entre prixMin et Max
				modele = line.substring(31, 51);						//Lire le modele
				modele = modele.replace(" ", ""); 						//Remplace les espaces
				System.out.print(modele + " ");							//Ecrit le(s) modele(s)
			}
		}
		f.close();
	}

	private static int remplacement(String reponse) {					//Fonction int remplacement


		reponse = reponse.replace(" ", ""); 							//Enleve les espaces
		int converti = Integer.parseInt(reponse); 						//Converti le String en Int

		return (converti);
	}

	private static void affVoit(String nomFich) throws IOException {	//Procedure Afficher les voitures
		String modele;
		BufferedReader f = new BufferedReader(new FileReader(nomFich));
		System.out.println("Voici les voitures presentes dans la base de donnees : ");
		while (f.ready()) {
			modele = f.readLine();										//Lit les voitures
			System.out.println(modele);									//Imprime les voitures
		}
		f.close();
	}

	private static void modifPrix(String nomFich) throws IOException {	//Procedure modifier le prix
		String tab[];
		int numLine = 0, lignePlaque = 0;
		int i = 0;
		String line;

		int n = nombreTableau(nomFich);									//Appel fonction nombreTableau
		tab = new String[n];											//Redimension du tableau

		BufferedReader f = new BufferedReader(new FileReader(nomFich));
		while (f.ready()) {
			line = f.readLine(); 										//Lire les lignes
			tab[i] = line;												//Ecrire les lignes dans le tableau
			i++;
		}
		f.close();

		f = new BufferedReader(new FileReader(nomFich));
		String r = question("Immatriculation", 12, 3); 	//Appel fonction Question
		while (f.ready()) {
			line = f.readLine();
			numLine++;
			if (line.substring(62, 74).trim().equalsIgnoreCase(r)) { 	//Cherche l'immatriculation entre les caracteres 62 et 74 en supprimant les espaces
				lignePlaque = numLine; 									//Donne la ligne ou la plaque est trouvée
			}
		}
		f.close();
		if(lignePlaque == 0){											//Cherche si une plaque est trouvée
			System.out.println("Saisissez une plaque existante");
			return ;
		}

		String r2 = question("Nouveau Prix", 10, 2);		//Appel fonction question

		PrintWriter f3 = new PrintWriter(new FileWriter(nomFich));
		int e = compteEspace(10, r2.length()); 					//Appel fonction compteEspace
		String espace = "";
		for (int j = 0; j < e; j++) {
			espace = espace + " ";								//Il ajoute le nombre d'espace manquant pour atteindre 10 caractères pour le prix
		}
		tab[lignePlaque - 1] = tab[lignePlaque - 1].replace(tab[lignePlaque - 1].substring(81, 91), r2 + espace);
		//Il prend la ligne de la plaque, lui enleve 1 pour trouver la bonne ligne. Ensuite, il remplace l'ancien prix par le nouveau et rajoute les espaces
		for (int o = 0; o < tab.length; o++) {
			f3.println(tab[o]); 			//Ecrit les nouvelles lignes du tableau dans le fichier
		}
		f3.close();
		System.out.println("Votre prix a bien ete modifie");
	}

	private static void suppVoit(String nomFich) throws IOException { 	//Procedure Suppression Vehicule

	try{
		String tab[], line, tab2[];
		int i = 0;
		int n = nombreTableau(nomFich); 								//Appel fonction nombreTableau
		tab = new String[n];											//Redimension du tableau

		BufferedReader f = new BufferedReader(new FileReader(nomFich));
		String r = question("Immatriculation", 12, 3);					//Appel fonction Question
		while (f.ready()) {
			line = f.readLine();										//Lire les lignes
			tab[i] = line;												//Ecrire les lignes dans le tableau
			i++;

		}
		f.close();

		tab2 = new String[n-1];											//Redimension d'un deuxième tableau en n-1 car on souhaite retirer une valeur
		i = 0;
		for (int u = 0; u < tab.length;u++) {							//Boucle for avec le nombre de ligne du tableau
			if (!tab[u].substring(62, 74).trim().equalsIgnoreCase(r)){	//Cherche une plaque et enleve les espaces, si elle est trouvé, elle n'est pas écrite dans le tableau
				tab2[i] = tab[u]; 										//Réecrire le premier tableau dans le second sans la ligne avec la plaque juste
				i++;
			}
		}

		PrintWriter f2= new PrintWriter(new FileWriter(nomFich));
		for (int o = 0; o < tab2.length; o++) { 						//Boucle for avec le nombre de ligne du tableau
			f2.println(tab2[o]);										//Ecrit le tableau dans la fonction
		}
		f2.close();
		System.out.println("Votre vehicule a bien ete supprime");
	}
		catch(ArrayIndexOutOfBoundsException e){						//Transforme le message de l'erreur
			System.out.println(" ");
			System.out.println("Saisissez une plaque existante");
		}
	}

	private static int nombreTableau(String nomFich) throws IOException { 	//Fonction int nombreTableau
		int n = 0;
		BufferedReader f = new BufferedReader(new FileReader(nomFich));
		while (f.ready()) {
			f.readLine(); 											//Lire la nombre de ligne
			n++;													//Augmenter de 1 a chaque fois que l'on passe à la ligne suivante
		}
		f.close();
		return n;													//Retournez n (le nombre de ligne)
	}
}
