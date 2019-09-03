/* Ecrire un programme qui saisit deux notes et 
affiche la plus grande de ces deux notes.
*/

import java.util.Scanner;

public class PlusGrandeNote{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Moyenne 1 : ");
        int a = scan.nextInt();

        System.out.println("Moyenne 2 : ");
        int b = scan.nextInt();

        System.out.print("\n");

        if(a > b)
            System.out.println(a + " est le plus grand nombre.");
        else
            System.out.println(b + " est le plus grand nombre.");
    }
}