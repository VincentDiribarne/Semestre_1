package pile;

public class PileParTableau implements Pile {

    private int TAILLEMAX = 100;
    private int sommet;
    private Object [] tableau;

    public PileParTableau(int T){
        TAILLEMAX = T;
        sommet = - 1;
        tableau = new Object[TAILLEMAX];
    }

    //Constructeurs

    @Override
    public boolean pileVide() {
        return (sommet == -1);
    }

    @Override
    public boolean pilePleine() {
        return (sommet == TAILLEMAX - 1);
    }

    @Override
    public int longueur() {
        return (sommet + 1);
    }

    @Override
    public Object sommet() throws PileVideException {

        if (!pileVide()){
            return (tableau [sommet]);
        }
        else {
            throw new PileVideException();
        }
    }

    @Override
    public void empiler(Object element) throws PilePleineException {
        if (pilePleine()){
            throw new PilePleineException();
        }
        else {
            sommet = sommet + 1;
            tableau[sommet] = element;
        }
    }

    @Override
    public Object depiler() throws PileVideException{
        Object elem;
        if (pileVide()){
            throw new PileVideException();
        }
        else {
            elem = tableau[sommet];
            sommet = sommet - 1;
            return elem;
        }
    }
}