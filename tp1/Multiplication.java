/* Écrire un programme qui affiche le résultat de la multiplication 
 * d’un entier et d’un réel saisis préalablement au clavier */

import java.util.Scanner;

public class Multiplication{
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int entier = 0;
		float flottant = 0;
		
		System.out.println("Entrez un entier. ");
		entier = scan.nextInt();
		System.out.println("Entrez un réel. ");
		flottant = scan.nextFloat();
		
		System.out.println( entier + " x " + flottant + " = " + entier*flottant);
		
	}
	
}
