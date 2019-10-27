/* Programmer la classe Compteur ci-dessus en Java. On écrira en outre une petite classe de test qui :
1. créera un compteur et affichera sa valeur ;
2. l’incrémentera 10 fois, puis affichera à nouveau sa valeur ;
3. le décrémentera 20 fois, puis affichera une troisième fois sa valeur.
L’affichage de ce programme doit donner (quelque chose comme) "0 10 0". */
import java.util.*;

public class Compteur {
    protected int compte = 0; 
    protected int ss;
    protected int mm;
    protected int hh;

    /* Constructeur */
    public Compteur() {
        compte = 0;
        ss = 0;
        mm = 0;
        hh = 0;
    }
    
    public Compteur(int hh, int mm, int ss) {
        this.hh = hh;
        this.mm = mm;
        this.ss = ss;
    }
    
    public Compteur(int compte) {
        this.compte = compte;
    }

    /* Getter */
    public int getCompte() {
        return this.compte;
    }

    /* Methode d'instance  */
    public Compteur incrementation(int a) {
        for(int i = 1; i <= a; i++)
            this.compte++;
        return this; //il faut retourner la classe correspondante pour utiliser les compteurs en cascade.
    }

    public Compteur decrementation(int a) {
        for(int i = 1; i <= a; i++) {
            if(this.compte == 0) {

            }
            else 
                this.compte--;
        }
        return this; //il faut retourner la classe correspondante pour utiliser les compteurs en cascade.
    }

    /* Affichage */
    public String toString() {
        return "" + compte;
    }
}
