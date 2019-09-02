// Ecrire un programme qui saisit un entier et affiche s'il est pair ou impair. 

import java.util.Scanner;

public class PairImpair{
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Saisir un entier : ");
        int a = scan.nextInt();

        if(a % 2 == 0)
            System.out.println(a + " est un nombre pair.");
        else
            System.out.println(a + " est un nombre impair.");
    }
}