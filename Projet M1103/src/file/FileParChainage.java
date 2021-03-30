package file;

public class FileParChainage implements File {
    private int nbElem;
    Noeud tete, queue;

    //Contructeurs

    @Override
    public boolean fileVide() {
        if (nbElem == 0){
            return(true);
        }
        else {
            return (false);
        }
    }

    @Override
    public boolean filePleine() {
        return false;
    }

    @Override
    public int longueur() {
        return (nbElem);
    }

    @Override
    public Object premier() throws FileVideException {
        Object res;
        if (fileVide()){
            throw new FileVideException();
        }
        else {
            res = tete.valeur;
            return(res);
        }
    }

    @Override
    public void enfiler(Object element) {
        Noeud n = new Noeud();

        n.valeur = element;
        n.suivant = null;
        if (fileVide()){
            tete = n;
        }
        else {
            queue.suivant = n;
        }
        queue = n;
        nbElem++;
    }

    @Override
    public Object defiler() throws FileVideException {
        Object elem = null;

        if (fileVide()) {
            throw new FileVideException();
        }
        else {
            elem = tete.valeur;
        }
        tete = tete.suivant;
        nbElem--;
        return(elem);
    }
}
