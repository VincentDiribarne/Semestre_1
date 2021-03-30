package file;

public class testFile {

        public static void main(String[] args) {

            try {
                File f = new FileParChainage();

                for(int i = 0; i <= 5; i++){
                    f.enfiler(new Integer(i));
                }

                while(!f.fileVide()) {
                    System.out.println(" " + f.defiler());
                }
            } catch (FileVideException e) {
                System.out.println("La file est Vide");
            }
        }
}
