/* Écrire un programme composé des instructions suivantes :
 * k=1.4,k=k+2,k=k*9,k=k/6;
 * et System.out.println("la valeur de k est " + k);
 * Sachant que k est une variable de type double, quelle sera la valeur 
 * affichée à la fin du programme ? Et si k avait été une variable de 
 * type int ?
 */

public class ProgramK{
		public static void main(String []args)
		{
			double k;
			
			k = 1.4;
			k = k + 2;
			k = k * 9;
			k = k / 6;
			
			System.out.println("La valeur de k est " + k);
			/* la valeur affiché est 5.1
			 * si k est de type int, il y aura un 
			 * problème, suite à la perte de 
			 * détails du résultat 
			 * en convertissant de double à int */
		}
}
