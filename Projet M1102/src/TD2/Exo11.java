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
			System.out.println("Recommencez, un nombre n�gatif ne peux pas correpondre � un �ge");
			age = Clavier.lireInt();
		}
		
		if (age > 18)
		{
			System.out.println("Vous �tes un adulte, ce test est fait pour les enfants, recommencez");
			age = Clavier.lireInt();
		}
		
		if (age < 6)
		{
			age2 = 6 - age;
			System.out.println("Votre enfant est trop jeune, attendez encore " +age2+ " ans");		
		}
		if ((age >= 6) && (age<=7))
		{
			System.out.println("Votre enfant est dans la cat�gorie Poussin");
		}
		if ((age >= 8) && (age <= 9))
		{
			System.out.println("Votre enfant est dans la cat�gorie Pupille");
		}
		if ((age >= 10) && (age <= 11))
		{
			System.out.println("Votre enfant est dans la cat�gorie Mimine");
		}
		if ((age >= 12) && (age <= 18))
		{
			System.out.println("Votre enfant est dans la cat�gorie des Cadets");
		}
	}
}
