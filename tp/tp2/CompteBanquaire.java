import java.util.*;

public class CompteBanquaire {
    private String nom;
    private int jour;
    private int mois;
    private int annee;
    private int montant;
    private static int nb_de_comptes_crees_ = 0;

    CompteBanquaire() {
            nom = "";
            jour = 0;
            mois = 0;
            annee = 0;
            montant = 0;
            nb_de_comptes_crees_++;
        }

    CompteBanquaire(String nom, int jour, int mois, int annee, int montant) {
        this.nom = nom;
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
        this.montant = montant;
        nb_de_comptes_crees_++;
    }

    /* Getters */
    public int getMontant() {
        return this.montant;
    }

    public String getDateOuverture() {
        return this.jour + "/" + this.mois + "/" + this.annee;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbComptesCrees() {
        return this.nb_de_comptes_crees_;
    }

    /* Setters */
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDateOuverture(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    /*toString */

    public String toString() {
        return this.nom + ";ouvert le " + this.jour + "/" + this.mois + "/" + this.annee + ";solde " + this.montant + "€";
    }

    public static void main(String []args) {
        CompteBanquaire a = new CompteBanquaire("jlb",12,5,2013,1000);
        System.out.println(a);

        CompteBanquaire stud = new CompteBanquaire ();
        stud.setNom("marcel"); stud.setDateOuverture(2,3,2013); stud.setMontant(1000);
        System.out.println(stud.getNom());
        System.out.println(a.getDateOuverture());
        System.out.println(a.getMontant());
        System.out.println("nb_de_comptes_crées_:" + a.getNbComptesCrees());
    }
}