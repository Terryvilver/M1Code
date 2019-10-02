/*Écrire un programme qui affiche 
 * la moyenne pondérée de trois nombres réels saisis au clavier.
 * Vous traiterez les deux cas suivants :
 * (a) les pondérations respectives sont fixées dans le programme ;
 * (b) les pondérations respectives sont saisies dans le programme
 */
 import java.util.Scanner;
 import java.text.DecimalFormat;
 
public class Moyenne{
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		double tab[] = {15, 16, 18};
		double moyenne = (tab[0] + tab[1] + tab[2]) / 3;
		
		System.out.println("(a)");
		
		System.out.println("La moyenne est de " + df.format(moyenne) + ".");
		
		System.out.println("(b)");
		
		for(int i = 0; i < tab.length; i++)
		{
			System.out.println("Entrer l'entier numéro " + i + ".");
			tab[i] = scan.nextDouble();
		}
		
		moyenne = (tab[0] + tab[1] + tab[2]) / 3;
		System.out.println("La moyenne est de " + df.format(moyenne) + ".");
	}
}
