package pile;

import java.io.IOException;

public interface Pile {

    public boolean pileVide();                                             //Savoir si une pile est Vide

    public boolean pilePleine();                                           //Savoir si une pile est pleine

    public int longueur();                                                 //Obtenir la longueur d'une pile

    public Object sommet() throws PileVideException;                       //Determiner la valeur d'un sommet d'une pile

    //Modificateur

    public void empiler (Object element) throws PilePleineException;       //Empiler une valeur au sommet d'une pile

    public Object depiler() throws PileVideException;                      //Depiler la valeur du sommet d'une pile



}