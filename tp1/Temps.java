/* Écrire un programme qui acquiert deux temps exprimés sous la forme 
 * hh/mm/ss et affiche comme résultat leur somme.
 */
import java.util.Scanner;


 
public class Temps{
	
	public static void main (String []args){
		Scanner scan = new Scanner(System.in);

		int hh[] = new int[3];
		int mm[] = new int[3];
		int ss[] = new int[3];

		int retenuMin, retenuSec;

		for(int i = 0; i < hh.length; i++)
		{
			if(i < 2)
			{
				System.out.print("Entrez l'heure ( numéro " + (i+1) + " ) : ");
				hh[i] = scan.nextInt();
				System.out.print("Entrez les minutes ( numéro " + (i+1) + " ) : ");
				mm[i] = scan.nextInt();
				System.out.print("Entrez les secondes ( numéro " + (i+1) + " ) : ");
				ss[i] = scan.nextInt();
			}
			else
			{
				retenuSec = ( ss[0] + ss[1] ) / 60;
				ss[2] = ( ss[0] + ss[1] ) - ( retenuSec * 60 );

				retenuMin = ( mm[0] + mm[1] ) / 60;
				mm[2] = ( mm[0] + mm[1] + retenuSec ) - ( retenuMin * 60 );

				hh[2] = ( hh[0] + hh[1] + retenuMin );
			}
		}
		System.out.println("Temps additionné : " + hh[2] + "/" + mm[2] + "/" + ss[2]);
	}
}
