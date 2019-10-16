/* Compléter la classe Rationnel en y ajoutant deux méthodes permettant de faire la somme et la multiplication
de deux rationnels.
*/

import java.util.*;

public class Rationnel {
    private int num;
    private int den;

    /* Constructeur */
    Rationnel() {
        num = 0;
        den = 0;
    }

    Rationnel(int num, int den) {
        this.num = num;
        this.den = den;
    }

    Rationnel(int num) {
        this.num = num;
        this.den = 1;
    }

    /* Getters */
    public int getNumerateur() {
        return this.num;
    }

    public int getDenominateur() {
        return this.den;
    }

    /* Setters */
    public void setNumerateur(int num) {
        this.num = num;
    }

    public void setDenominateur(int den) {
        this.den = den;
    }

    public String toString() {
        return this.num + "/" + this.den;
    }

    /* Autre methode */
    public Rationnel plus(Rationnel a) {
        Rationnel resultat = new Rationnel();
        resultat.den = a.den * this.den;
        resultat.num = this.num + (a.num*resultat.den);
        return resultat;
    }

    public Rationnel fois(Rationnel a) {
        Rationnel resultat = new Rationnel();
        resultat.den = a.den * this.den;
        resultat.num = this.num * a.num;
        return resultat;
    }

    public static void main(String []args) {
        Rationnel a = new Rationnel(1,2);
        Rationnel b = new Rationnel(2);
        Rationnel c = new Rationnel();

        System.out.println(a);
        System.out.println(a.getNumerateur());
        System.out.println(a.getDenominateur());

        c.setNumerateur(1);
        c.setDenominateur(5);

        System.out.println(c);
        c = a.plus(b); System.out.println(c);
        c = a.fois(b); System.out.println(c);
    }
}