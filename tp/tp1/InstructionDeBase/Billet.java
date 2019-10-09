/*Écrire un programme qui, pour une somme donnée en euro, 
affiche le nombre de billets qui la compose.
Exemple : 3287€ = 6*500€ + 1*200€ + 0*100€ + 1*50€ + 3*10€ + 1*5€ + 2€
*/
import java.util.Scanner;

public class Billet{

    public static void main(String []args)
    {
        int nombre;
        int []billet = {0, 0, 0, 0, 0, 0, 0};
        int []valeurBillet = {500, 200, 100, 50, 20, 10, 5};

        Scanner scan = new Scanner(System.in);

        System.out.print("Saisir un montant : ");
        nombre = scan.nextInt();

        System.out.print("\n");
        System.out.print(nombre);

        for(int i = 0 ; i < billet.length ; i++)
        {
            billet[i] = nombre / valeurBillet[i];
            nombre = nombre - (billet[i] * valeurBillet[i]);
        }

        System.out.print("€ = " + billet[0] + "*500€ + " + billet[1] + "*200€ + " + billet[2] + "*100€ + " + billet[3] + "*50€ + " + billet[4] + "*20€ + " + billet[5] + "*10€ + " + billet[6] + "*5€ + "+ nombre +"€." );
    }
}