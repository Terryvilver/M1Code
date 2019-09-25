import java.util.Scanner;

public class Essai{
		public static void main(String[] args)
		{
				Scanner clavier = new Scanner(System.in);
				
				System.out.println("Entrer une valeur entière : ");
				int i =clavier.nextInt();
				
				System.out.println("Le résultat du calcul est " +i*Math.PI);
		}
}
