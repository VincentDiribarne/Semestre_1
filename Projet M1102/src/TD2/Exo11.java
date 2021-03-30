package TD2;

import TD1.Clavier;

public class Exo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age, age2;
		age = 0;
		
		System.out.println("Quel est l'age de votre enfant ?");
		age = Clavier.lireInt();
		
		if (age < 0)
		{
			System.out.println("Recommencez, un nombre négatif ne peux pas correpondre à un âge");
			age = Clavier.lireInt();
		}
		
		if (age > 18)
		{
			System.out.println("Vous êtes un adulte, ce test est fait pour les enfants, recommencez");
			age = Clavier.lireInt();
		}
		
		if (age < 6)
		{
			age2 = 6 - age;
			System.out.println("Votre enfant est trop jeune, attendez encore " +age2+ " ans");		
		}
		if ((age >= 6) && (age<=7))
		{
			System.out.println("Votre enfant est dans la catégorie Poussin");
		}
		if ((age >= 8) && (age <= 9))
		{
			System.out.println("Votre enfant est dans la catégorie Pupille");
		}
		if ((age >= 10) && (age <= 11))
		{
			System.out.println("Votre enfant est dans la catégorie Mimine");
		}
		if ((age >= 12) && (age <= 18))
		{
			System.out.println("Votre enfant est dans la catégorie des Cadets");
		}
	}
}
