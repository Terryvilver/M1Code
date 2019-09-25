/*Compléter le programme ci-dessous afin que sa compilation puisse avoir lieu sans erreur.
	public class essai {
		public void main(String[] args) {
			Scanner clavier = new Scanner(System.in)
			System.out.print("entrer une valeur entière : ");
			i=clavier.nextInt();
			System.out.println("le résultat du calcul est " + i*Math.PI);
		}
	}
*/

import java.util.Scanner;

public class Essai{
		public static void main(String[] args)
		{
				Scanner clavier = new Scanner(System.in);
				
				System.out.println("Entrer une valeur entière : ");
				int i =clavier.nextInt();
				
				System.out.println("Le résultat du calcul est " +i*Math.PI);
		}
		
		/*Ici, il suffisait de rajouter la bibliotheque scanner qui était 
		 * absent dans le code précédent.
		 * Abscence du ";" à la ligne 4.
		 * Absence du "}" pour refermer la classe Essai.
		 * les classes sont déclarés avec un majuscule.
		 */
	
}
