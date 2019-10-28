import java.util.*;

public class CompteurBorne extends Compteur {
    /* Constructeur */
    private int nbr;

    CompteurBorne() {
        super();
        nbr = 0;
    }

    CompteurBorne(int compte) {
        super(compte);
        nbr = compte;
    }

    /* Accesseur */
    public int getCompte() {
        return this.nbr;
    }
    /* Methode */
    public void incrementation() {      
        if(this.nbr < 59)
            this.nbr++;
    }
}