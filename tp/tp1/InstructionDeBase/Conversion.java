/*Écrire un programme qui transforme un prix donné en euro en un prix 
 * en dollar. Vous saisirez le prix en
 * euro et le taux de change euro/dollar.
 */

 //ajout de texte
 //ici j'ai rajouté "ajouté de texte" en fusionnant la branche "test" avec ma branche "master"
 import java.util.Scanner;
 
 public class Conversion{
		public static void main(String []args){
			Scanner scan = new Scanner(System.in);
			double montant; //montant en euros
			double montant2; //montant en dollar
			
			System.out.println("Entrez le montant à convertir.");
			montant = scan.nextDouble();
			montant2 = montant * 1.22;
			
			System.out.println(montant + "€ = " + montant2 + "$");
		}
}
