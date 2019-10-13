package test;
import comptage.Compteur;

public class Test {   
    public static void main(String []args) {
        Compteur c1 = new Compteur();
        System.out.print(c1 + " ");

        c1.incrementation(10);
        System.out.print(c1 + " ");

        c1.decrementation(20);
        System.out.print(c1 + " ");
    }
}