package Projet;

import java.io.*;
import java.util.*;

public class LectureLudo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        List<JeuVideo> listeJV = new LinkedList<JeuVideo>();
        try {

            FileInputStream f1 = new FileInputStream("listeJeux.dat");

            ObjectInputStream ois=new ObjectInputStream(f1);
            listeJV=(List<JeuVideo>) ois.readObject();

            f1.close();
            ois.close();

        }catch(IOException | ClassNotFoundException e) {
                System.out.println("  A  ");
        }

        Iterator<JeuVideo> it = listeJV.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
