/*Écrire un programme qui, pour une somme donnée en euro, 
affiche le nombre de billets qui la compose.
Exemple : 3287€ = 6*500€ + 1*200€ + 0*100€ + 1*50€ + 3*10€ + 1*5€ + 2€
*/
import java.util.Scanner;

public class Billet{

    public static int billet_500(int nombre)
    {
        return nombre / 500;
    }

    public static int billet_200(int nombre)
    {
        return nombre / 200;
    }

    public static int billet_100(int nombre)
    {
        return nombre / 100;
    }

    public static int billet_50(int nombre)
    {
        return nombre / 50;
    }

    public static int billet_20(int nombre)
    {
        return nombre / 20;
    }

    public static int billet_10(int nombre)
    {
        return nombre / 10;
    }

    public static int billet_5(int nombre)
    {
        return nombre / 5;
    }
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int nombre, nombreA;
        int b500, b200, b100, b50, b20, b10, b5;

        System.out.print("Saisir un montant : ");

        nombre = scan.nextInt();
        nombreA = nombre;

        b500 = billet_500(nombre);
        nombre = nombre - (b500 * 500);

        b200 = billet_200(nombre);
        nombre = nombre - (b200 * 200);

        b100 = billet_100(nombre);
        nombre = nombre - (b100 * 100);

        b50 = billet_50(nombre);
        nombre = nombre - (b50 * 50);
        
        b20 = billet_20(nombre);
        nombre = nombre - (b20 * 20);

        b10 = billet_10(nombre);
        nombre = nombre - (b10 * 10);

        b5 = billet_5(nombre);
        nombre = nombre - (b5 * 5);

        System.out.print("\n");
        System.out.print(nombreA + "€ = " + b500 + "*500€ + " + b200 + "*200€ + " + b100 + "*100€ + " + b50 + "*50€ + " + b20 + "*20€ + " + b10 + "*10€ + " + b5 + "*5€ + "+ nombre +"€." );
    }
}