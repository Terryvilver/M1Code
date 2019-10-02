/*Une adresse IP est une suite de 4 entiers compris entre 0 et 255 et 
 * séparés par des points (on parle de notation décimal pointée - par 
 * exemple 134.1.4.57 -). Écrire un programme qui saisit 4 entiers 
 * (on ne vérifiera pas que les valeurs saisies sont comprises entre 0 et 255) 
 * et les affiche sous la forme d’une adresse internet. 
 */

import java.util.Scanner;

public class AdresseIp{
	public static void main(String []args)
	{
			Scanner scan = new Scanner(System.in);
			int tab[] = new int[4];
			
			for(int i = 0; i < tab.length; i++)
			{
				System.out.print("Entrez l'entier " + i + " compris entre 0 et 255: ");
				tab[i] = scan.nextInt();
			}
			
			System.out.println(tab[0] + "." + tab[1] + "." + tab[2] + "." + tab [3]);
			
	}
}
