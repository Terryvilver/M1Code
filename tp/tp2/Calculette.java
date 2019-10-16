package classes;

import java.util.*;

public class Calculette {
		//membres d'instance
		private float entier1;
		private float entier2;
		private float resultat;
		
		/* Constructeur */
		Calculette() {
			entier1 = 0;
			entier2 = 0;
			resultat = 0;
		}
		
		Calculette(float entier1, float entier2) {
			this.entier1 = entier1;
			this.entier2 = entier2;
			this.resultat = 0;
		}
		
		
		/* Setters */ 
		/* Ici je vais uniquement modifier les valeurs de entier1 et entier2.
		 * "Resultat" lui va dépendre des valeurs de entier1 et entier2
		 * donc je ne vais pas crée son Setter.
		 */
		public void setEntier1(float entier1) {
			this.entier1 = entier1;
		}
		
		public void setEntier2(float entier2) {
			this.entier2 = entier2;
		}
		
		/* Getter */
		/* Ici je vais pas crée de getters, je vais plus tard utiliser 
		 * un toString pour afficher la valeur dans mon main.
		 */
		 
		 
		 /* Opérations */
		 public void plus() {
			 resultat = this.entier1 + this.entier2;
		 }
		 
		 public void moins() {
			 resultat = this.entier1 - this.entier2;
		 }
		 
		 public void fois() {
			 resultat = this.entier1 * this.entier2;
		 }
		 
		 public void div() {
			 resultat = this.entier1 / this.entier2;
		 }
		 
		 
		 /* affichage générique */
		 public String toString() {
			 return "le résultat de votre calcul est " + this.resultat; 
		 }
		 
		public static void main(String []args) {
			Scanner scan = new Scanner(System.in);
			Calculette TI82 = new Calculette();
			float v1,v2; char op ;String operation;
			
			//Saisie des opérande
			System.out.print("Entrer le premier entier: "); 
			v1 = scan.nextFloat();
			TI82.setEntier1(v1);
			
			scan.nextLine();
			
			
			//Comme nextChar() n'existe pas, on passe par une methode alternatif.
			System.out.print("Quel opération voulez-vous effectuer('+' '-' '*' '/'): ");
			operation = scan.nextLine();
			op = operation.charAt(0);
			
			System.out.print("Entrer le second entier: "); 
			v2 = scan.nextFloat();
			TI82.setEntier2(v2);
			
			switch(op) {
				case '+': TI82.plus(); break;
				case '-': TI82.moins(); break;
				case '*': TI82.fois(); break;
				case '/': TI82.div(); break;
				default: break;
			}
			
			System.out.println(TI82);

			
		}
}
