import java.util.*;

public class CompteBanquaire {
    private String nom;
    private int jour;
    private int mois;
    private int annee;
    private int solde;
    private static int nb_de_comptes_crees_ = 0;

    CompteBanquaire() {
            nom = "";
            jour = 0;
            mois = 0;
            annee = 0;
            solde = 0;
            nb_de_comptes_crees_++;
        }

    CompteBanquaire(String nom, int jour, int mois, int annee, int solde) {
        this.nom = nom;
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.solde = solde;
        nb_de_comptes_crees_++;
    }

    public String toString() {
        return this.nom + ";ouvert le " + this.jour + "/" + this.mois + "/" + this.annee + ";solde " + this.solde;
    }

    public static void main(String []args) {
        CompteBanquaire a = new CompteBanquaire("jlb",12,5,2013,1000);
        System.out.println(a);
    }
}