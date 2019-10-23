public class TestCompteur {   
    public static void main(String []args) {
        Compteur c1 = new Compteur();
        System.out.print(c1 + " ");

        c1.incrementation(80); 
        System.out.print(c1 + " ");

        c1.decrementation(20).decrementation(20).decrementation(20); //Utilisation de methode en cascade
        System.out.print(c1 + " ");
    }
}
