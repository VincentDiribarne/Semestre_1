package Projet;

import java.util.*;
import Projet.JeuVideo;
import java.io.*;


public class Ludotheque {

    public static void main(String[] args) {
        int sw;

        JeuVideo gtav = new JeuVideo("GTAV", "Action/Aventure", "Rockstar Games", 2013, 18);
        JeuVideo cyberpunk = new JeuVideo("CyberPunk 2077", "RPG", "CD Project Red", 2020, 10);
        JeuVideo witcher = new JeuVideo("The Witcher", "RPG", "CD Project Red", 2015, 19);

        List<JeuVideo> JV = new LinkedList<JeuVideo>();

        JV.add(gtav);
        JV.add(cyberpunk);
        JV.add(witcher);

        Collections.sort(JV, JeuVideo.compareGenre);

        Iterator<JeuVideo> it = JV.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        try {
            FileOutputStream fos=new FileOutputStream("listeJeux.jeu");
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject (JV);

            fos.close();
            oos.close();
        }
        catch(IOException e) {
            System.out.println("Fichiers non trouvés");
        }
    }
}