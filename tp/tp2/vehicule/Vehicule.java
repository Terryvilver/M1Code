import java.util.*;

public class Vehicule {
    private String type;
    private float poids;
    private float ptac; //poids total autorisé en charge
    private int places;
    private static int vehicule_cree = 0;

    /* Constructeur */
    Vehicule() {
        type = "inconnu";
        poids = 0;
        ptac = 0; 
        places = 0;
        vehicule_cree++;      
    }

    Vehicule(String type, float poids, float ptac, int places) {
        this.type = type;
        this.poids = poids; // en tonne
        this.ptac = ptac; // en tonne
        this.places = places;
        vehicule_cree++;
    }

    /* Getters */
    public String getType() {
        return this.type;
    }

    public float getPvide() {
        return this.poids;
    }

    public float getPtac() {
        return this.ptac;
    }

    public int getPlaces() {
        return this.places;
    }

    public int getNbVehiculeCrees() {
        return this.vehicule_cree;
    }

    /* Setters */
    public void setType(String type) {
        this.type = type;
    }

    public void setPvide(float poids) {
        this.poids = poids;
    }

    public void setPtac(float ptac) {
        this.ptac = ptac;     
    }

    public void setPlaces(int places) {
        this.places = places;   
    }

    /* Affichage */
    public String toString() {
        return "(type: " + this.type + ";poids: " + this.poids + ";PTAC: " + this.ptac + ";places: " + this.places +")";
    }
    public static void main(String []args) {
        Vehicule a = new Vehicule("voiture", 1.2f, 1.9f, 5);
        System.out.println(a);

        Vehicule b = new Vehicule();
        System.out.println(b.getType());
        System.out.println(b.getPlaces());
        System.out.println(b.getPvide());
        System.out.println(b.getPtac());

        b.setType("Camion"); b.setPtac(15.9f); b.setPvide(2.f); b.setPlaces(2);
        System.out.println(b);
        System.out.println("nb_de_vehicules_crées_: " + a.getNbVehiculeCrees());

    }
}