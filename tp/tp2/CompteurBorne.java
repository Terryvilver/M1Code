import java.util.*;

public class CompteurBorne extends Compteur {
    /* Constructeur */
    CompteurBorne() {
        super();
    }

    CompteurBorne(int compte) {
        super(compte);
    }

    /* Accesseur */
    public int getCompte() {
        return super.compte;
    }
    /* Methode */
    public void incrementation() {
        while(super.compte < 60)
            super.compte++;
    }
}