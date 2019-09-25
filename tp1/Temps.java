/* Écrire un programme qui acquiert deux temps exprimés sous la forme 
 * hh/mm/ss et affiche comme résultat leur somme.
 */
import java.util.Scanner;
 
public class Temps{
	
	public static void main (String []args){
		Scanner scan = new Scanner(System.in);

		int hh[] = new int[2];
		int mm[] = new int[2];
		int ss[] = new int[2];
		
		for(int i = 0; i < hh.length; i++)
		{
			System.out.println("Entrez l'heure : ");
			hh[i] = scan.nextInt();
			System.out.println("Entrez les minutes : ");
			mm[i] = scan.nextInt();
			System.out.println("Entrez les secondes: ");
			ss[i] = scan.nextInt();
		}	
	}
}
