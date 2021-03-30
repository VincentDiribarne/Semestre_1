package file;

public interface File {

    public boolean fileVide();                                              //Savoir si une pile est Vide

    public boolean filePleine();                                            //Savoir si une pile est pleine

    public int longueur();                                                  //Obtenir la longueur d'une pile

    public Object premier() throws FileVideException;                       //Determiner la valeur d'un sommet d'une pile

    //Modificateur

    public void enfiler (Object element);                                   //Empiler une valeur au sommet d'une pile

    public Object defiler() throws FileVideException;
}
